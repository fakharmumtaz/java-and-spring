package com.javalogic.misc;
//public class L {}
public class TemperatureMonitor {
    public static String analyzeTemperatures(Object readings) {
        return switch (readings) {
            case int[] temperatures when temperatures.length >= 3 && temperatures[0] > 40 ->
                    "High temperatures recorded.";
            case int[] temperatures when temperatures.length == 2 && temperatures[1] <= 20 ->
                    "Moderate temperatures recorded.";
            case int[] temperatures when temperatures.length == 1 ->
                    "Insufficient data.";
            default -> "Invalid readings.";
        };
    }

    public static void main(String[] args) {
        System.out.println(analyzeTemperatures(new int[]{42, 38, 45}));
        System.out.println(analyzeTemperatures(new int[]{30, 18}));
        System.out.println(analyzeTemperatures(new int[]{45}));
        System.out.println(analyzeTemperatures(new int[]{}));
    }
}
