package com.ohgiraffers.section03.comparison;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 비교 연산자에 대해 이해하고 활용할 수 있다.
            필기.
                비교연산자.
                비교연산자는 피연산자 사이에서 상대적인 크기를 판단하여  참 혹은 거짓을 반환하는 연산자이다.
                연산자 중 참 혹은 거짓을 반환하는 연산자는 삼항연산자의 조건식이나 조건문의 조건절에 많이 사용된다.
                많이 사용된다는 것은 많이 연습해야 된다는 것이다.

         */

        /*필기.
            비교연산자의 종류
            '==' - 왼쪽의 피연산자와 오른쪽의 피연산자가 같으면 tre 다르면 false 를 반환
            '!-' - 왼쪽의 피연산자와 오른쪽의 피연산자가 다른면 true 다르면 false 를 반환
            > - 왼쪽의 피연산자가 오른쪽의 피연산자 보다 크면 true 아니면 false 를 반환
            >= - 왼쪽의 피연산자가 오른쪽의 피연산자보다 크거나 같으면 true 아니면 false
            < - > 반대 내용
            <= - >= 반대 내용
         */

        // 목차. 1 숫자값 비교

        int inum1 = 10;
        int inum2 = 20;

        System.out.println("============");
        System.out.println( inum1 == inum2 );
        System.out.println( inum1 != inum2 );
        System.out.println( inum1 >= inum2 );
        System.out.println( inum1 <= inum2 );
        System.out.println( inum1 < inum2 );

        char ch1 = 'a';
        char ch2 = 'A';
        System.out.println( ch1 > ch2 );

        System.out.println("=======");
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println( bool1 = bool2 );

        String str1 = "java";
        String str2 = "java";

        System.out.println(str1 == str2);


    }

}
