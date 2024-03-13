package org.HMB;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Factorial {
    private static Logger log = LoggerFactory.getLogger(Factorial.class);

    private static final int MIN_VALUE = 1;
    private static final int BASIC_RESULT = 1;
    private static final int STEP = 1;

    public long factorial(long n) {
        if (n <= MIN_VALUE) {
            log.info("Basic STEP!");
            return BASIC_RESULT;
        } else {
            log.info("Recursion call for {}", n);
            return factorial(n - STEP) * n;
        }
    }

    public long factorial(long n, int step) {
        if (n <= MIN_VALUE) {
            log.info("Basic STEP!");
            return BASIC_RESULT;
        } else {
            log.error("Recursion call for {}", n);
            return factorial(n - step, step) * n;
        }
    }
}
