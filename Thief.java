public class Thief {
    String name;
    int hp;
    int mp;

    public Thief(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = hp;
    }

    public Thief(String name, int hp) {
        this(name, 5);
        this.hp = 35;
    }

    public Thief(String name) {
        this(name, 40);
    }
}