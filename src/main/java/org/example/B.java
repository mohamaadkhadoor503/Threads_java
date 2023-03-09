package org.example;

public class B implements Runnable {
    ReentranlockClass s;

    public B(ReentranlockClass s) {
        this.s = s;
    }

    @Override
    public void run() {
        s.print(10);
    }
}
