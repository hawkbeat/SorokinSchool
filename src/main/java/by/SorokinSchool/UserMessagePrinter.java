package by.SorokinSchool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMessagePrinter {

    private final UserMessageService userMessageService;

    @Autowired
    public UserMessagePrinter(UserMessageService userMessageService) {
        this.userMessageService = userMessageService;
    }

    public void printMessage(String name) {
        System.out.println("Привет, " + name + ", добро пожаловать!");
    }
}
