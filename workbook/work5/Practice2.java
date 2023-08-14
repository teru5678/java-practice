package workbook.work5;

public class Practice2 {
    public static void main(String[] args) {
        String title = "お元気ですか";
        String address = "test@example.com";
        String text = "こんにちは、吉田です。お元気ですか";
        email(title, address, text);
    }

    public static void email(String title, String address, String text) {
        System.out.println(address + "にメールを送信しました");
        System.out.println("件名" + title);
        System.out.println("本文" + text);
    }
}