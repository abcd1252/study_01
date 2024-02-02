package com.ohgiraffers.section04.logical;

public class Application01 {

    public static void main(String[] args) {

        /*수업목표 논리 연산자에 이해와 활용
            필기.
                논리 연산자
                논리값을 취급하는 연산자이다
                논리연산자 종류
                1. 논리 연결 연산자.- 두개의 피연산자를 가지는 이항 연산자이며, 연산자의 결합 방향은 왼족에서 오른쪽
                두개의 논리식을 판단여 참과 거짓을 판명한다.
                    1-1 && - 두개의 논리식 모두 참일 경우 참을 반환, 둘 중 하나라도 거짓이면 거짓을 반환.
                    1-2 || - 두개의 논리식 중 둘 중 하나라도 참일 경우 참을 반환, 둘 다 거짓이면 거짓을 반환.
         */

        System.out.println("true 와 true의 논리 and 연산 : " + (true && true));
        System.out.println("true 와 false의 논리 and 연산 : " + (true && false));
        System.out.println("false 와 true의 논리 and 연산 : " + (false && true));
        System.out.println("false 와 false의 논리 and 연산 : " + (false && false));


        System.out.println("true 와 true의 논리 and 연산 : " + (true || true));
        System.out.println("true 와 false의 논리 and 연산 : " + (true || false));
        System.out.println("false 와 true의 논리 and 연산 : " + (false || true));
        System.out.println("false 와 false의 논리 and 연산 : " + (false || false));

        // 필기. 논리 부정 연산자
        //  ! (논리 not) 논리식의 결과가 참이면

        System.out.println( !true );
        System.out.println(!false);



    }

}
