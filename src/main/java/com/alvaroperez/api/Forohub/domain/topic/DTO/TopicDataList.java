package com.alvaroperez.api.Forohub.domain.topic.DTO;

import com.alvaroperez.api.Forohub.domain.response.Response;
import com.alvaroperez.api.Forohub.domain.topic.Course;
import com.alvaroperez.api.Forohub.domain.topic.Topic;
import com.alvaroperez.api.Forohub.domain.user.User;

import java.time.LocalDateTime;
import java.util.List;

public record TopicDataList(Long id, String title, String message, LocalDateTime creationDate, User author,
                            Course course, List<Response> responses) {
    public TopicDataList(Topic topic) {
        this(topic.getId(), topic.getTitle(), topic.getMessage(), topic.getCreationDate(), topic.getAuthor(), topic.getCourse(), topic.getResponses());
    }
}
