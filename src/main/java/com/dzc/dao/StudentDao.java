package com.dzc.dao;

import com.dzc.entity.Student;

public interface StudentDao {
    Student findStudentById(int idCard);
}
