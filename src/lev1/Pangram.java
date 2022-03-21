package lev1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int n=scanner.nextInt();
        String string = scanner.next();

        System.out.println(isPangram(n,string));
    }

    private static String isPangram(int size,String string){
        string=string.toLowerCase();
        Set<Character> characters= new HashSet<>();
        if(size < 26)
            return "NO";
        for (int i = 0; i <size ; i++) {
            characters.add(string.charAt(i));
        }

        if(characters.size()<26)
            return "NO";

        return "YES";
    }
}
