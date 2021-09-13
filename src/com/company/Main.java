package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean yes = true;
        boolean no = false;
        int loVal = -999;
        int hiVal = 999;
        double grade = 87.5;
        double amount = 50.0;
        String hello = "world";
/*
        Expression	                                Result
        yes == no || grade > amount                 True
        amount == 40.0 || 50.0                      Error
        hiVal != loVal || loVal < 0                 True
        True || hello.length() > 0                  True
        hello.isEmpty() && yes                      False
        grade <= 100 && !false                      True
        !yes || no                                  False
        grade > 75 > amount                         Error
        amount <= hiVal && amount >= loVal          True
        no && !no || yes && !yes                    False
*/
    }
}
