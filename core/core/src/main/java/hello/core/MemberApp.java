package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.impl.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        Appconfig appconfig = new Appconfig();
        MemberService memberService = appconfig.memberService();

        Member member = new Member(1L, "memberA", Grade.VIP);
        Member member1 = new Member(2L, "memberB", Grade.VIP);
        memberService.join(member);
        memberService.join(member1);

        Member findMember = memberService.findMember(1L);
        Member findMember1 = memberService.findMember(2L);
        System.out.println("new member = " + member.getName());
        System.out.println("new member = " + member1.getName());
        System.out.println("find member = " + findMember.getName());
        System.out.println("find member = " + findMember1.getName());
    }
}
