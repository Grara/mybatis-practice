package com.mybatistraining;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberJPA extends JpaRepository<Member, Long> {
}
