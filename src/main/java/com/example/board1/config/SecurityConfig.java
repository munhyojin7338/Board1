package com.example.board1.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig  {

    @Bean
    protected SecurityFilterChain configure(HttpSecurity http) throws Exception {

        http.csrf().disable();

        http.formLogin().disable();

        http.headers().frameOptions().sameOrigin();

        http.authorizeHttpRequests()
                .anyRequest().permitAll();


        return http.build();
    }

}
