import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        System.out.print("[メニュー] 1:検索 2:登録 3:削除 4:変更>");
        Scanner scanner = new java.util.Scanner(System.in);

        int selected = scanner.nextInt();
        scanner.close();
        switch (selected) {
            case 1:
                System.out.println("検索します");
                break;
            case 2:
                System.out.println("登録します");
                break;
            case 3:
                System.out.println("削除します");
                break;
            case 4:
                System.out.println("変更します");
                break;
        }
    }
}
/*
 * 条件分岐が多い場合switch文を使用したほうがコードが見やすくなる
 * Scannerに対してcloseメソッドを使用しないとエラーになってしまう
 */