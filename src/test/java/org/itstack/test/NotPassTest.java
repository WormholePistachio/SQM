package org.itstack.test;

public class NotPassTest {

    public static void main(String[] args) {
        System.out.println("");
    }

    public String echoHi(String xx) {
        for (int i = 0; i < 100; i++) {
            new StringBuffer(i);
        }
        System.out.println("Hi ServerQualityMonitor!");
        return "111";
    }

}
