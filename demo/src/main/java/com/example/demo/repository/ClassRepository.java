package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.form.Clazz;
import com.example.demo.form.Student;

@Repository
public class ClassRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Clazz> findAll() {
        String sql = "SELECT * FROM classes";
        List<Clazz> classes = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Clazz.class));

        for (Clazz clazz : classes) {
            String studentSql = "SELECT * FROM students WHERE class_id = ?";
            List<Student> students = jdbcTemplate.query(studentSql, new BeanPropertyRowMapper<>(Student.class), clazz.getId());
            clazz.setStudents(students);
        }

        return classes;
    }
}
