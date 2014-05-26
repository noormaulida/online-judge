/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package addrev;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    public static long rev(long a) {
        long sum=0;
        while(a>0) {
            sum=sum*10+a%10;
            a=a/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        try {
            // TODO code application logic here
            int n;
            int i;
            long x;
            long y;
            long z;
            long res;
            Scanner scan = new Scanner(new BufferedInputStream(System.in));
            n = scan.nextInt();
            for (int j = 0; j < n; j++) {
                //while(scan.hasNext()) {
                    x = scan.nextLong();
                    y = scan.nextLong();
                    z = rev(x)+rev(y);
                    res=rev(z);
                    System.out.println(res);
                //}
            }
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
