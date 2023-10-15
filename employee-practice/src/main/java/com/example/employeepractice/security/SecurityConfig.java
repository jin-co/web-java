package com.example.employeepractice.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
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
        JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);

//        jdbcUserDetailsManager.setUsersByUsernameQuery(
//                "select id, pw, active from members where id=?"
//        );
//        jdbcUserDetailsManager.setAuthoritiesByUsernameQuery(
//                "select id, role from where id=?"
//        );

        return jdbcUserDetailsManager;
    }

//    @Bean
//    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
//        UserDetails john = User.builder()
//                .username("john")
//                .password("{noop}1234")
//                .roles("EMPLOYEE")
//                .build();
//        UserDetails tom = User.builder()
//                .username("tom")
//                .password("{noop}1234")
//                .roles("EMPLOYEE", "MANAGER")
//                .build();
//        UserDetails jack = User.builder()
//                .username("jack")
//                .password("{noop}1234")
//                .roles("EMPLOYEE", "MANAGER", "ADMIN")
//                .build();
//        return new InMemoryUserDetailsManager(john, tom, jack);
//    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(config ->
                config
                        .requestMatchers(HttpMethod.GET, "/api/employees").hasRole("EMPLOYEE")
                        .requestMatchers(HttpMethod.GET, "/api/employees/**").hasRole("EMPLOYEE")
                        .requestMatchers(HttpMethod.POST, "/api/employees").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.PUT, "/api/employees").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.DELETE, "/api/employees/**").hasRole("ADMIN")
        );
        http.httpBasic(Customizer.withDefaults());
        http.csrf(csrf -> csrf.disable());
        return http.build();
    }
}
