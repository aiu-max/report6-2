package jp.ac.uryukyu.ie.e195761;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class HitTest {

    @org.junit.jupiter.api.Test
    void hit() {

        String num = "1970";
        Pattern p = Pattern.compile("^\\d{3}$"); //数字を三桁の整数にするための正規表現
        Matcher m = p.matcher(num);
        assertEquals(m.find(),false);

    }
}