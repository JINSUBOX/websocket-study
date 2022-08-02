package com.chat.websocketStudy.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ChatMessage {
    public enum MessageType{
        ANONYMOUS, REAL_NAME
    }

    private MessageType type;
    private String roomId;
    private String sender;
    private String receiver;
    private String message;
}
