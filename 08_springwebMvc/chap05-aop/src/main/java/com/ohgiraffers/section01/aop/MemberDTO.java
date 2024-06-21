package com.ohgiraffers.section01.aop;

public class MemberDTO {

    private  Long id;

    private  String name;

    public MemberDTO() {
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

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

    public MemberDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
