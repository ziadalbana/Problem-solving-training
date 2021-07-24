import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) {
        Main n=new Main();
        n.bigMod_374();
    }
    void bigMod_374(){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (in.ready()) {
                StringTokenizer s = new StringTokenizer(in.readLine());
                int b = Integer.parseInt(s.nextToken());
                s = new StringTokenizer(in.readLine());
                int k = Integer.parseInt(s.nextToken());
                s = new StringTokenizer(in.readLine());
                int m = Integer.parseInt(s.nextToken());
                String binaryString = Integer.toBinaryString(k);
                in.readLine();
                int x = 1;
                int power = b % m;
                for (int i = binaryString.length()-1; i >=0 ; i--) {
                    if (binaryString.charAt(i) == '1') x = (x * power) % m;
                    power = (power * power) % m;
                }
                System.out.println(x);
            }
        } catch (IOException e) {
            try {
                in.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }

    }
}
