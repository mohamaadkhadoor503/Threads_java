package org.example;

public class Main {
    public static void main(String[] args) {

     A a=new A();
     Thread t1=new Thread(new Runnable() {
         @Override
         public void run() {
             try {
                 a.work1();
             } catch (Exception e) {
                 throw new RuntimeException(e);
             }
         }
     });
     Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    a.work2();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

     t1.start();
     t2.start();
    }
}