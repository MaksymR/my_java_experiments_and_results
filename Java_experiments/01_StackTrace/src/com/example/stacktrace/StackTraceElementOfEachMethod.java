package com.example.stacktrace;

/*
 * Each method displays the name of the method that called it.
 */

public class StackTraceElementOfEachMethod {

    public static String getMethodsName() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTraceElements[2];
        System.out.println(element.getMethodName());
        return element.getMethodName();
    }

    public static void getStackTrace() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            System.out.println(element.getClassName() + ": " + element.getMethodName());
        }
    }

    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        return getMethodsName();
    }

    public static String method2() {
        method3();
        return getMethodsName();
    }

    public static String method3() {
        method4();
        return getMethodsName();
    }

    public static String method4() {
        method5();
        return getMethodsName();
    }

    public static String method5() {
        getStackTrace();
        System.out.println();
        return getMethodsName();
    }

}
