package practice6;

public class Calc {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int total = practice6.CalcLogic.tasu(a, b);
        int delta = practice6.CalcLogic.hiku(a, b);
        System.out.println("足すと" + total + "、引くと" + delta);
    }
}