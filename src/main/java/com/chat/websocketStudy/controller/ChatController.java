package com.chat.websocketStudy.controller;


import com.chat.websocketStudy.dto.ChatMessageDto;
import com.chat.websocketStudy.service.ChatService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Controller;


@Controller
@Slf4j
@RequiredArgsConstructor
public class ChatController {
    private final ChatService chatService;
    private final SimpMessageSendingOperations messageSendingOperations;


/*

*/

}
