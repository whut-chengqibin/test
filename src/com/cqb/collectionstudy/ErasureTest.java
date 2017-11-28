package com.cqb.collectionstudy;

/**
 * Created by chengqb22020 on 2017/10/23.
 */
class Apple<T extends Number>{
    T size;
    public Apple(){

    }
    public Apple(T size){
        this.size = size;
    }

    public T getSize() {
        return size;
    }

    public void setSize(T size) {
        this.size = size;
    }
}
public class ErasureTest {
    public static void main(String[] args){
        Apple<Integer> a = new Apple<>(5);
        Apple b = a;
        Number num1 = b.getSize();
        System.out.println(num1);
        Integer num2 = a.getSize();
        System.out.println(num2);
    }
}
