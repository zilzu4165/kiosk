package me.zilzu.kiosk;

public class UserSaveRequest {
    Integer age;
    String name;

    public UserSaveRequest(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserSaveRequest{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
