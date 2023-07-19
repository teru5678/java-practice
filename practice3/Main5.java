public class Main5 {
    public static void main(String[] args) { // 1~9まで繰り返す
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i * j); // 掛け算の結果を出力
                System.out.println(" ");
            }
            System.out.println(" ");
        }
    }
}