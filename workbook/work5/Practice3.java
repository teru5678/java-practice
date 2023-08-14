package workbook.work5;

public class Practice3 {

    public static void main(String[] args) {
        String address = "test@email.com";
        String text = "今日は、暑いですね";
        email(address, text);
    }

    public static void email(String address, String text) {
        System.out.println(address + "にメールを送信しました");
        System.out.println("件名：無題");
        System.out.println("本文" + text);
    }
}