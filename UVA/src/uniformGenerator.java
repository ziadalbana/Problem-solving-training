import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 class uniformGenerator {
    int step=0;
     static void main(String[] args) {
        uniformGenerator n=new uniformGenerator();
        n.solution();
    }
    void solution(){
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer s = new StringTokenizer(in.readLine());
            int l=Integer.parseInt(s.nextToken());
            int cases=1;
            while (l-->0) {
                s = new StringTokenizer(in.readLine());
                int n=Integer.parseInt(s.nextToken());
                String[] image=new String[n];
                boolean[][] visited=new boolean[n][n];
                int i,j,count=0;
                for(i=0;i<n;i++){
                    image[i]=in.readLine();
                }
                for(i=0;i<n;i++){
                    for(j=0;j<n;j++){
                        if(!visited[i][j]&&image[i].charAt(j)=='x'){
                            count++;
                            dfs(i,j,image,visited);
                        }
                    }
                }
                System.out.println("Case "+cases++ +": "+count);
            }
        } catch (IOException e) {
        }



    }
    void dfs(int x,int y,String[] image,boolean[][] visited){
        if(x<0||x>=image.length||y<0||y>=image[x].length()) return ;
        if(visited[x][y])return ;
        visited[x][y]=true;
        if(image[x].charAt(y)=='.') return;
        dfs(x+1,y,image,visited);
        dfs(x-1,y,image,visited);
        dfs(x,y+1,image,visited);
        dfs(x,y-1,image,visited);
    }
}
