/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package canton;

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
            long son;
            long mum;
            int t;
            BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
            t = Integer.parseInt(inp.readLine());

            for(int i=0; i<t; i++) {
               n = Integer.parseInt(inp.readLine());

               son=mum=1;
               long k=1,sum=2,module=1;
               int sonadd=-1,mumadd=1;
               while (k<n){
                    if (module==sum-1){
                        sonadd=-sonadd;
                        mumadd=-mumadd;
                        sum++;k++;module=1;
                        if (sonadd==1){
                            son=1;
                            mum=sum-1;
                        }
                        else
                        {
                            son=sum-1;
                            mum=1;
                        }
                        }
                    else{
                        k++;module++;
                        son+=sonadd;
                        mum+=mumadd;
                    }
                }

              System.out.println("TERM " + n + " IS " + son + "/" + mum);
               
            }
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

}
