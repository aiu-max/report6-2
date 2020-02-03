package jp.ac.uryukyu.ie.e195761;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 一人用のヌメロンのコード
 * Mainクラスにて三桁の数字が作成されていてそれを考えていく
 * 標準入力してその数字があるかまた場所は一緒かを判断する
 */
class Hit  {
    public void hit(Character character) {
        while (true) {
            int i = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("数値を入力してください。");
            String num = scanner.next();
            Pattern p = Pattern.compile("^\\d{3}$"); //数字を三桁の整数にするための正規表現
            Matcher m = p.matcher(num);
            if(m.find() == true) { //m.find()はパターンと一致するときtrueを返す
                String array[] = new String[num.length()]; //標準入力を配列として保存していく
                for (i = 0; i < array.length; i++) {
                    array[i] = num.substring(i, i + 1);
                }

                System.out.println(character.player + "が入力した数値は " + num + " です。");

                String array2[] = new String[character.number.length()];
                for (i = 0; i < character.number.length(); i++) {
                    array2[i] = character.number.substring(i, i + 1);
                }

                int ito, bi; //itoはイート、biはバイトの回数を数える
                ito = 0;
                bi = 0;
                for (i = 0; i < num.length(); i++) {

                    for (int e = 0; e < character.number.length(); e++) {
                        if (array[i].equals(array2[e]) && i == e) { // 数字が存在して場所も一緒ならイート
                            System.out.println("1イート");
                            ito += 1;
                        } else if (array[i].equals(array2[e])) { //存在はするが場所は違う
                            System.out.println("1バイト");
                            bi += 1;
                        }

                    }
                }
                String a = Integer.toString(ito);
                String b = Integer.toString(bi); //a,b共にStringに変換
                System.out.println("結果は" + a + "イート" + b + "バイト");
                if (a.equals("3")) {
                    System.out.println(character.player + "の勝利です");
                    break;
                }
            }
            else {
                System.out.println("3桁の数字で入力してください"); //標準入力が正しくない場合
                continue;
            }
        }
    }
}
