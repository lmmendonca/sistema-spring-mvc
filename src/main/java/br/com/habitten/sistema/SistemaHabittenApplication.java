package br.com.habitten.sistema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SistemaHabittenApplication {

    public static void main(String[] args) {
        SpringApplication.run(SistemaHabittenApplication.class, args);
    }
}
