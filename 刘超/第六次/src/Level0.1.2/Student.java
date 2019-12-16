package hhh;

public class Student  extends Human{
        private String name;
        private int age;
        private String sex;
        private String number;
        private String appearance;
        private String hair;

        public Student(String name,int  age ,String sex,String number,String appearance,String hair ){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.number = number;
            this.appearance = appearance;
            this.hair = hair;
        }
        public  String getName(){
            return name ;
        }
        public int getAge() {
            return age;
        }
        public String getSex() {
            return sex;
        }
        public String getStudynumber() {
            return number;
        }
        public String getAppearance() {
            return appearance;
        }
        public String getHair() {
            return hair;
        }
        public  void introduce (){
            System.out.println("学生:"+getName()+"\t年龄:"+getAge()+"\t性别:"+getSex()+"\t学号:"+getStudynumber()+"\t外貌:"+getAppearance()+"\t发型:"+getHair());
        }
    }
