/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package major;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedInputStream(System.in));
        Scanner scan2 = new Scanner(System.in);
        int t, i=0, j;
        t = scan.nextInt();

        while(i<t) {
            j=0;
            int flag=0;
            int n;
            int a[] = new int[1001];
            int b[] = new int[1000];

            int m,pos=0;
            for(int y=0; y<1001; y++) {
                a[y] = 0;
                //b[y] = 0;
            }
            for(int y=0; y<1000; y++) {
                //a[y] = 0;
                b[y] = 0;
            }
            n = scan.nextInt();
            if(n==0) flag=1;
            while(j<n)
            {
                m = scan.nextInt();
                if(m<0) b[-m]++;
                a[m]++;
                j++;
                if(a[m]>(n/2)) {flag=1;pos=m;}
                else if(b[-m]>n/2){flag=1;pos=-m;}
            }
            if(flag==1) System.out.println("YES " + pos);
            else System.out.println("NO");
            i++;
        }
        // TODO code application logic here
    }

}