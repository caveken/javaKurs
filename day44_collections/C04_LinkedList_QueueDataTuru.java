package javaKurs.day44_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedList_QueueDataTuru {
    public static void main(String[] args) {
        Queue<String> ll3=new LinkedList();
        ll3.add("adem");
        ll3.add("zeynep");
        ll3.add("hpolat");
        ll3.add("kadir");

        System.out.println(ll3);

        System.out.println("ll3.remove() = " + ll3.remove());
        System.out.println(ll3);

        System.out.println("ll3.remove(\"hpolat\") = " + ll3.remove("hpolat"));
        System.out.println(ll3);

        System.out.println("ll3.element() = " + ll3.element());

        System.out.println("ll3.peek() = " + ll3.peek());

        Queue<String> ll4=new LinkedList();

        System.out.println("ll4.peek() = " + ll4.peek());// null döndürür
        //System.out.println("ll4.element() = " + ll4.element()); //throw exception NoSuchElementException

        ll3.offer("ali");
        System.out.println(ll3);
        //ll4.offer(" ");
        System.out.println(ll4);

        System.out.println("ll3.poll() = " + ll3.poll());
        System.out.println(ll3);

        System.out.println("ll4.poll() = " + ll4.poll());
        System.out.println(ll4);


    }
}
