/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calcarea;

import java.io.BufferedInputStream;
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
        // TODO code application logic here

        int n; int x[]=new int[10001],y[]=new int[10001];
        long hasil;

        n=scan.nextInt();
        for(int i=0;i<n;i++){
            x[i]=scan.nextInt();
            y[i]=scan.nextInt();

        }

        hasil=0;

        for(int i=0;i<n-1;i++){
            hasil+=(x[i]*y[i+1]-y[i]*x[i+1]);
            }
        hasil+=(x[n-1]*y[0]-y[n-1]*x[0]);
        if(hasil<0) hasil*=(-1);
        hasil/=2;
        System.out.println(hasil);
    }

}
