package org.example;

public class Main {
    public static void main(String[] args) {

     ReentranlockClass s=new ReentranlockClass();
     A a=new A(s);
     B b=new B(s);
     Thread t1=new Thread(a);
     Thread t2=new Thread(b);
     t1.start();
     t2.start();
    }
}