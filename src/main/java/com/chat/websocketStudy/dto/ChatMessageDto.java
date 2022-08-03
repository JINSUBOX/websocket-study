package com.chat.websocketStudy.dto;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
public class ChatMessageDto {
    public enum MessageType{
        ANONYMOUS, REAL_NAME
    }

    private MessageType type;
    private String from;
    private String to;
    private String text;
}
