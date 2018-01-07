package com.dzc.entity;

import lombok.Data;

import java.util.List;

@Data
public class Student {
    private int id;
    private String idCard;
    private String name;
    private List<Course> courseList;
    private int deleteFlag;

    public Student() {}

    public Student(int id, String idCard, String name, List<Course> courseList, int deleteFlag) {
        this.id = id;
        this.idCard = idCard;
        this.name = name;
        this.courseList = courseList;
        this.deleteFlag = deleteFlag;
    }
}
