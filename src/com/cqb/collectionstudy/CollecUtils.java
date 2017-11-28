package com.cqb.collectionstudy;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by chengqb22020 on 2017/10/18.
 */
public class CollecUtils {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Set<String> colSet = new HashSet<>();
        colSet.add("程启斌");
        colSet.add("诸葛");
        colSet.add("程威");
        colSet.forEach(obj->System.out.println("该用户是："+obj));
        String s="程启斌";
        String s1= URLEncoder.encode(s, "gbk");
        System.out.println(s1);
    }
}
