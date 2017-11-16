package com.dadrm;

public class MavenReleaseDemo {
        public static void main(String[] args) {
                System.out.println("Maven release version demo");
                System.out.println(MavenReleaseDemo.class.getPackage().getImplementationVersion());
        }
}
