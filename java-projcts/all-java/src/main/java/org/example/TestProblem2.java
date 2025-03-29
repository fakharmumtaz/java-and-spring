package org.example;

import java.util.ArrayList;
import java.util.List;

public class TestProblem2 {
    public static class TestProblem {
        public  static  void main(String[] arg){

           /* while (true) {
                System.out.println("You want to continue:" );
                char c = System.scan();
                if(c=='q'){
                    System.exit();
                }

            }*/

            int[] arr = new int[10];
            int[] doorsArr = {2, 4, 6, 1, 2, 9, 8, 3, 5, 10} ;
            for(int i = 0; i < arr.length  ; i++){
                arr[i] = i+1;
                System.out.println(arr[i]  + "\t");
            }
            System.out.println("All the doors by number: ");
            showArr(arr);

            for(int i = 0 ; i < arr.length; i++){
                int door = doorsArr[i];
                arr = reduceTheDoor(arr, door);
                //if (true) break;
            }

            System.out.println("remaining doors .... ");
            showArr(arr);

        }

        private static void showArr(int[] arr) {
            for(int i = 0 ; i < arr.length -1 ; i++){
                System.out.println(arr[i]);
            }
        }

        public static int[] reduceTheDoor(int[] arr, int index ) {
            int[] newArr = new int[arr.length-1] ;

            for(int i = 0 ; i < arr.length - 1 ; ){
                if (i != index) {
                    newArr[i] = arr[i];
                    i++;
                }
            }

            return newArr;
        }
    }

    public static class TestProblem1 {
        public static void main(String [] arg ){
            String[] anagramList = {"eat", "tea", "ton", "ate", "not", "bat"};
            group(anagramList);
            /*int num = 23455;
            int[] arr = new int[(num+"").length()];
            int arrlen = arr.length;
            for(int i = 0; i < arrlen ; i++){
                int remainder = num % 10 ;
                int quotient = num / 10 ;
                arr[i] = remainder ;
                num = quotient ;
            }

            //for(int i = 0 ; arr; )
            for(int j = 0 ; j < arr.length ; j++)
                System.out.println( arr[j] );
             */
        }
         //aet , aet not aet not abt
    /*    Input: ["eat", "tea", "ton", "ate", "not", "bat"]
        Output:
                [
                ["ate","eat","tea"],
                ["not","ton"],
                ["bat"]
                ]
     */

        public static List<List<String>> group(String[] strs) {
            List<List<String>> temp = new ArrayList<>() ;
            List<String> anagrampList = new ArrayList<>();
            for(String s : strs){
                String sorted = "";
                for(int i = 0 ; i < s.length(); i++) {
                    char c = s.charAt(i);
                }
            }
            return  temp;
        }
    }
}
