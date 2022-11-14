package com.oti;

public class VersioningDemo {
    public static void main(String args[]) {
        System.out.println("The World Is Mine");
        System.out.println();
        System.out.println("This program is running version "+
                VersioningDemo.class.getPackage().getImplementationVersion());
    }
}
