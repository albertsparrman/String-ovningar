import com.sun.xml.internal.fastinfoset.util.CharArray;

import javax.swing.*;

public class Uppgift1 {
    public static void main(String[] args) {
        String ord = "fortnite";
        int i = 0;
        String bak = "";
        char[] ordChar = ord.toCharArray();
        char[] bakChar = bak.toCharArray();

        while (true){
            bakChar[ord.length()-i] = ordChar[i];
            if (i < ord.length()){
                break;
            }
            i = i + 1;
        }
        System.out.println(bak);
    }
}
