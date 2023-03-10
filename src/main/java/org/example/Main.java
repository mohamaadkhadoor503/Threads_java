package org.example;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService es= Executors.newFixedThreadPool(2);
     A a=new A();
     Thread t1=new Thread(a) ;
        Thread t2=new Thread(a) ;
        Thread t3=new Thread(a) ;
        Thread t4=new Thread(a) ;


        ArrayList<Thread>list=new ArrayList<>();
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        for (Thread t:list){
es.submit(t);        }
}}