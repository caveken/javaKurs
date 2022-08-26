package javaKurs.day44_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C05_LinkedList_DequeDataTuru {
    public static void main(String[] args) {
        Deque<String> ll4=new LinkedList<>();
        ll4.add("cavidan");
        ll4.add("tevfik");
        ll4.add("mesut");
        ll4.add("tevfik");
        ll4.add("emre");
        ll4.add("tevfik");
        ll4.removeLastOccurrence("tevfik");
        System.out.println(ll4);

        ll4.pop();
        System.out.println(ll4);
    }
}
