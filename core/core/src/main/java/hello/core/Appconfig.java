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

public class Appconfig {
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }



    public OrderService orderService(){
        return new OrderServiceImpl(discountPolicy(), memberRepository());
    }

    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

    public DiscountPolicy discountPolicy(){
        // return new RateDiscountPolicy();
         return new FixDiscountPolicy();
    }
}
