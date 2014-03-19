import java.io.*;
import java.util.*;

public class Main {
        private static Scanner in;
        private static PrintWriter out;

        public static void main(String[] args) throws IOException {
                in = new Scanner(System.in);
                out = new PrintWriter(System.out, true);
                
                int T = in.nextInt();
                while (T-- > 0) {
                        int N = in.nextInt(), M = in.nextInt();
                        
                        int [] dp = new int [N + 1];
                        for (int i = 0; i < M; i++) {
                                int a = in.nextInt(), b = in.nextInt();
                                for (int j = N; j >= a; j--) {
                                        dp [j] = Math.max (dp [j], dp [j - a] + b);
                                }
                        }
                        
                        for (int i = 1; i <= N; i++)
                                dp [i] = Math.max (dp [i], dp [i - 1]);
                        
                        out.printf ("Hey stupid robber, you can get %d.\n", dp [N]);
                }
                
                out.close();
                System.exit(0);
        }
        }

