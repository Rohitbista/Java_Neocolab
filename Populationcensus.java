public class Populationcensus {
    public static void main(String[] args) throws Exception{
        double p = 312032486;
        float b, d, n;
        b = (365*((24*60*60)/7));
        d = (365*((24*60*60)/13));
        n = (365*((24*60*60)/45));
        for(int i=0;i<5;i++){
            p = p + b - d + n;
            System.out.print("Population in year ");
            System.out.print(i+1);
            System.out.print(" is ");
            System.out.print(p);
            System.out.print("\n");
        }
    }
}
