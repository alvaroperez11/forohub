package com.alvaroperez.api.Forohub.domain.response.DTO;

import com.alvaroperez.api.Forohub.domain.topic.Topic;
import com.alvaroperez.api.Forohub.domain.user.User;

import java.time.LocalDateTime;

public record ResponseDataResponse(
        Long id,
        String message,
        Topic topic,
        LocalDateTime creationDate,
        User author,
        String solution
) {
}
