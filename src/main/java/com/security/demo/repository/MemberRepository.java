package com.security.demo.repository;


import com.security.demo.domain.entity.Member;
import com.security.demo.mapper.MemberRepositorySupport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositorySupport {

}
