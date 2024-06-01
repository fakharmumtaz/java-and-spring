package com.javalogic.codprob;

import java.util.ArrayList;
import java.util.List;


public class MyLinkedList  {

    List<MyLinkedList> addressList = new ArrayList<>();
    MyLinkedList next;
    int numData;

    public MyLinkedList() {

    }

    public void reverse(MyLinkedList myLinkedList){
        MyLinkedList start = myLinkedList;

        //if(start == null )              return;;
        while (start != null ){
          MyLinkedList nodeNext = start.next;

            System.out.print("\t" + nodeNext.numData);
            addressList.add(nodeNext);
            start =nodeNext ;
        }
// 3, 4, 5, 7
// 7, 5, 4, 3
        MyLinkedList start2 = null;
        MyLinkedList start1 = null;
        for ( int i  = addressList.size() - 1 ; i>=0; i-- ) {
             start1 = addressList.get(i);
             if (i-1 >= 0)
             start2 = addressList.get(i-1);

            if(i  == addressList.size() - 1) {
                next = start1;
            }

        }
    }

}
