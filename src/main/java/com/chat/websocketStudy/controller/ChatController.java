package com.chat.websocketStudy.controller;


import com.chat.websocketStudy.dto.ChatMessage;
import com.chat.websocketStudy.dto.ChatMessageDto;
import com.chat.websocketStudy.service.ChatService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
@RequiredArgsConstructor
@Slf4j
public class ChatController {

    private final ChatService chatService;

    @MessageMapping("/sendMessage")
    @SendTo("/sub/api/chat")
    public ChatMessageDto chat(@Payload ChatMessageDto chatMessage) {
        return chatService.saveChatMessageToDB(chatMessage);
    }

}
