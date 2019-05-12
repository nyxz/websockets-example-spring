package net.badowl.websocketsexamplespring;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatEndpoint {

    @MessageMapping("/message")
    @SendTo("/topic/messages")
    public ChatMessage resendMessage(final ChatMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return message;
    }

}
