package com.mybatistraining;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemJPA extends JpaRepository<Item, Long> {
}
