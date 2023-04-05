package com.mybatistraining;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Member {
    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;
    private String name;
    private int age;

    @OneToMany(mappedBy = "member", cascade = CascadeType.PERSIST)
    private List<Item> items = new ArrayList<>();

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addItem(Item item){
        items.add(item);
        item.setMember(this);
    }
}
