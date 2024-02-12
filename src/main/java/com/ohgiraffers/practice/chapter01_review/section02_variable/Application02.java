package com.ohgiraffers.practice.chapter01_review.section02_variable;

public class Application02 {

    public static void main(String[] args) {

        // 수업목표. 변수를 선언하고 값을 할당하여 사용할 수 있다.

        /* 필기.
        *   자료형은 크게 기본자료형(Primary type)과 참조자료형(Reference type)으로 나누어진다.
        * */

        // 필기. 기본자료형(Primary type) 8가지

        // 목차. 1-1-1. 정수를 취급하는 자료형 4가지
        byte bnum;      // 1byte
        short snum;     // 2byte
        int inum;       // 4byte
        long lnum;      // 8byte

        // 목차. 1-1-2. 실수를 취급하는 자료형 2가지
        float fnum;     // 4byte
        double dnum;        // 8byte 중요. float 이 더 큰 값인 줄 알았는데 double 이 더 큰 거였음,,

        // 목차. 1-1-3. 문자를 취급하는 자료형 1가지
        char ch;      // 2byte

        /* 중요. 자동형변환 참고
        *   byte -> short -> int -> long -> float -> double
        *           char  ->
        * */

        // 목차. 1-1-4. 논리값을 취급하는 자료형
        boolean isTrue;     // 1byte

        // 필기. 이상 8가지를 기본자료형(Primary type)이라고 한다.

        // 목차. 1-2. 문자열을 취급하는 자료형
        String str;     // 4byte(엄밀히 말하면 주소값은 4byte 정수형이다.)

        // 필기. 이것은 참조자료형(Reference type)!!!

        // 목차. 2. 변수에 값을 대입한다. (값 대입 및 초기화)
        // 목차. 2-1. 정수를 취급하는 자료형에 값 대입
        bnum = 1;
        snum = 2;
        inum = 4;
        lnum = 8L;      // 중요. 뒤에 L을 붙여야 한다.

        // 목차. 2-2. 실수를 취급하는 자료형에 값 대입
        fnum = 4.0f;     // 중요. 실수 형태의 값 뒤에 f 붙이기.
        dnum = 8.0;

        // 목차. 2-3. 문자를 취급하는 자료형에 값 대입
        ch = 'a';
        ch = 97;        // 중요. 'a'가 숫자이므로 숫자로 저장해도 a 가 나온다.
        System.out.println((char)97);       // 오 이렇게도 되네 신기해

        // 목차. 2-4. 논리를 취급하는 자료형에 값 대입
        isTrue = true;
        System.out.println("====================isTrue=================");
        System.out.println(isTrue);
        isTrue = false;
        System.out.println("====================isTrue=================");
        System.out.println(isTrue);

        // 목차. 2-5. 문자열을 취급하는 자료형에 값 대입
        str = "안녕하세요";


    }

}
