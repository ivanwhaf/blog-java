package com.ivan.blog;

class B extends  Object {
    static {
        System.out.println("load B1");
    }
    public B(){
        System.out.println("load B2");
    }
}

class A extends B{
    static {
        System.out.println("load A1");
    }
    public A(){
        System.out.println("load A2");
    }
}
public class Main {
    public static void main(String[] args) {
        new A();
    }
}
