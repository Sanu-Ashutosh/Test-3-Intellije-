package org.example;

public class Check11 {

    public int a() {
        System.out.println("a");
        e();

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
