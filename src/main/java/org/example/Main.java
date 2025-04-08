package org.example;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Object> sdfs = List.of("sdfs", 'd', "fwefwwe", 1, 23, 432L);
        System.out.println(sdfs);
        int check = new Check11().a();


        System.out.println(check);
        // Advance Multithreading
//
//        Runnable thread1= ()->{
//            System.out.println("Run thread 1");
//            System.out.println(Thread.currentThread());
//            System.out.println(Thread.currentThread().getName());
//            System.out.println(Thread.currentThread().getState());
//            System.out.println(Thread.currentThread().isAlive());
//        };
//
//        Thread threadObj= new Thread(thread1,"Check");
//
//        threadObj.start();

        System.out.println("kjyiugk");

        System.out.println(Main.class.toString());

        Map<Integer,String> map= new HashMap();
        map.put(1,"sfsf");
        map.get(1);

        Map map1= new HashMap();
        map1.put(1,"sfsf");
        map1.get(1);

        System.out.println(map1.get(1).getClass());


        List<Product> products = Arrays.asList(
                new Product(101, "Laptop", 1200.99),
                new Product(102, "Smartphone", 899.49),
                new Product(103, "Headphones", 199.99),
            new Product(104, "Mouse", 67689789798.99)
        );

        // Sorting based on Comparable (Price)
        Collections.sort(products);

        System.out.println("Products sorted by Price (Default):");
        for (Product p : products) {
            Collections.sort(products,(p1,p2)->p1.name.compareTo(p2.name));
            System.out.println(p);
        }
        System.out.println(products);
        ArrayList<Integer> arrayList =new ArrayList<>();

        File file = new File("fjjhkhbkbk");


    }

    public void  getData(){
        try {
            FileReader fileReader =new FileReader("hbhj");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
