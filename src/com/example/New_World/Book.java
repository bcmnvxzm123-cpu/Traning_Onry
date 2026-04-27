public class Book {
    String name;// 名前
    String author;// 著者
    int hp;// 耐久力
    int size;// 大きさ
    int price;// 値段

    public Book(String name,String author,int hp,int size,int price){

        // ローカル変数↓
        this.name = name;
        this.author = author;
        this.hp = hp;
        this.size = size;
        this.price = price;
    }
}
