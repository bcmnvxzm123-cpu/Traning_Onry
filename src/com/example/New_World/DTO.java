public class DTO {
    private String name = "";
    private int hp;
    private int attack;

    public String getName() {// 文字列の変数を渡します。　そんな私はgetDTOという名前のメソッドです。
        return name;        // 変数nameの箱の中身を渡します。
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }
    public  void setHp(int hp) {// Mainクラスで呼び出されて使用されたときに戻り値としてこのメソッドが処理を受け取りこのフィールドに変数を代入する。
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }




}
