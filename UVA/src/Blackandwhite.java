import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Blackandwhite {
    static void main(String[] args) {
        Blackandwhite n=new Blackandwhite();
        n.solution();
    }
    void solution(){
        try{
            try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
                StringTokenizer s;
                StringBuilder n1 = new StringBuilder();
                StringBuilder n2 = new StringBuilder();
                int[] max;
                int x;
                int i, j;
                while ((s = new StringTokenizer(in.readLine())).hasMoreTokens()) {
                    n1.append(s.nextToken());
                    s = new StringTokenizer(in.readLine());
                    n2.append(s.nextToken());
                    n1.reverse();
                    n2.reverse();
                    x = n1.length() + n2.length();
                    max = new int[x];
                    for (i = 0; i < n1.length(); i++) {
                        for (j = 0; j < n2.length(); j++) {
                            max[i + j] += (n1.charAt(i) - 48) * (n2.charAt(j) - 48);
                        }
                    }

                    for (i = 0; i < max.length - 1; i++) {
                        max[i + 1] += max[i] / 10;
                        max[i] %= 10;
                    }
                    i = max.length - 1;
                    while (max[i] == 0) i--;
                    for (; i >= 0; i--) {
                        System.out.print(max[i]);
                    }
                    n1.setLength(0);
                    n2.setLength(0);
                }

            }
        }catch(IOException ignored){
        }



    }
}
