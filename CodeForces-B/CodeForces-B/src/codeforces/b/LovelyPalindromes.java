package codeforces.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LovelyPalindromes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder temp = new StringBuilder();
        StringBuilder result=new StringBuilder();
        temp.append(st.nextToken());
        result.append(temp);
        temp.reverse();
        result.append(temp);
        System.out.println(result);
    }
}
