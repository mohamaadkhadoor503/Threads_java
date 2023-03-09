package org.example;

public class A implements Runnable{

    Sync s;

    public A(Sync s) {
        this.s = s;
    }

    @Override
    public void run() {
        s.print(5);
    }
}
