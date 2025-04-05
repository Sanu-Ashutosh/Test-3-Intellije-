package org.example;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {


    public static void printTable(int n,String name, int age) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {

//            System.out.println(n + " * " + i + " = " + n * i);
            String json = """
                 "name": "%s",
                 "age": %d
                 """.formatted(name,age);


            System.out.println(json);

            Thread.sleep(500);
        }
    }

    public static void main(String[] args) {

//        try {
////            printTable(2);
////        } catch (InterruptedException e) {
////            throw new RuntimeException(e);
////        }
////        try {
////            printTable(3);
////        } catch (InterruptedException e) {
////            throw new RuntimeException(e);
////        }

        new Thread(() -> {
            try {
                printTable(2,"sanu",31);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

         new Thread(() -> {
            try {
                printTable(3,"sipu",678);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        Map<Object, Object> hashMap = new HashMap<>();

    }
}
