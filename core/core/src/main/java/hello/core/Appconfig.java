package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.impl.FixDiscountPolicy;
import hello.core.discount.impl.RateDiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.impl.MemberServiceImpl;
import hello.core.member.impl.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.impl.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Appconfig {

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }
    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(discountPolicy(), memberRepository());
    }
    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
    @Bean
    public DiscountPolicy discountPolicy(){
        // return new RateDiscountPolicy();
         return new FixDiscountPolicy();
    }
}
