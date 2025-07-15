package org.example.Config;

import org.example.Entity.User;
import org.springframework.context.annotation.*;

@Configuration
public class MyConfig {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    @Scope("singleton")
    @Lazy
    public User user(){
        return new User();
    }

}

