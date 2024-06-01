//package ex.str;
//
////import java.io.IOException;
//import java.util.Arrays;
//import java.util.List;
//import java.util.function.Predicate;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//public class LinesExam01 {
//    public static void main(String[] args)   {
//
//        Path filePath = Files.writeString(Files.createTempFile(tempDir, "demo", ".txt"), "Sample text");
//        String fileContent = Files.readString(filePath);
//
//        List<String> sampleList = Arrays.asList("Java", "\n \n", "Kotlin", " ");
//        List withoutBlanks = sampleList.stream()
//                .filter(Predicate.not(String::isBlank))
//                .collect(Collectors.toList());
//
//        String multilineString = "  Baeldung helps   \n \n developers \n explore Java.   ";
//        List<String> mlines = multilineString.lines()
//                .filter(line -> !line.isBlank())
//                .map(String::strip)
//                .collect(Collectors.toList());
//        System.out.println(mlines);
//
//        try
//        {
//            String str = " A \n B \n C \n D \r dfd";
//            Stream<String> lines = str.lines();
//            lines.forEach(System.out::println);
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//    }
//}