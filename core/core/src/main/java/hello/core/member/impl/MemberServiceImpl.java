package hello.core.member.impl;

import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;

public class MemberServiceImpl implements MemberService {

    // final MemberRepository memberRepository = new MemoryMemberRepository();
    private final MemberRepository memberRepository;

    // Appconfig에서 관리하여 주입
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
