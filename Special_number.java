import java.io.*;
public class Special_number {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        int i, x, y, t;
        for(i=n1;i<n2+1;i++){
            t = i;
            x = i % 10;
            y = i / 10;
            if(((x+y)+(x*y))==t){
                System.out.println(t);
            }
        }
    }
}
