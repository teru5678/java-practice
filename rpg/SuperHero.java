public class SuperHero extends Hero {
    boolean fflying;

    // 飛ぶ
    public void fly() {
        this.name = true;
        System.out.println("飛び上がった!");
    }

    // 着地する
    public void land() {
        this.name = false;
        System.out.println("着地した！");
    }
}