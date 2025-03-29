// Employee record  Duplicate employee records  remove duplicate records
package org.example;

// two sorted arrays - merging two sorted arrays - should not use additional memory space
public class MergingTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = new int[8]; //  {5, 13, 17};
        a[0] = 5;
        a[1] = 13;
        a[2] = 17;

        int[] b = new int[4]; // {3, 7, 11, 19}
        b[0] = 3;
        b[1] = 7;
        b[2] = 11;
        b[3] = 19;

        int aleng = a.length;
        int bleng = b.length;

        System.out.println(aleng + ", " + bleng);
   /*
        for(int i = 3 ; i < a.length -1   ; i++){
            int elementb = b[i-3];
            a[i] = elementb;
            //System.out.println(elementb);
        }
        for(int i = 0 ; i < a.length   ; i++){
            int elementa = a[i];
            System.out.println(elementa);
        }
        */
        int k = 0;


       /* if( b[j] > a[i] ) {
            //swapElements()
            a[a.length+b.length - 2 - k ] = b[j];
            k++;
            a[a.length+b.length - 2 - k ] = a[i];
            k++;
        }
        */

       // for(int i =  2 ; i >= 0; i--) {
           for(int j =  3 ;  j>=0  ; j--){
               if(j>0)
                if( b[j] > a[j-1] ) {
                    //swapElements()
                    a[3+4 - 1 - k ] = b[j];
                    k++;
                    a[3+4 - 1 - k ] = a[j-1];
                    k++;
                } else {
                    a[3+4 - 1 - k ] = a[j-1];
                    k++;
                    a[3+4 - 1 - k ] =  b[j];
                    k++;
                }
               else
                   a[0] = b[0];
            /// }
        }
     //a[] = { 0 1 2 3 4 5 6 7 }
        /*for(int i = 0 ; i < a.length   ; i++){
            int elementa = a[i];
            System.out.println(elementa);
        } */

        for(int v : a){
            System.out.println(v);
        }
    }
}
