package com.epam.rd.autotasks;
class LoopStatements {
    public static int task1(int n) {
      int sum = 0;
      while (n>0) {
          if (n%2!=0) {
              sum = sum + n%10;}
          n = n/10;
      } return sum;
    }
}
