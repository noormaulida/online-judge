/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pour1;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 *
 * @author NOOR MAULIDA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,i,a,b,c, count, x,y=0, temp;

        Scanner scan = new Scanner(new BufferedInputStream(System.in));
        n=scan.nextInt();
        for(i=0; i<n; i++) {
            int flag=0;
            count=0;
            y=0; x=0;
            a=scan.nextInt();
            b=scan.nextInt();
            c=scan.nextInt();
            if(c>a && c>b) {
                System.out.println("-1");
                continue;
            }
            if(a==c||b==c)
                {
                        System.out.println("1");
                        continue;
                }
                else
                {
                if(a<b)
                {
                        temp=a;
                        a=b;
                        b=temp;
                }
                while(true)
                {
                        x=b;
                        count++;
                        y=y+x;
                        count++;
                        if(a-y==c||y==c)
                        break;
                        if(y>a)
                        {
                                x=y-a;
                                y=a;
                                if(x==c)
                                break;
                                y=0;
                                count++;
                                y=x;
                                count++;
                                if(a-y==c)
                                break;
                        }
                        else if(y==a&&x==b)
                        {
                        System.out.println("-1");
                        flag=1;
                        break;
                        }
                        x=0;
                }
                if(flag!=1)
                System.out.println(count);
                }
        }
        }

    }
