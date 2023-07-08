package com.hainiuxy;

import java.util.ArrayList;

/**
 * 添加元素
 * boolean add(E e)
 * // 删除所有元素 清空
 * void clear()
 * // 删除指定的元素 -- 根据equals比较进行匹配，只删除第一个匹配
 * boolean remove(Object o)
 * // 根据条件删除元素 -- 符合条件的全部删除
 * default boolean removeIf(Predicate<? super E> filter)
 * // 判断是否包含指定的元素
 * boolean contains(Object o)
 * // 判断集合是否为空（即集合长度为0）
 * boolean isEmpty()
 * // 获取集合的长度（即元素的个数）
 * int size()
 * // 将集合转换为Obejct数组
 * Object[] toArray()
 * // 将集合转换为指定数据类型的数组
 * <T> T[] toArray(T[] a)
 * // 获取此集合中元素的迭代器
 * Iterator<E> iterator()
 */
public class Demo01_Collection {
    public static void main(String[] args) {
        //引用数据类型的集合
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("hello");
        list.add("hi");
        list.add("haha");
        list.add("heihei");
        //删除所有元素 清空
//        list.clear();
//        System.out.println(list);
        //删除指定
//        list.remove("hi");
//        System.out.println(list);
        // 根据条件删除元素 -- 符合条件的全部删除
//        list.removeIf(t->t.startsWith("w"));
//        System.out.println(list);
        // 判断是否包含指定的元素
//        System.out.println(list.contains("hello"));
//        判断集合是否为空（即集合长度为0）
//        System.out.println(list.isEmpty());
//        获取集合的长度（即元素的个数）  数组的length属性  字符串的length()  集合的size()
//        System.out.println(list.size());
        // 将集合转换为Obejct数组
//        Object[] arr = list.toArray();
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
        // 将集合转换为指定数据类型的数组
//        String[] arr = list.toArray(new String[list.size()]);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);



        }


    }


