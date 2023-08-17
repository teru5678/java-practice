package cleric;

import cleric.Cleric;

public class Cleric {
    String name;
    int hp = 50;
    final int MAX_HP = 50;
    int mp = 10;
    final int MAX_MP = 10;

    public void selfAid() {
        System.out.println(this.name + "はセルフエイドを唱えた！");
        this.hp = this.MAX_HP;
        this.mp -= 5;
        System.out.println("HPが最大まで回復した!");
    }

    public int pray(int sec) {
        this.mp += sec;
        System.out.println(this.name + "は、" + sec + "秒祈った！");
        int heal = new java.util.Random().nextInt(3) + sec;
        int healActual = Math.min(this.MAX_MP - this.mp, heal);
        this.mp += healActual;
        System.out.println("MPが" + healActual + "回復した！");
        return healActual;
    }
}