package com.danke.javaSe;


/**
 * @author: wangrui
 * @Date: 2018/12/12 14:59
 */
public class Test {
    public static void main(String[] args) {
        StringDemo();
    }
    /**
     * 基本类型对应的引用类型源码解析
     */
    /**
     * String 的源码解析
     * StringBuilder StringBuffer
     */
    public static void StringSource() {
        StringBuffer sb = new StringBuffer();
        sb.append("a");
        sb.append("a");
        sb.append("a");
        sb.append("a");
        sb.append("a");
        new Thread(() -> System.out.println("线程一" + new String(sb))).start();
        sb.append("c");
        sb.append("c");
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sb.append("c");
        sb.append("c");
        System.out.println("线程二" + new String(sb));
        Pattern pattern = Pattern.compile("a");
    }
    public static void StringDemo(){
        String temp="aaa";
        String temp2="aaa";
        String temp3 = new String("aaa");
        String temp4 = temp3.intern();
        System.out.println(temp==temp2);
        System.out.println(temp==temp3);
        System.out.println(temp==temp4);
    }

    /**
     * 集合的源码解析
     * list
     * map
     *
     */
    /**
     * Math的源码解析
     *
     */

}
