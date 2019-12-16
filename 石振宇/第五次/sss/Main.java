package 石振宇.sss;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char x, y;
        Scanner scanner = new Scanner(System.in);
        Classroom classroom = new Classroom();
        classroom.ClassAdd();
        System.out.println("是否添加学生？(输入是或否)");
        x = scanner.next().charAt(0);
        if (x == '是')
        classroom.Add();
        else;
        System.out.println("是否删除学生？(输入是或否)");
        y = scanner.next().charAt(0);
        if (y == '是')
            classroom.Remove();
        else;
        classroom.sort();

    }
}
