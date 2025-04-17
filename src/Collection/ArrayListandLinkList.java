package Collection;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListandLinkList {
    private static final int size = 1000;

    public static void main(String[] args) {
       // khoi tao linkedlist and arraylist
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // them phan tu vao cuoi danh sach
       long startTime = System.nanoTime();
        for (int i = 0; i<size; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("thoi gian them " + size + " phan tu vao cuoi danh sach Arraylist: " + (endTime - startTime)/1000000 + " ms");

        startTime = System.nanoTime();
        for(int i = 0; i < size; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("thoi gian them " + size + " phan tu vao cuoi linkedlist: " + (endTime - startTime)/1000000 + " ms");
        System.out.println(" --");

        // them phan tu vao dau danh sach
        startTime = System.nanoTime();
        for(int i = 0; i< size; i++  ) {
            arrayList.add(0, i); // them vao vi tri 0
        }
        endTime = System.nanoTime();
        System.out.println("thoi gian them " + size + " phan tu vao dau arraylist: "+ (endTime - startTime)/1_000_000 + " ms" );

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedList.add(0,i);
        }
        endTime = System.nanoTime();
        System.out.println("thoi gian them " + size + " phan tu vao dau linkedlist " + (endTime - startTime)/1_000_000 + " ms");
        System.out.println(" --");

        // truy cap ptu o giua danh sach
        startTime = System.nanoTime();
        arrayList.get(size/2);
        endTime = System.nanoTime();
        System.out.println("thoi gian truy cap ptu o giua arraylist: " + (endTime - startTime)/1_000 + " ms");

        startTime = System.nanoTime();
        linkedList.get(size/2);
        endTime = System.nanoTime();
        System.out.println("thoi gian truy cap ptu o giua linkedlist: " + (endTime - startTime)/1_000 + " ms");
    }
}
//  a resizable array that can grow or shrink as needed. the elements are stored in contiguous memory location