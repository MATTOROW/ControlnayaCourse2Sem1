package ru.itis.oriscontrolnaya.models;

public class SportEquipment {
    private long id;
    private String name;
    private String params;
    private int age;
    private String conditions;

    public SportEquipment(long id, String name, String params, int age, String conditions) {
        this.id = id;
        this.name = name;
        this.params = params;
        this.age = age;
        this.conditions = conditions;
    }

    public SportEquipment(String name, String params, int age, String conditions) {
        this.name = name;
        this.params = params;
        this.age = age;
        this.conditions = conditions;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }
}
