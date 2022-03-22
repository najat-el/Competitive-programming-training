package lev1;

import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String direction= scanner.next();
        StringBuilder sb= new StringBuilder();
        sb.append(scanner.next());

        String keyboard="qwertyuiopasdfghjkl;zxcvbnm,./";

        int index;

        for (int i = 0; i < sb.length(); i++) {

            index= keyboard.indexOf(sb.charAt(i));

            if(direction.equals("R")) {
                index--;
            }else{
                index++;
            }

            if(index >= keyboard.length())
                index = 0;
            if(index < 0)
                index = keyboard.length()-1;

            sb.setCharAt(i,keyboard.charAt(index));
        }

        System.out.println(sb.toString());
    }
}
