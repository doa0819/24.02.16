package com.ohgiraffers.section02.encapsulation.problem3;

public class Monster {

//    String kinds;
//    int hp;
//
//    public void setName(String name) {
//
//        this.name = name;
//
//    }
//
//    public void setHp(int hp){
//
//        if (hp > 0){
//            this.hp = hp;
//        } else {
//            this.hp = 0;
//        }
//    }


    String kinds;           //오류의 양이 점점 줄어 든다 -> 메소드로 나눠서 할시 오류도 줄어들고 사용자들은 오류가 난지 모르지고 개발자 입장에서는 오류가 난게 보인다
    int hp;

    public void setName(String name){

        this.kinds = name;

    }

    public  void setHp(int hp){

        if (hp > 0){
            this.hp = hp;
        }else {
            this.hp = 0;
        }
    }

    public String getInfo(){

        return "몬스터의 종류는 " + this.kinds + "이고, 체력은 " + this.hp + "입니다.";

    }
}
