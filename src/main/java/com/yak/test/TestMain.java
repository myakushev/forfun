package com.yak.test;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("Hellow World!");
        System.out.println("1st concurrent");
        System.out.println("2nd concurent");
        System.out.println("Begin working in 3rd branch");

        TestsMethods tm = new TestsMethods();
        int res = tm.summ(11,67);
        System.out.println("Res = " + res);
    }
}
