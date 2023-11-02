package com.example.employeecrudthymeleaf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        UserDetails john = User.builder()
                .username("john")
                .password(("{noop}1234"))
                .roles("EMP")
                .build();

        UserDetails tom = User.builder()
                .username("tom")
                .password(("{noop}1234"))
                .roles("EMP", "MAN")
                .build();

        UserDetails jack = User.builder()
                .username("jack")
                .password(("{noop}1234"))
                .roles("EMP", "MAN", "ADM")
                .build();
        return new InMemoryUserDetailsManager(john, tom, jack);
    }
}
