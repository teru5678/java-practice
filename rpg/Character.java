package rpg;

public interface Character {

    void run();
}

/*
 * abstractとすることで抽象クラスにすることができる
 * 抽象メソッドを含むクラスは必ずabstract付きのクラスにしなければならない
 * 抽象クラスの制約としてnewによるインスタンス化が禁止される
 */

/*
 * インターフェース宣言するとpublic abstractを省略できる
 * 
 */