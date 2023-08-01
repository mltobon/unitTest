package org.example.domain.models;

import org.example.domain.enums.Role;

public class User {
    private String name;
    private String id;
    private Role role;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", role=" + role +
                '}';
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User(String name, String id, Role role) {
        this.name = name;
        this.id = id;
        this.role = role;
    }


}
