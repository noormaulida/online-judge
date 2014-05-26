/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package candy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            long n;
            int t;
            int i=0;
            long s;
            long a;
            BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
            //t = System.in.read();
            t = Integer.parseInt(inp.readLine());

            for(int g=0; g<t; g++) {

                //n = System.in.read();
                System.out.println();
                n = Integer.parseInt(inp.readLine());

                

                s=0;
                for(i=0; i<n; i++) {

                    a = Integer.parseInt(inp.readLine());
                    //a = System.in.read();
                    s += a;
                    if(s >= n)
                        s %= n;
                }
                if(s==0)
                    System.out.println("YES");
                else
                    System.out.println("NO");

                //System.out.println();
            }
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
