package practice4;

public class Main3 {
    public static void main(String[] args) {
        int[] scores = { 20, 30, 40, 50, 80 };
        // 変数を初期化
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            // 1科目ずつ変数sumに合算する
            sum += scores[i];
        }
        int avg = sum / scores.length;
        System.out.println("合計点:" + sum);
        System.out.println("平均点:" + avg);
    }
}