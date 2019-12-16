package 王家辉.Lvevl1;
    public class Student implements Comparable<Student> {
        private String name;
        private int classnumber;
        private String gender;
        private int age;
        private int schoolnumber;
        public Student(int schoolnumber,String name,String gender,int age,int classnumber){
            this.schoolnumber=schoolnumber;
            this.name=name;
            this.age=age;
            this.gender=gender;
            this.classnumber=classnumber;
        }
        public String toString(){
            return "学号："+schoolnumber+"姓名："+name+"性别："+gender+"年龄："+age+"班级号："+classnumber;
        }
        public int compareTo(Student o) {
            if(this.schoolnumber>o.schoolnumber){
                return 1;
            }
            else if (this.schoolnumber<o.schoolnumber){
                return -1;
            }
            else {
                return 0;
            }
        }
    }

