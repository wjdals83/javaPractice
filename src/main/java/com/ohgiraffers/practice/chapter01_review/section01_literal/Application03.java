package com.ohgiraffers.practice.chapter01_review.section01_literal;

public class Application03 {

    public static void main(String[] args) {

        /* 수업목표. 문자열 합치기 결과를 예축하고 사용할 수 있다 */
        /* 목차. 1. 두 개의 문자열 합치기 */
        System.out.println("========================두 개의 문자열 합치기===================");
        System.out.println(9 + 9);            // 값 = 18
        System.out.println("9" + 9);        // 99
        System.out.println(9 + "9");        //99
        System.out.println("9" + "9");      //99

        /* 목차. 2. 세 개의 문자열 합치기 */
        System.out.println("====================세 개의 문자열 합치기=================");
        System.out.println(9 + 9 + "9");        //189
        System.out.println(9 + "9" + 9);        //999
        System.out.println(9 + "9" + 9 + 9);    //9999
        System.out.println(6 + "7" + 8);        //678
        System.out.println("9" + (9 + 9));      //918

        System.out.println("=======================10과 20의 사칙연산 보기 좋게 출력하기===================");
        System.out.println("10과 20의 합 : " + (10 + 20));     //괄호를 묶지 않으면 문자열 합치기가 일어나서 결과가 1020이 된다.
        System.out.println("10과 20의 합 : " + 10 + 20);       //10과 20의 합 : 1020


    }

}
