package com.dzc.dao;

import com.dzc.entity.Course;

public interface CourseDao {
    Course findCourseById(int courseId);
}
