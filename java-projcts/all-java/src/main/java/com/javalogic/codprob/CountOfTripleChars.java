package com.javalogic.codprob;

// Write a Java program to count the number of triples (characters appearing three times in a row)
//in a given string. [Monday 2:18 PM] Ankit Goel "aaab" -> 1 , "bbb" -> 1 , "aaabbb" -> 2 , "aaabbbcc" -> 2 , "aaabbbccc" -> 3
public class CountOfTripleChars {
    public static void main(String[] args) {
        String str = "aabaaaaabbbccccaa";
        char[] cArr = str.toCharArray();
        int count = 0;
        //char prevC ;
        char[] a = new char[1];
        System.out.println(a);
        //Map<String, Integer> map = new HashMap<>();
        char c, c1, c2 ;
        //System.out.println("c="+c +", c1=" +  c1 + ", c2=" + c2);
        if(cArr!= null && cArr.length >= 3){
            for(int i = 0; i < cArr.length; i++){
                c = cArr[i];
                if(i+1 < cArr.length)
                    c1 = cArr[i+1];
                else
                    c1 = ' ';
                if(i+2 < cArr.length)
                    c2 = cArr[i+2];
                else
                    c2 = ' ';

                System.out.println("c="+c +", c1=" +  c1 + ", c2=" + c2);
                //if(new String(c).equals(new String(c1))  && new String(c1).equals(new String(c2))) {
                if( (int)c == (int)c1 && (int)c1 == (int)c2 && (int)c != ' ') {
                    count++;
                    i+=2;
                    System.out.println("--------------------");
                }

            }
        }

        System.out.println(count);

    }
}