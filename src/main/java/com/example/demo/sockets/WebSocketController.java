package com.example.demo.sockets;

import com.example.demo.messages.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {
    @MessageMapping("/message")
    @SendTo("/receiver")
    public Message handle(Message message){
        System.out.println(message.getUsername());
        return message;
    }
}
