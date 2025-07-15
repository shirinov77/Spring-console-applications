package org.example.Provider;

import org.springframework.stereotype.Component;

@Component
public class MessageProvider {
    public String getWelcomeMessage() {
        return "Xush kelibsiz Spring Console App'ga.";
    }
}
