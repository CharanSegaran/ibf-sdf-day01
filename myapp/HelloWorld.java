package myapp;

import java.io.Console;
import java.lang.*;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;

//javac --source-path myapp -d classes myapp/*
//java -cp classes my.HelloWorld
//java -c -v -f myapp.jar -e myapp.HelloWorld . (Do classes folder)

public class HelloWorld{
    public static void main(String[] args){
        /*List<String> stringList = new ArrayList<>();
        Console con = System.console();

        for (int i=0; i<5; i++){
        stringList.add(con.readLine());
        }

        System.out.println(stringList.get(3));
        /* */
        // List<String> stringList = new ArrayList<>();
        // stringList.add("Kaka");
        // stringList.add("Buffon");
       
        // Collections.sort(stringList);
        // for(String name:stringList){
        //     System.out.println(name);
        // }

        String inputDataList = "fish,prawns,chicken,tofu";
        Scanner scan = new Scanner(inputDataList).useDelimiter(",");
        while(scan.hasNext()){
            System.out.println(scan.next());
        }
    }
}