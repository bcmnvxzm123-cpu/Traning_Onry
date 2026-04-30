package Java_File;
public class Animal {
    private String name;            // 名前
    private String proper_noun;     // 固有名詞
    private int hp;                 // 耐久力
    private int size;               // 大きさ
    private String sex;               // 性別

    public  Animal(String name,String proper_noun,int hp,int size,String sex){

        this.name = name;
        this.proper_noun = proper_noun;
        this.hp = hp;
        this.size = size;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getProper_noun() {
        return proper_noun;
    }

    public void setProper_noun(String proper_noun) {
        this.proper_noun = proper_noun;
    }
    
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
}