package com.hainiuxy.Api2;

import java.math.BigDecimal;

//1、BigDecimal
//    构造方法必须用字符串参数的
//    工具类中的乘法和减法
public class Demo01_BigDecimal {
    public static void main(String[] args) {
        //减法
        BigDecimal x = new BigDecimal(4.5);
        BigDecimal y = new BigDecimal(2.2);
        BigDecimal difference = x.subtract(y);
        double value = difference.doubleValue();
        System.out.println(value);
        //乘法
        BigDecimal a = new BigDecimal(2.5);
        BigDecimal b = new BigDecimal(2.5);
        BigDecimal product = a.multiply(b);
        double value1 = product.doubleValue();
        System.out.println(value1);


    }

    /**
     * 定义一个减法的Bigdecimal的方法
     * @param x 被减数
     * @param y 减数
     * @return x-y
     */

    public static double subtract(double x, double y){
        BigDecimal bx = new BigDecimal(String.valueOf(x));
        BigDecimal by = new BigDecimal(String.valueOf(y));
        BigDecimal difference = bx.subtract(by);
        return difference.doubleValue();

}
/**
     * 定义一个乘法的Bigdecimal的方法
  uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu   * @param a 乘数
     * @param b 乘数
     * @return a*b  积
     */
    public static double multiplication(double a, double b){
        BigDecimal ba = new BigDecimal(String.valueOf(a));
        BigDecimal bb = new BigDecimal(String.valueOf(b));
        BigDecimal product = ba.multiply(bb);
        return product.doubleValue();
    }


    }