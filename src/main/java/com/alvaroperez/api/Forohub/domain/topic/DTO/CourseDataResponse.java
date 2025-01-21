package com.alvaroperez.api.Forohub.domain.topic.DTO;

import com.alvaroperez.api.Forohub.domain.topic.CourseCategory;

public record CourseDataResponse(
        Long id,
        String name,
        CourseCategory category
) {
}
