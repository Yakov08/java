package com.company;
import java.lang.*;
public class Main{
    public static void main(String[] args) {
        TestDog d1 = new TestDog("Mike", 2);
        TestDog d2 = new TestDog("Helen", 7);
        TestDog d3 = new TestDog("Bob");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}