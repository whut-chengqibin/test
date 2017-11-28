package com.cqb.collectionstudy;

import java.io.File;
import java.io.IOException;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * Created by chengqb22020 on 2017/10/20.
 * Set对象的排序，Comparetor
 */
class M{
    private int age;
    public M(int age) {
        this.age = age;
    }
    public String toString(){
        return "M[age:"+age +"]";
    }
    public int getAge(){
        return age;
    }
}
public class sortDemo {
//    public static void main(String[] args) {
//        TreeSet treeSet = new TreeSet((o1, o2) -> {
//            M m1 = (M)o1;
//            M m2 = (M)o2;
//            return m1.getAge()>m2.getAge()?1:m1.getAge()<m2.getAge()?-1:0;
//        });
//        treeSet.add(new M(-5));
//        treeSet.add(new M(1));
//        treeSet.add(new M(-3));
//        System.out.println(treeSet);
//
//        System.out.println((1 << 5) - 1);// 2147483647， 由于优先级关系，括号不可省略
//        System.out.println(~(1 << 31));// 2147483647
//        Map<String,Object>  objectMap = new HashMap<>();
//        Map<String,String> stringMap = new HashMap<>();
//
//
//        objectMap.putAll(stringMap);
//    }
public static void main(String[] args) throws IOException {
    String dir = sortDemo.class.getClassLoader().getResource("").getPath();
    File file = new File(dir,"aa.txt");
    System.out.println(file.getCanonicalPath());
}


}

