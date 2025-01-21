package com.alvaroperez.api.Forohub.domain.topic.DTO;

import com.alvaroperez.api.Forohub.domain.topic.Course;
import com.alvaroperez.api.Forohub.domain.topic.CourseCategory;

public record CourseDataList(Long id, String name, CourseCategory category) {
    public CourseDataList(Course course) {
        this(course.getId(), course.getName(), course.getCategory());
    }
}
