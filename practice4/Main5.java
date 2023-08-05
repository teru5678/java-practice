package practice4;

public class Main5 {
    public static void main(String[] args) {
        int[] seq = new int[10];
        // 塩基配列をランダムに生成
        for (int i = 0; i < seq.length; i++) {
            // 1~4の乱数を生成
            seq[i] = new java.util.Random().nextInt(4);
        }
        // 生成した塩基配列の記号を表示
        for (int i = 0; i < seq.length; i++) {
            char[] base = { 'A', 'T', 'G', 'C' };
            System.out.print(base[seq[i]] + " ");
        }
    }
}