package org.example;

public class A {
    Names names=new Names();
    public  void work1() throws  Exception{


    synchronized (names){
        System.out.println("Enter name");
        names.wait();
        System.out.println(names.name);

    }
}
    public  void work2() throws Exception{
        synchronized (names){
            Thread.sleep(500);
names.name=Thread.currentThread().getName();
//names.notify();
            names.notifyAll();
        }
    }
}
