package com.example.jediscache;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@RequiredArgsConstructor
@SpringBootApplication
public class JedisCacheApplication implements ApplicationRunner {

    private final UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(JedisCacheApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }

    @PostConstruct
    public void test(){
        userRepository.save(User.builder().name("greg").email("greg@fastcampus.co.kr").build());
        userRepository.save(User.builder().name("tony").email("tony@fastcampus.co.kr").build());
        userRepository.save(User.builder().name("bob").email("bob@fastcampus.co.kr").build());
        userRepository.save(User.builder().name("ryan").email("ryan@fastcampus.co.kr").build());
    }
}
