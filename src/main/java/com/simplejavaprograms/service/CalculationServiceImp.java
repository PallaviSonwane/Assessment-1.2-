package com.simplejavaprograms.service;


import org.springframework.stereotype.Service;


@Service
public class CalculationServiceImp implements CalculationService{

    int count=0,rem,r=0,temp,rev=0,f=1;
    @Override
    public int square(int no) {
        return no*no;
    }

    @Override
    public int cube(int no) {
        return no*no*no;
    }

    @Override
    public String EvenOrOdd(int no) {
        return (no%2==0)?"number is even":"number is odd";
            
        }

    @Override
    public String primeNo(int no) {
        for(int i=2;i<no;i++){
            if(no%i!=0){
            count++;
            }
        }
        return (count==1)?"number is prime":"number is not prime";
    }

    @Override
    public String amstrongNo(int no) {
        temp=no;
        while(no!=0){  //153
            rem=no%10;  //3
            no=no/10;
            r=(rem*rem*rem)+r;
        }
            return (temp==r)?"number is amstrong":"number is not amstrong";
    }

    @Override
    public String palidromeNo(int no) {
        rev=0;
        temp=no;
        while(no!=0){
            rem=no%10;
            no/=10;
            rev=rem+rev*10;
        }
        return (rev==temp)?"Number is palindrome":"Number is not palindrome";
    }

    @Override
    public int factorialNo(int no) {
        for(int i=1;i<=no;i++){
            f=f*i;
        }
        return f;
    }

    @Override
    public int reverseNo(int no) {
        rev=0;
        while(no!=0){
            rem=no%10;
            no/=10;
            rev=rem+rev*10;
        }
        return rev;
    }

    public void performAllCalculations(int no) {
        Thread squareThread = new Thread(() -> System.out.println("Square is: " + square(no)));
        Thread cubeThread = new Thread(() -> System.out.println("Cube is: " + cube(no)));
        Thread evenOddThread = new Thread(() -> System.out.println(EvenOrOdd(no)));
        Thread primeThread = new Thread(() -> System.out.println(primeNo(no)));
        Thread armstrongThread = new Thread(() -> System.out.println(amstrongNo(no)));
        Thread palindromeThread = new Thread(() -> System.out.println(palidromeNo(no)));
        Thread factorialThread = new Thread(() -> System.out.println("Factorial is: " + factorialNo(no)));
        Thread reverseThread = new Thread(() -> System.out.println("Reverse Number is: " + reverseNo(no)));

        squareThread.start();
        cubeThread.start();
        evenOddThread.start();
        primeThread.start();
        armstrongThread.start();
        palindromeThread.start();
        factorialThread.start();
        reverseThread.start();

      
    }
}

  

