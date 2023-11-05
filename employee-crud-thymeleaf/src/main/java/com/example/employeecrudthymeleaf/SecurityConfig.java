package com.example.employeecrudthymeleaf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class SecurityConfig {

    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource) {
        return new JdbcUserDetailsManager(dataSource);
    }

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

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests(config ->
                        config
                                .requestMatchers("/").hasRole("EMP")
                                .requestMatchers("/manage/**").hasRole("MAN")
                                .requestMatchers("/system/**").hasRole("ADM")
                                .anyRequest().authenticated()
                ).formLogin(form -> form
                        .loginPage("/login")
                        .loginProcessingUrl("/loginProcess")
                        .permitAll()
                )
                .logout(logout -> logout.permitAll()
                )
                .exceptionHandling(config -> config.accessDeniedPage("/access-denied")
                );
        return httpSecurity.build();
    }
}
