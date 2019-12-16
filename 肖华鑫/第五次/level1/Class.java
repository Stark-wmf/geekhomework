package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Class {
    private String name[] = new String[]{"xhx","wh","jg","krito","mashiro"};
    private String age[] = new String[]{"18","18","18","18","17"};
    private String classNum[] = new String[]{"0301904","0301904","0301904","0301904","0301904",};
    private String sex[] = new String[]{"男","男","男","男","女"};
    private String idNum[] = new String[]{"2019210986","2019210999","2019210945","2019210988","2019210666"};
    ArrayList<String> personInfo =new ArrayList<>();
      public void getInfo(){
          for(int i=0;i<=4;i++){
              personInfo.add("学号："+idNum[i]+";"+"姓名："+name[i]+";"+"班级："+classNum[i]+";"+"年龄："+age[i]+";"+"性别："+sex[i]+";");
              System.out.println("班级："+classNum[i]+";"+"姓名："+name[i]+";"+"学号："+idNum[i]+";"+"年龄："+age[i]+";"+"性别："+sex[i]+";");
          }//for循环输出
          System.out.println(personInfo);//格式字符串输出
          for (String s:personInfo
               ) {
              System.out.println(s);
          }//foreach遍历
      }
      public void sortUp(){
          Collections.sort(personInfo);
          for (int i=0;i<=personInfo.size()-1;i++){
              System.out.println(personInfo.get(i));
          }
      }
      public void sortDown(){
          Collections.sort(personInfo);
          for (int i=personInfo.size()-1;i>=0;i--){
              System.out.println(personInfo.get(i));
          }
      }
      public boolean add(String student){
         return personInfo.add(student);
      }
      public String remove(int n){
           return personInfo.remove(n);
      }

    public ArrayList<String> getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(ArrayList<String> personInfo) {
        this.personInfo = personInfo;
    }

    public String[] getIdNum() {
        return idNum;
    }

    public void setIdNum(String[] idNum) {
        this.idNum = idNum;
    }

    public String[] getClassNum() {
        return classNum;
    }

    public void setClassNum(String[] classNum) {
        this.classNum = classNum;
    }

    public String[] getAge() {
        return age;
    }

    public void setAge(String[] age) {
        this.age = age;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public String[] getSex() {
        return sex;
    }

    public void setSex(String[] sex) {
        this.sex = sex;
    }
}
