package com.example;

public class Main_New_World {
    public static void main(String[] args) {
        System.out.println("\nクラスを理解するためにNew Worldを作ろう!\n");

        Human me = new Human("冨永昌毅",100,174,1000);

        Book myFavoriteBook = new Book("むかし僕が死んだ家","東野圭吾",20,30,1500);

        System.out.println(me.name + "の好きな" + myFavoriteBook.name + "は" + myFavoriteBook.author + "作品である");
        System.out.println("値段は" + myFavoriteBook.price + "で" + me.name + "の貯金は");
        System.out.print(me.savings + "円" + "なので残念ですが買えません");

    }
}