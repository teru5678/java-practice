package rpg;

public class Hero {
    String name;// 名前の宣言
    int hp;// HPの宣言

    public void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は、眠って回復した！");
    }

    public void sit(int sec) {
        this.hp += sec;// 何秒座るか引数で受け取る
        System.out.println(this.name + "は、" + sec + "秒座った！");
        System.out.println("HPが" + sec + "ポイント回復した！");
    }

    public void slip() {
        this.hp -= 5;
        System.out.println(this.name + "は、転んだ！");
        System.out.println("5のダメージ");
    }

    public void run() {
        System.out.println(this.name + "は、逃げ出した！");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは" + this.hp + "でした");
    }

    public Hero(String name) {
        this.hp = 100;
        this.name = name;
    }

    public Hero() {
        this("ダミー");// 同一クラスの別コンストラクタを呼び出せる
    }
}