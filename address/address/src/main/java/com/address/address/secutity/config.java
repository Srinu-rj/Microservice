//package com.address.address.secutity;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class config {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity security) throws Exception {
//        security.csrf(AbstractHttpConfigurer::disable)
//            .authorizeHttpRequests(auth->{
//                   auth.requestMatchers("/http://localhost:7009/swagger-ui/index.html/**").permitAll();
//                   auth.requestMatchers("/api/**").permitAll();
//                   auth.requestMatchers("").permitAll();
//                           auth.anyRequest().authenticated();
//
//                });
//        return security.build();
//    }
//}
