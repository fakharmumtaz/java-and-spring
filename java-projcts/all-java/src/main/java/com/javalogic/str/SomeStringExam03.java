package com.javalogic.str;

public class SomeStringExam03 {
    //strip(), stripLeading(), stripTrailing()
    public static void main(String[] args)
    {
        try
        {
            String str = "  uy   hgg   ";
            String str1 = "\"" +str+"\"";
            System.out.println( "str=" + str1 + ", ; str.strip() = \"" +str.strip() +"\"");
            System.out.println( "str=" + str1 + ", ; str.stripLeading() = \"" +str.stripLeading() + "\"" );
            System.out.println( "str=" + str1 + ", ; str.stripTrailing() = \"" +str.stripTrailing() + "\"" );
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}