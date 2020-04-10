package org.itstack.test;

import org.itstack.sqm.asm.probe.ProfilingAspect;
import org.omg.PortableInterceptor.INACTIVE;

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
//        int i = apiTest.strToInt1("453", 123);
//        System.out.println(i);
//        String res01 = apiTest.queryUserInfo(111, 17, "对象类");
//        System.out.println("测试结果：" + res01 + "\r\n");
//        String res02 = apiTest.queryUserInfoList("花花", 17, 20190103991L);
//        System.out.println("测试结果：" + res02 + "\r\n");
    }

    /**
     * 测试案例01
     * 入参[✖]
     * 出参[✖]
     */
    public void method01() {
        System.out.println("hi bugstack虫洞栈");
    }

    /**
     * 测试案例02
     * 入参[✔]、基本类型[✔]、单一参数[✔]
     * 出参[✖]
     */
    public void method02(int i) {
        System.out.println("hi bugstack虫洞栈 小朋友ID：" + i);
    }

    /**
     * 测试案例03
     * 入参[✔]、对象类型[✔]、单一参数[✔]
     * 出参[✖]
     */
    public void method03(String str) {
        System.out.println("hi bugstack虫洞栈 小朋友ID：" + str);
    }

    /**
     * 测试案例04
     * 入参[✔]、对象类型[✔]、基本类型[✔]、多项参数[✔]
     * 出参[✖]
     */
    public void method04(String name, int id) {
        System.out.println("hi bugstack虫洞栈 小朋友：" + name + " ID：" + id);
    }

    /**
     * 测试案例05
     * 入参[✔]、基本类型覆盖8个[✔]、多项参数[✔]
     * boolean、char、byte、short、int、float、long、double
     */
    public void method06(boolean a, char b, byte c, short s, int i, long l, int ss, long ld, double xx, int mm, int nn, double mmm) {
        System.out.println("hi bugstack虫洞栈 基本类型全覆盖测试");
    }

    /**
     * 测试案例07
     * 入参[✖]
     * 出参[✔]、基本类型[✔]
     */
    public int method07() {
        return 1;
    }

    /**
     * 测试案例08
     * 入参[✖]
     * 出参[✔]、对象类型[✔]
     */
    public String method08() {
        return "hi bugstack虫洞栈";
    }

    /**
     * 测试案例09
     * 入参[✖]
     * 出参[✔]、对象类型[✔]、使用函数[✔]
     */
    public String method09() {
        return String.valueOf(123);
    }

    /**
     * 测试案例10
     * 入参[✔]、对象类型[✔]
     * 出参[✔]、基本类型[✔]
     */
    public int method10(String str) {
        return Integer.parseInt(str);
    }

    /**
     * method11
     * 入参[✔]、基本类型[✔]
     * 出参[✔]、对象类型[✔]
     */
    public String method11(int i) {
        return String.valueOf(i);
    }

    /**
     * method12
     * 入参[✔]、基本类型[✔]、对象类型[✔]
     * 出参[✔]、对象类型[✔]
     */
    public String method12(String str, int i) {
        return String.valueOf(i) + str;
    }

    /**
     * method13
     * 静态方法[✔]
     * 入参[✖]
     * 出参[✔]
     */
    public static String method13() {
        return "hi bugstack冲动栈";
    }

//    public void method05(boolean var1, char var2, byte var3, short var4, int var5,long xx, double var6) {
//        long var8 = System.nanoTime();
//        Object[] var10 = new Object[]{var1, var2, var3, var4, var5, xx,var6};
//
//        try {
//            System.out.println("hi bugstack虫洞栈 基本类型全覆盖测试");
//            ProfilingAspect.point(var8, 0, var10, (Object) null);
//        } catch (Exception var13) {
//            ProfilingAspect.point(var8, 0, var10, var13);
//            throw var13;
//        }
//    }
    
/*
    public String echoHi(String xx) throws InterruptedException {
        *//*for (int i = 0; i < 100; i++) {
            new StringBuffer(i);
        }*//*
        System.out.println("Hi ServerQualityMonitor!");
        return "111";
    }*/

   /* public String echoHi3(String var1) throws InterruptedException {
        long var2 = System.nanoTime();
        Object[] var4 = new Object[]{var1};

        try {
            for(int i = 0; i < 100; ++i) {
                new StringBuffer(i);
            }

            System.out.println("Hi ServerQualityMonitor!");
            String var7 = "111";
            ProfilingAspect.point(var2, 1, var4, var7);
            return var7;
        } catch (Exception var8) {
            ProfilingAspect.point(var2, 1, var4, var8);
            throw var8;
        }
    }*/

//    public String queryUserInfo(int uId, int age, String req) {
//        Integer.parseInt("aaa");
//        return "你好，bugstack虫洞栈 | 精神小伙！";
//    }

    //
//    public Integer strToInt2(String str) {
//        return Integer.parseInt(str);
//    }

//    public static Integer strToInt1(String str, int x) {
//        System.out.println(11);
//        System.out.println(22);
//        int i = 12, j = 2;
//        int m = i + j;
//        System.out.println(m);
//        return Integer.parseInt(str);
//    }

   /* public static int strToInt3(String str, int var1) {
        long var2 = System.nanoTime();
        Object[] var4 = new Object[]{str, var1};

        try {
            System.out.println(11);
            System.out.println(22);
            int i = 12;
            int j = 2;
            int m = i + j;
            System.out.println(m);
            int var9 = Integer.parseInt(str);
            ProfilingAspect.point(var2, 0, var4, var9);
            return var9;
        } catch (Exception var11) {
            ProfilingAspect.point(var2, 0, var4, var11);
            throw var11;
        }
    }
*/

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
