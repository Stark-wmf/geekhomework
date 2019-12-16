package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String target = "d:\\java";
        String news = "d:\\c";
    myFile myFile = new myFile(target,news);
    myFile.copyPath(new File(target));
    }
}
