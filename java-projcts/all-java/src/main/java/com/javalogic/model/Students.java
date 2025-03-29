package com.javalogic.model;

import java.util.Arrays;
import java.util.List;

public class Students {
    private final int Age;
    private final String Name;
    private final String className;

    public Students(int age,String Name,String className){
        this.Age=age;
        this.Name=Name;
        this.className=className;
    }
    public String getName(){
        return Name;
    }
    public String toString(){
        return "Student Name:"+this.Name;
    }

    public String getClassName(){
        return className;
    }
    public int getAge(){
        return Age;
    }
    public static List<Students> students(){
        Students first=new Students(14,"Ali","Blue");
        Students second=new Students(24,"Alina","Pink");
        Students third=new Students(11,"Alisha","Green");
        Students fourth=new Students(35,"Aliam","Pink");
        Students fifth=new Students(10,"Aliza","Green");
        Students std=new Students(21,"Rahat","Parvaiz");
        Students std1=new Students(23,"Babar","Rana");
        Students std2=new Students(23,"Aditya","Palsa");
        List<Students> students=Arrays.asList(first,second,third,fourth,fifth,std,std1,std2);
        return students;
    }
}