package org.example;

import org.example.Config.AppConfig;
import org.example.Service.GreetingService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        GreetingService greetingService = context.getBean(GreetingService.class);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ismingizni kiriting: ");
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Ism kiritilmadi! Dasturdan chiqildi.");
        } else {
            greetingService.greet(name);
        }

        context.close();
    }
}
