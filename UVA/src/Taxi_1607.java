import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Taxi_1607 {
    public static void main(String[] args) {
        Taxi_1607 n=new Taxi_1607();
        n.solution();
    }
    void solution(){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringTokenizer s = new StringTokenizer(in.readLine());
            int initial_Petr=Integer.parseInt(s.nextToken());
            int peterReduction=Integer.parseInt(s.nextToken());
            int initial_diver=Integer.parseInt(s.nextToken());
            int diverReduction=Integer.parseInt(s.nextToken());
           while(initial_Petr<initial_diver){
               initial_diver-=diverReduction;
               initial_Petr+=peterReduction;
           }
           System.out.println(initial_Petr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
