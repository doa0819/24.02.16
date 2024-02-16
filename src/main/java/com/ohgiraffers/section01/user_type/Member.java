package com.ohgiraffers.section01.user_type;

public class Member {

    /* 필기.
    *   지금까지 우리는 클래스 내부에 메소드만 작성을 했었다.
    *   하지만 클래스 내부에는 메소드를 작성하지 않고 바로 변수를 선언할 수 있다.
    *   이건을 전역변수(필드 == 인스턴스변수 == 속성) 이라고 부른다.
    *   // 전역변수 : 메소드를 작성하지 않고 바로 선언을 할 경우 한 class 에서 다 사용이 가능하다.
    *   //  지역변수 : 지역안에 있는 변수는 서로 에게 영향을 미치지 않는다.
    *
    * */

    // 아래는 전역변수(,id,pwd ...)들 이고 회원정보를 다 가능
    String id;
    String pwd;
    String name;
    int age;
    char gender;
    String[] hobby;

}
