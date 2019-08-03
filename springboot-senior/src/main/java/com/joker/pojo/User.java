package com.joker.pojo;


import javax.validation.constraints.NotBlank;

/**
 * springboot的校验规则
 */
public class User {

    @NotBlank//非空校验
    private String name;
    @NotBlank
    private String password;

    private int age;

    public User() {}

    public User(String name, String password, int age) {

        this.name = name;
        this.password = password;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
