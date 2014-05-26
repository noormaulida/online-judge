/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package divsum;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 *
 * @author NOOR-MAULIDA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int result[] = new int[500000];
        int i, j, p, t, n;
        for(int g=0; g<500000; g++) {
            result[g]=0;
        }

        for(i=0; i<500000; i++) {
            p=i+1;
            for(j=2*p; j<=500000; j+=p) {
                result[j-1]+=p;
            }
        }
        Scanner s = new Scanner(new BufferedInputStream(System.in));
        t=s.nextInt();
        for(int h=0; h<t; h++) {
            n=s.nextInt();
            System.out.println(result[n-1]);
        }
    }

}
