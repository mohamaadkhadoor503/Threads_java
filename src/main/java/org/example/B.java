package org.example;

public class B implements Runnable {
    Sync s;

    public B(Sync s) {
        this.s = s;
    }

    @Override
    public void run() {
        s.print(10);
    }
}
