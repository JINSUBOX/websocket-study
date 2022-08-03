package com.chat.websocketStudy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ChatMessage {
    public enum MessageType{
        ANONYMOUS, REAL_NAME
    }

    private com.chat.websocketStudy.dto.ChatMessageDto.MessageType type;
    private String from;
    private String to;
    private String text;

}