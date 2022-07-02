package com.epam.rd.autotasks;
class LoopStatements {
    public static int task1(int n) {
        int sum = 0;
        if (n>0) {
         int number1 = 0;
         String digit = n + "";
         for (int i = 0; i < digit.length(); i++) {
             number1 = digit.charAt(i) - '0';
             if (number1%2!= 0) {
                 sum = sum + number1;}}
         } return sum;
     }
}
