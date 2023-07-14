public class Main4 {
    public static void main(String[] args) {
        float f = 3;
        double d = f;
        System.out.println(f);
        System.out.println(d);
        // 小さい型から大きい方に代入することができる。その逆はできない（エラーになってしまう）

        int age = (int) 3.2;
        // (変換先の型名)式で強制的に型変換できる
        System.out.println(age);
    }

}