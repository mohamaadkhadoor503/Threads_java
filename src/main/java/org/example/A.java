package org.example;

public class A implements Runnable{

    ReentranlockClass s;

    public A(ReentranlockClass s) {
        this.s = s;
    }

    @Override
    public void run() {
        s.print(5);
    }
}
