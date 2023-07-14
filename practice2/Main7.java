public class Main7 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        // 大きい方の数値を代入する命令
        int m = Math.max(a, b);
        System.out.println("比較実験：" +
                a + "と" + b + "とで大きい方は•••" + m);
        String age = "31";
        int n = Integer.parseInt(age);
        System.out.println("あなたは来年、" + (n + 1) + "歳になりますね。");
    }
}