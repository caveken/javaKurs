package javaKurs.day44_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C03_LinkedList_ListDataTuru {
    public static void main(String[] args) {
        LinkedList<String> ll1=new LinkedList();

        List<String> ll2=new LinkedList();// ll2, data türü list list özellikleri tasir

        Queue<String> ll3=new LinkedList();

        Deque<String> ll4=new LinkedList();

        ll2.add("berk");
        ll2.add("done");
        ll2.add("ayse");
        ll2.add("enes");

        System.out.println(ll2);
        ll2.remove(3);//ayse siler ve ayse döndürür
        System.out.println("ll2.remove(\"enes\") = " + ll2.remove("enes"));
        System.out.println(ll2);

        System.out.println("ll2.hashCode() = " + ll2.hashCode());//ll2.hashCode() = -1293728669

    }
}
