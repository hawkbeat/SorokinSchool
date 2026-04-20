package by.SorokinSchool;

import org.springframework.stereotype.Component;

@Component
public class UserMessageService {

    private String name;

    public String createMessage(String name) {
        this.name = name;
        return name;
    }


}

