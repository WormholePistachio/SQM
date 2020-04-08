package org.itstack.test;

import org.itstack.sqm.asm.probe.ProfilingAspect;

import java.util.ArrayList;
import java.util.List;

/**
 * -noverify -javaagent:E:\itstack\git\github.com\WormholePistachio\SQM\target\SQM-1.0-SNAPSHOT.jar
 * -javaagent:/Users/fuzhengwei/itstack/git/github.com/SQM/target/SQM-1.0-SNAPSHOT.jar
 * 解决方案：
 * 我是JDK1.8所以在启动JVM参数加：  -noverify   （1.8没有-XX:-UseSplitVerifier 这参数）
 * JDK1.7在启动JVM参数加：  -XX:-UseSplitVerifier
 */
public class ApiTest {


    private List<String> parameterTypeList = new ArrayList<String>() {{
        add("xxx");
    }};

    public static void main(String[] args) throws InterruptedException {
        ApiTest apiTest = new ApiTest();
        //int i = apiTest.strToInt("111");
//        String res01 = apiTest.queryUserInfo(111, 17, "对象类");
//        System.out.println("测试结果：" + res01 + "\r\n");
//        String res02 = apiTest.queryUserInfoList("花花", 17, 20190103991L);
//        System.out.println("测试结果：" + res02 + "\r\n");
    }

//    public void echoHi() throws InterruptedException {
//        for (int i = 0; i < 10000; i++) {
//            new StringBuffer(i);
//        }
//        logger.info("Hi ServerQualityMonitor!");
//    }

//    public String queryUserInfo(int uId, int age, String req) {
//        Integer.parseInt("aaa");
//        return "你好，bugstack虫洞栈 | 精神小伙！";
//    }

    //
//    public Integer strToInt2(String str) {
//        return Integer.parseInt(str);
//    }

    public Integer strToInt1(String str) {
        return Integer.parseInt(str);
    }

//    public int strToInt3(String str) {
//        long var2 = System.nanoTime();
//        Object[] var4 = new Object[]{str};
//        int var5 = Integer.parseInt(str);
//        ProfilingAspect.point(var2, 1, var4, var5);
//        return var5;
//    }

//    public String queryUserInfoList(String name, int age, long number) throws InterruptedException {
//        Thread.sleep(100);
//        return name + ":" + age + ":" + number;
//    }
//
//
//    public void queryUserInfoObj(int uId, int age) throws InterruptedException {
//        Thread.sleep(100);
//    }

    //
//
//    public void queryUserInfoObj3(Integer uId, Integer age, int[] req) throws InterruptedException {
//        Thread.sleep(100);
//        //        ProfilingAspect.point(1000L, "", "", var2);
//        logger.info("查询用户信息，用户Id：{}", uId);
//    }
//
//    //
//    public void queryUserInfoObj4(boolean a, char b, byte c, short d, int e, float f, long j, double h) {
////        Object[] var2 = new Object[]{a, b, c, d, e, f, j, h};
//    }
//


//    @Test
//    public void test_desc() {
//        String desc = "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;IJ[I[[Ljava/lang/Object;Lorg/itstack/test/Req;)Ljava/lang/String;";
//
//        Matcher m = Pattern.compile("(L.*?;|\\[{0,2}L.*?;|[ZCBSIFJD]|\\[{0,2}[ZCBSIFJD]{1})").matcher(desc.substring(0, desc.lastIndexOf(')') + 1));
//
//        while (m.find()) {
//            String block = m.group(1);
//            System.out.println(block);
//        }
//
//    }


}
