package com.example;

import java.util.Random;

public class Animal {
    String name;            // 名前
    String proper_noun;     // 固有名詞
    int hp;                 // 耐久力
    int size;               // 大きさ
    String sex;               // 性別

    public  Animal(String name,String proper_noun,int hp,int size,int price,String sex){

        // ローカル変数↓
        this.name = name;
        this.proper_noun = proper_noun;
        this.hp = hp;
        this.size = size;
        this.sex = sex;
    }

    public void show(Random rnd,Animal ani) {
        int i = rnd.nextInt();

        System.out.println(hp);



    }






}