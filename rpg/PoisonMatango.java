package rpg;

public class PoisonMatango extends Matango {
    int poisonCount = 5;

    public PoisonMatango(char suffix) {
        super(suffix);
    }

    public void attack(Hero h) {
        super.attack(h);
        if (poisonCount > 0) {
            System.out.println("さらに毒の胞子をばらまいた！");
            int hit = h.hp / 5;
            h.hp -= hit;
            System.out.println(hit + "ポイントのダメージ");
            this.poisonCount--;
        }
    }
}