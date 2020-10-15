package cfa;

import java.util.Scanner;

/**
 * Link of the problem : https://codeforces.com/contest/731/problem/A
 * Description : Embosser is a special devise that allows to "print"
 * the text of a plastic tape. Text is printed sequentially, character
 * by character. The device consists of a wheel with a lowercase English
 * letters written in a circle, static pointer to the current letter and
 * a button that print the chosen letter. At one move it's allowed to rotate
 * the alphabetic wheel one step clockwise or counterclockwise. Initially,
 * static pointer points to letter 'a'.
 * After Grigoriy add new item to the base he has to print its name on the
 * plastic tape and attach it to the corresponding exhibit. It's not required
 * to return the wheel to its initial position with pointer on the letter 'a'.
 *
 * @author Najat EL HABTI
 */
public class NightAtTheMuseum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nameOfExhibit = scanner.nextLine();

        char pointer='a';
        int minNumberOfRotations = 0;
        
        for(int i=0;i<nameOfExhibit.length();i++){
            int difference=Math.abs(nameOfExhibit.charAt(i)-pointer);

            if( difference > 13)
                minNumberOfRotations += 26-difference;
            else
                minNumberOfRotations += difference;


            pointer =nameOfExhibit.charAt(i);
        }

        System.out.println(minNumberOfRotations);
    }
}
