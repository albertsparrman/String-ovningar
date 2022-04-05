import com.sun.xml.internal.fastinfoset.util.CharArray;

import javax.swing.*;
import java.util.Scanner;

public class Uppgift1 {
    public static void main(String[] args) {

        String ord = JOptionPane.showInputDialog("skriv");
        int a = ord.length()-1;
        int b = 0;
        char[] ordChar = ord.toCharArray();
        char[] bakChar = ord.toCharArray();

        while (b <= a){
            bakChar[a-b] = ordChar[b];
            b = b + 1;
        }
        System.out.println(bakChar);
    }
}
