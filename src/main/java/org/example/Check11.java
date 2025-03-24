package org.example;

import java.util.Calendar;

public class Check11 {

    public int a() {
       Calendar c = Calendar.getInstance();
        System.out.println("The Current Date is:" + c.getTime()); 
        return 1;
    }

    public int b() {
        System.out.println("b");

        return 1;
    }

    public int c() {
        System.out.println("c");
        b();
        return 1;
    }

    public int d() {
        System.out.println("d");
        c();
        return 1;
    }

    public int e() {
        System.out.println("e");
        d();
        return 1;
    }
}
