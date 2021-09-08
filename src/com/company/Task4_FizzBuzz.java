package com.company;

public class Task4_FizzBuzz {

    public static void main(final String [] args) {
        ChangeFizzBuzz();
    }

    public static void ChangeFizzBuzz(){
        for(int i = 1; i <= 100;i++){
            if( i%3== 0 && !(i %5 == 0))
                System.out.print(" Fizz ");
            else if(i %5 == 0 && !(i%3== 0))
                System.out.print(" Buzz ");
            else if(i %3 ==0 && i %5 == 0)
                System.out.print(" FizzBuzz ");
            else
                System.out.print(i + " ");
        }
    }
}