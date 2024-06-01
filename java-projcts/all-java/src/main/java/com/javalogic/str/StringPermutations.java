package com.javalogic.str;

public class StringPermutations {
    static int count = 0;
    public static void main(String[] args) {
            String input = "abcde";
            System.out.println(input.substring(5));
            System.out.println(input.substring(2));
            System.out.println(input.substring(1, 3) +"\n-");
            int k=0;
            for(; k < input.length(); k++){
                System.out.println(input.substring(k));
            }
            System.out.println(input.substring(k) + "-");

            input = "abcd";
            generatePermutations(input, "");
            System.out.println("All permutations of " + input + " have been displayed.");
        }

        public static void generatePermutations(String str, String ans) {

            if (str.length() == 0) {
                //count++;
                System.out.println( ++count + "> "+ans);

                return;
            }

            for (int i = 0; i < str.length(); i++) {
           // for (int i = str.length()-1; i >=0 ; i--) {
                char ch = str.charAt(i);
                String a = str.substring(0, i);
                String b = str.substring(i + 1) ;
                String remaining = a + b ;
                String r = ans + ch ;
                //System.out.println("i:"+i+ ", str:" + str+"\t, ans:" + ans+ "\t, A:"+a+", B:"+b+", r:"+r+", remaining:"+remaining);
                generatePermutations(remaining, r);
            }
        }
    }