package rpg;

public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero("ミナト"); // 勇者を生成
        System.out.println(h1.name);
        Hero h2 = new Hero();
        System.out.println(h2.name);
    }
}