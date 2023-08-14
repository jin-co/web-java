package com.example.test.singleton;

import com.example.test.AppConfig;
import com.example.test.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonTest {
    @Test
    @DisplayName("DI container")
    void pureContainer() {
        AppConfig appConfig = new AppConfig();
        MemberService memberService1 = appConfig.memberService();
        MemberService memberService2 = appConfig.memberService();
        System.out.println("memberService1 = " + memberService1);
        System.out.println("memberService1 = " + memberService2);
        Assertions.assertThat(memberService1).isNotSameAs(memberService2);
    }

    @Test
    @DisplayName("Singleton")
    void singletonServiceTest() {
        SingletonService instance1 = SingletonService.getInstance();
        SingletonService instance2 = SingletonService.getInstance();
        System.out.println("instance1 = " + instance1);
        System.out.println("instance2 = " + instance2);
        Assertions.assertThat(instance1).isSameAs(instance2);
    }

    @Test
    @DisplayName("Spring Singleton")
    void springContainer() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService1 = ac.getBean("memberService", MemberService.class);
        MemberService memberService2 = ac.getBean("memberService", MemberService.class);
        System.out.println("memberService1 = " + memberService1);
        System.out.println("memberService1 = " + memberService2);
        Assertions.assertThat(memberService1).isSameAs(memberService2);
    }
}
