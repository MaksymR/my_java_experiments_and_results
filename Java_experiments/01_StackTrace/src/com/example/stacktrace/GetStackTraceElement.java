package com.example.stacktrace;

/*
 * The method that prints the name of the class and the method that called it.
 */

public class GetStackTraceElement {

    public static void getLog(String s) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTraceElements[2];
        System.out.println(element.getClassName() + ": " + element.getMethodName() + ": " + s);
    }

    public static void main(String[] args) {
        getLog("in main()");
    }
}
