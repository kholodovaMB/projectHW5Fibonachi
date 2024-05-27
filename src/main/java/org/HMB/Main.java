package org.HMB;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        int value = 20;
        Fibonachi fibonachi = new Fibonachi();
        long startTime, endTime;
        Runtime runtime = Runtime.getRuntime();
        startTime = System.nanoTime();
        int iterativeFibonachi = fibonachi.iterativeFibonachi(value);
        endTime = System.nanoTime();
        long durationIterative = endTime - startTime;
        long memoryIterative = runtime.totalMemory() - runtime.freeMemory();
        log.info("ітераційний {} = {}", value, iterativeFibonachi);
        log.info("Час виконання ітераційного методу: " + durationIterative + " наносекунд");
        log.info("Використання пам'яті: " + memoryIterative + " байт");
        log.info("Часова складність: O(n)\n" +
                "Просторова складність: O(1)");
        log.info("________________");

        startTime = System.nanoTime();
        int recursiveFibonachi = fibonachi.recursiveFibonachi(value);
        endTime = System.nanoTime();
        long durationRecursive = endTime - startTime;
        long memoryRecursive = runtime.totalMemory() - runtime.freeMemory();
        log.info("рекурсивний {} = {}", value, recursiveFibonachi);
        log.info("\nЧас виконання рекурсивного методу: " + durationRecursive + " наносекунд");
        log.info("Використання пам'яті: " + memoryRecursive + " байт");
        log.info("Часова складність: O(2^n)\n" +
                "Просторова складність: O(n)");

        log.info("________________");
        startTime = System.nanoTime();
        int dynamicProgrammingFibonachi = fibonachi.dynamicProgrammingFibonachi(value);
        endTime = System.nanoTime();
        long durationDynamic = endTime - startTime;
        long memoryDynamic = runtime.totalMemory() - runtime.freeMemory();
        log.info("динамічний {} = {}", value, dynamicProgrammingFibonachi);
        log.info("\nЧас виконання динамічного методу: " + durationDynamic + " наносекунд");
        log.info("Використання пам'яті: " + memoryDynamic + " байт");
        log.info("Часова складність: O(n)\n" +
                "Просторова складність: O(n)");
        log.info("________________");
    }
}