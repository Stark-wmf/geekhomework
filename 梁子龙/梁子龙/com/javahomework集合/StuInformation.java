package com.javahomework集合;

import java.util.Comparator;
import java.util.Objects;

public class StuInformation implements  Comparable<StuInformation> {
    private String cla;
    private String name;
    private String id;
    private int age;
    private String sex;

    public String getCla() {
        return cla;
    }

    public void setCla(String cla) {
        this.cla = cla;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public StuInformation(String cla, String name, String id, int age, String sex){
        this.cla=cla;
        this.name=name;
        this.id=id;
        this.age=age;
        this.sex=sex;
    }
    public StuInformation(){
    }


    public int compareTo(StuInformation o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StuInformation)) return false;

        StuInformation that = (StuInformation) o;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "StuInformation{" +
                "cla='" + cla + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}


