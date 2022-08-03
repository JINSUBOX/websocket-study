package com.chat.websocketStudy.dto;

import lombok.Data;
import org.springframework.web.socket.WebSocketSession;

import java.util.HashSet;
import java.util.Set;

@Data
public class ChatRoomDto {
    private String roomId;
    private String roomName;
    private Set<WebSocketSession> sessions = new HashSet<>();

}
