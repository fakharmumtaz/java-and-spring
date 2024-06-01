package com.javalogic.str;

//import java.util.stream.Stream;

public class IsBlankExam02 {
    public static void main(String[] args)
    {
        try
        {
            String str = "   ";
            System.out.println( "str=" + str + ", ; str.isBlank() = " +str.isBlank() );
            System.out.println( "str=" + str + ", ; str.isEmpty() = " +str.isEmpty() );

            str = "";
            System.out.println( "str=" + str + ", ; str.isBlank() = " +str.isBlank() );
            System.out.println( "str=" + str + ", ; str.isEmpty() = " +str.isEmpty() );

            str = "1";
            System.out.println( "str=" + str + ", ; str.isBlank() = " +str.isBlank() );
            System.out.println( "str=" + str + ", ; str.isEmpty() = " +str.isEmpty() );

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}