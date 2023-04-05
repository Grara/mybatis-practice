package com.mybatistraining;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InitRunner implements ApplicationRunner {

    private final MemberJPA memberJPA;
    private final ItemJPA itemJPA;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Item i1 = new Item("dd", 1);
        Item i2 = new Item("ss", 2);

        Member m1 = new Member("노", 10);

        m1.addItem(i1);
        m1.addItem(i2);

        memberJPA.save(m1);
        memberJPA.save(new Member("김", 11));
        memberJPA.save(new Member("준", 12));
    }
}
