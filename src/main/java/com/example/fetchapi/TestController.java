package com.example.fetchapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    long fibonacci(int N) {
        long num1 = 0, num2 = 1;

        int counter = 0;

        // Iterate till counter is N
        while (counter < N) {
            // Swap
            long num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
        return num1;
    }

    @GetMapping("/test")
    Response test() {
        long fibResult = fibonacci(100);
        return new Response(fibResult);
    }
}
