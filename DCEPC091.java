/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dcepc901;

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
        // TODO code application logic here


        Scanner scan =new Scanner(new BufferedInputStream(System.in));
	int T,x,test,k,hasil = 0,fpb=0,i=1,j = 0,test1,m = 0;
	test=scan.nextInt();
	T=scan.nextInt();
	for(int v=0;v<T;v++){
		k=scan.nextInt(); x=scan.nextInt();
		if(x>test) {j=test; m=x;} else
		if(x<=test) {j=x; m=test;}
		i=1;
		if(k==1) {
			if(m==1||j==0) hasil=1; else
			{while(i>0){
				i=m%j;
				if (i==0) {fpb=j; break;} else
				{m=j; j=i;}
			} hasil=test/fpb;}
			} else
		if(k==0) {hasil=test;}
		System.out.println(hasil);
		test=hasil;
	}
    }

}
