package org.itstack.test;

/**
 * @author wujiuye 2020/04/10
 */
public class AsmAspectTest {


    public static void main(String[] args) throws ClassNotFoundException {
        testAsmAspect();
    }

    public static void testAsmAspect() {
        ApiTest apiTest = new ApiTest();
        apiTest.strToInt1("123445454");
    }

}
