package org.example;



public class Sync {
Object obj=new Object();
    public  void  print(int count) {
        System.out.println("hi");

        synchronized (obj) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(count * i);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        }
    }
    }

