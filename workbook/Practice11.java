package workbook;

import java.util.Scanner;

public class Practice11 {
    public static void main(String[] args) {
        int[] numbers = { 3, 4, 9 };
        System.out.println("1桁の数字を入力してください");
        Scanner scanner = new java.util.Scanner(System.in);
        int input = scanner.nextInt();
        for (int n : numbers) {
            if (n == input) {
                System.out.println("アタリ！");
            }
        }
        scanner.close();
    }
}