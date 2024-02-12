package com.beebo.beebo_backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@SpringBootApplication
public class BeeboBackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(BeeboBackendApplication.class, args);
	}

//    @Bean
//    CommandLineRunner runner(JournalRepository repository) {
//        return args -> {
//            Journal journal = new Journal("422","69","DracFlow", LocalDateTime.now());
//            repository.insert(journal);
//        };
//    }
}
