package com.chathumal.jsploginandregistration.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * @author Chathumal Jayasingha | [chathumaljayasingha@hotmail.com]
 * @since - 3/25/22 | 2022-March-25[Friday]
 */


@Entity
public class Role {


    private Long id;
    private String name;
    private Set < User > users;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany(mappedBy = "roles")
    public Set < User > getUsers() {
        return users;
    }

    public void setUsers(Set < User > users) {
        this.users = users;
    }




}
