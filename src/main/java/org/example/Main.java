package org.example;


import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(checkForPalindrome("I did, did I?")); // true
        System.out.println(checkForPalindrome("Racecar"));       // true
        System.out.println(checkForPalindrome("hello"));         // false
        System.out.println(checkForPalindrome("Was it a car or a cat i saw ?")); // true


        System.out.println(convertDecimalToBinary(5));   // 101
        System.out.println(convertDecimalToBinary(6));   // 110
        System.out.println(convertDecimalToBinary(13));  // 1101
        System.out.println(convertDecimalToBinary(0));   // 0
    }

    public static boolean checkForPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }


        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();


        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }




        public static String convertDecimalToBinary(int number) {
            if (number == 0) {
                return "0";
            }

            Stack<Integer> stack = new Stack<>();

            // 2’ye bölerek kalanı stack’e at
            while (number > 0) {
                int remainder = number % 2;
                stack.push(remainder);
                number = number / 2;
            }

            // Stack'ten ters sırayla oku
            StringBuilder binary = new StringBuilder();
            while (!stack.isEmpty()) {
                binary.append(stack.pop());
            }

            return binary.toString();
        }


    }


