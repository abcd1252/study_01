package com.ohgiraffers.section02.increment;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. 증감연산자에 대해 이해하고 활용할 수 있다.
            필기.
             증감연산자
             -  피연산자의 앞 or 뒤에 사용이 가능하다.
                ++ - 1증가의 의미
                -- - 1감소의 의미
         */

//        int num = 20;
//        System.out.println("num = " + num);
//
//        num++;
//        System.out.println("num = " + num);
//
//        ++num;
//        System.out.println("num = " + num);
//
//        --num;
//        System.out.println("num = " + num);
//
//        num--;
//        System.out.println("num = " + num);

        // 목차. 증감연산자를 다른 연산자와 함께 사용.- 의미가 달라진다.
        /*
            필기.
                ++num - 피연산자의 값을 먼저 1증가시킨 후 다른 연산을 진행함
                num++ - 다른연산을 먼저 하고 난 뒤 마지막에 피연산자의 값을 1증가시킨다.
         */

//        int firstNum = 20;
//
//        int result1 = firstNum++ * 3;
//
//
//        System.out.println("result1 = " + result1);
//
//        int secondNum = 20;
//        int result2 = ++secondNum * 3;
//
//        System.out.println("result2 = " + result2);
//
//        int result = result1 +1;
//        System.out.println(result);

        int a = 10, b= 20, c =0;


        

        System.out.println(c);

        int num1 = 10;
        int addNum = num1--;

        System.out.println(addNum);
        System.out.println(num1);


        


    }

}
