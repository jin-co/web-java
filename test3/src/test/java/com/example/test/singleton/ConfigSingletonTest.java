package com.example.test.singleton;

import com.example.test.AppConfig;
import com.example.test.member.MemberRepository;
import com.example.test.member.MemberServiceImpl;
import com.example.test.order.OrderServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class ConfigSingletonTest {

    @Test
    void configurationTest() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberServiceImpl memberService = ac.getBean("memberService", MemberServiceImpl.class);
        OrderServiceImpl orderService = ac.getBean("orderService", OrderServiceImpl.class);

        MemberRepository memberRepositoryTest1 = memberService.getMemberRepositoryTest();
        MemberRepository memberRepositoryTest2 = orderService.getMemberRepositoryTest();
        System.out.println("memberRepositoryTest1 = " + memberRepositoryTest1);
        System.out.println("memberRepositoryTest1 = " + memberRepositoryTest2);
        assertThat(memberRepositoryTest1).isSameAs(memberRepositoryTest2);
    }

    @Test
    void configDeep() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        AppConfig bean = ac.getBean(AppConfig.class);
        System.out.println("bean = " + bean.getClass());
    }
}
