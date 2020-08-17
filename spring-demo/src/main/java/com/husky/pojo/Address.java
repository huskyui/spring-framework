package com.husky.pojo;

/**
 * @author huskyui
 * @date 2020/1/10 17:13
 */

public class Address {
    private String path;
    private Integer age;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("com.huskyui.pojo.Address{");
        sb.append("path='").append(path).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        System.out.println(sb.toString());
        return sb.toString();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
