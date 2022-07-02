package com.epam.rd.autotasks;
class LoopStatements {
    public static int task1(int n) {
      int sum = 0;
      int number = 0;
      String digit = n + "";
      for (int i=0; i<digit.length(); i++) {
          number = digit.charAt(i)-'0';
          if (number%2!=0) {
              sum = sum + number;}
      }   return sum;
    }
}
