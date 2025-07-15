package org.example.Service;

import org.example.Provider.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingService {

    private final MessageProvider messageProvider;

    @Autowired
    public GreetingService(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    public void greet(String name) {
        System.out.println("Assalomu alaykum, " + name + "!");
        System.out.println(messageProvider.getWelcomeMessage());
    }
}
