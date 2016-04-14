package com.zz.example;

public class FooBarQixKataMain {

	/**
     * Main program
     * @param args 
     */
    public static void main(String[] args) {
        String[] result = new FooBarQixKata().execute(Constant.MAX_NUMBER_TO_PRINT);
        for (String str : result) {
            System.out.println(str);
        }
    }
}
