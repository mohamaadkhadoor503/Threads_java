package org.example;


import java.util.concurrent.locks.ReentrantLock;

public class ReentranlockClass {
ReentrantLock lock=new ReentrantLock();
    public  void  print(int count) {
        System.out.println("hi");
lock.lock();
      try {
          for (int i = 1; i <= 10; i++) {
              System.out.println(count * i);

              Thread.sleep(500);
          }
      }catch (Exception e) {
                }finally {
         lock.unlock();
      }

        }
    }


