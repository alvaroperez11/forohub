package com.alvaroperez.api.Forohub.domain.topic.DTO;

import com.alvaroperez.api.Forohub.domain.response.Response;
import com.alvaroperez.api.Forohub.domain.topic.Course;
import com.alvaroperez.api.Forohub.domain.user.User;

import java.time.LocalDateTime;
import java.util.List;

public record TopicDataResponse(
        Long id,
        String title,
        String message,
        LocalDateTime creationDate,
        User author,
        Course course,
        List<Response> responses
) {
}
