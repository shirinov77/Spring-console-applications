package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@ToString
@Getter
@Component
public class User {
    @Setter
    private String fullName;
    private Integer age;
    @Setter
    private Car car;

    public User() {
    }

    @Autowired
    public User(Car car) {
        this.car = car;
    }

    public User(String fullName, Car car) {
        this.fullName = fullName;
        this.car = car;
    }

}
