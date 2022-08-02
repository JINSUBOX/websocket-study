package com.chat.websocketStudy.controller;

import com.chat.websocketStudy.dto.ChatMessage;
import com.chat.websocketStudy.dto.ChatRoom;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.util.Random;


@RequiredArgsConstructor
@Controller
public class ChatController {
    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    // 1:1 메세지 발송
    @MessageMapping("/send")
    public void sendMessage(ChatRoom chatRoom, Message<ChatMessage> msg) throws Exception {
        if (msg.getPayload().getType().equals("ANONYMOUSE")) {
            Random random = new Random();
            String anonymous = new String("익명의 커넥터" + random.ints().toString());
            msg.getPayload().setSender(anonymous);
        }
        simpMessagingTemplate.send(chatRoom.getRoomId(), msg);
    }

    // 전체 메세지 발송
    @MessageMapping("/sendAll")
    public void sendAllMessage(Message<ChatMessage> msg) throws Exception {
        simpMessagingTemplate.send(msg);
    }
}
