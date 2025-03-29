package org.example;

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
}
