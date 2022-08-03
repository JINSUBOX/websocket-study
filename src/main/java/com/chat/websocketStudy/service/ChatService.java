package com.chat.websocketStudy.service;

import com.chat.websocketStudy.dto.ChatMessageDto;
import com.chat.websocketStudy.repository.ChatMessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatService {
    private final ChatMessageRepository chatMessageRepository;

    public ChatMessageDto saveChatMessageToDB(ChatMessageDto chatMessageDto) {
        return chatMessageDto;
    }

}