package collection;

import java.util.*;

public class Overview {

    //collections -> group of objects

    //class hierarchy
    //Iterable
    //1 interface can extend another interface (many)
    //1 class can only extend 1 class

    //List implementation
     List<Integer> arrayList = new ArrayList<>();


     List<Integer> linkedList =new LinkedList<>();
     List<Integer> vector = new Vector<>();
     List<Integer> stack = new Stack<>();

     //how HASHSET is implemented
    //every index is a new linkedList
    //each index is called bucket

    //x.insert(10);
    //Hashcode of 10 is calculated
    //10%N
    //N-> no of bucket
    //value (10) goes to bucket which was calculated above

    //Handling duplicates:-
    //find Hashcode of number
    //check in LL, if it exists or No


    //Iterable vs Iterator -> both of them are interfaces

    //Iterable:- has only 1 method -> iterator();
    //interface with single function
    //returned type of iterator(); -> iterator

    //Iterator:- interface that has 2 methods
    //Object next(); ->next element
    //boolean hasNext(); -> whether element present or not






    public static void main(String[] args) {


        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        for (int i:arrayList) {
            System.out.println(i);
        }
    }






}
