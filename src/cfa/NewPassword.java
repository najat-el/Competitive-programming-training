package cfa;

import java.util.Scanner;

/**
 * Link to the problem : http://codeforces.com/contest/770/problem/A
 *
 * @author Najat EL Habti
 */

public class NewPassword {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int k=scanner.nextInt();

        String password = "";
        char[] letters=new char[k];
        char c='a';

        for (int i = 0; i <k ; i++) {
            letters[i]=c;
            c++;
        }

        int index=0;

        while (password.length()<n){
          if(index>=k)
              index=0;

          password+=letters[index];
          index++;
      }
      System.out.println(password);
      scanner.close();
    }

    /**** a more simple way to do it
     * do {
     *     for(i=0; i<k; i++){
     *         password.append((char)97+i)
     *     }
     * } while(password.size()<n)
     */
}
