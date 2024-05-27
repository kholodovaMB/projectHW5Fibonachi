package org.HMB;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fibonachi {
    private static Logger log = LoggerFactory.getLogger(Fibonachi.class);

    public static int iterativeFibonachi(int n) {
        if (n <= 1)
            return n;

        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }

        return fib;
    }

    public static int recursiveFibonachi(int n) {
        if (n <= 1)
            return n;
        return recursiveFibonachi(n - 1) + recursiveFibonachi(n - 2);
    }

    public static int dynamicProgrammingFibonachi(int n) {
        if (n <= 1)
            return n;

        int[] fibArray = new int[n + 1];
        fibArray[0] = 0;
        fibArray[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }

        return fibArray[n];
    }
}
