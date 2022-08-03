package com.chat.websocketStudy.repository;

import com.chat.websocketStudy.dto.ChatMessage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChatMessageRepository extends MongoRepository<ChatMessage, Long> {
}
