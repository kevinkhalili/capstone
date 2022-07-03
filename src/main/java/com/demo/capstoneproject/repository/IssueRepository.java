package com.demo.capstoneproject.repository;

import com.demo.capstoneproject.model.Issue;
import com.demo.capstoneproject.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface IssueRepository extends JpaRepository<Issue, Long> {

    public List<Issue> findByReturned(Integer returned);

    public Long countByMemberAndReturned(Member member, Integer returned);

}
