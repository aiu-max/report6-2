package jp.ac.uryukyu.ie.e195761;

import java.util.Random;

/**
 * main関数
 * ランダムで100~999までの数字を作成
 * ヌメロンの本体のクラスを呼び出す
 */

public class Main {

    public static void main(String[] args) {
        // write your code here
        Random rand = new Random();
        int n  = rand.nextInt(900) + 100; //100~999までの数字
        String a = Integer.toString(n); //intからStringに変更
        Character character1 = new Character("太郎", a); //インスタンス

        Hit ac = new Hit();
        ac.hit(character1);

    }
}
