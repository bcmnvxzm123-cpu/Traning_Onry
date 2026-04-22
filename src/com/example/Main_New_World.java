package com.example;

import java.util.Random;
import java.util.Scanner;


public class Main_New_World {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        Animal ani = new Animal("猫","不明", 30, 50, 0,"♀");

        boolean isHoliday = false;// 休日フラッグ

        System.out.println("目が覚めました");

        System.out.println("今日は平日ですか？");
        System.out.println("1:YES  2:NO");
        int i = scn.nextInt();

        if (i == 1) {
            System.out.println("今日は平日ですので会社に行きましょう");
        }
        else{
            System.out.println("今日は休日です。何をしますか？");
            isHoliday = false;
        }

        // 会社に行きましょう
        // 着替え→後々クラス化
        System.out.println("着替えましょう");

        boolean ready = false;
        while(ready){

            if (isHoliday) {
                System.out.println("スーツに着替えましょう");
            }
            else{
                System.out.println("私服に着替えましょう");
            }
            System.out.println("着替えれましたか？");
            System.out.println("1:YES  2:NO");
            int j = scn.nextInt();

            if (j == 1) {
                System.out.println("では出発しましょう");
                ready = true;
            }
            else{
                System.out.println("早く着替えましょう");
            }
        }


        if(isHoliday){
            System.out.println("なにで移動しますか？");
            System.out.println("1:徒歩 2:車 3:電車");
            int k = scn.nextInt();

            switch (k) {
                case 1:
                    System.out.println("徒歩を選択しました");
                    break;
                case 2:
                    System.out.println("車を選択しました");
                    break;
                case 3:
                    System.out.println("電車を選択しました");
                    break;
                default:
                    break;
            }
        }
        else{
            System.out.println("電車で行きましょう");
            ani.show();
        }



        


        // 猫がいました撫でて体力を回復しましょう

        // 
        // 
        // 
        // 
        // 
        // イラ立ったので物にあたりましょう
        
        // 
        // 
        // 
        // 
        // 
        // 
        // 
        // 
        // 
        // 
        // 

    }
}