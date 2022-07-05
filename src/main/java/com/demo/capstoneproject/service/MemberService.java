package com.demo.capstoneproject.service;


import com.demo.capstoneproject.model.Member;
import com.demo.capstoneproject.repository.MemberRepository;
import org.aspectj.apache.bcel.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

import static com.demo.capstoneproject.common.Constants.MEMBER_PARENT;
import static com.demo.capstoneproject.common.Constants.MEMBER_STUDENT;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private IssueService issueService;

    public Long getTotalCount(){
        return memberRepository.count();
    }

    public Long getParentsCount(){
        return memberRepository.countByType(MEMBER_PARENT);
    }
    public Long getStudentsCount(){

        return memberRepository.countByType(MEMBER_STUDENT);
    }

    public List<Member> getAll(){
        return memberRepository.findAllByOrderByFirstNameAscMiddleNameAscLastNameAsc();
    }
    public Member get(Long id){
        return memberRepository.findById(id).get();
    }

    public Member addNew(Member member){

        member.setJoiningDate(new Date());
        return memberRepository.save(member);
    }
    public Member save(Member member){

        return memberRepository.save(member);
    }
    public void delete(Member member){

        memberRepository.delete(member);
    }

    public void delete(Long id){
        memberRepository.deleteById(id);
    }

    public boolean hasUsage(Member member){

        return  issueService.getCountByMember(member) > 0;
    }

}
