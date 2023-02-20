import java.io.*;
public class Ticket_type {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c = (char)br.read();
        c = Character.toLowerCase(c);
        switch(c){
            case 'e':
                System.out.print("Early Bird Ticket");
                break;
            case 'd':
                System.out.print("Discount Ticket");
                break;
            case 'v':
                System.out.print("VIP Ticket");
                break;
            case 's':
                System.out.print("Standard Ticket");
                break;
            case 'c':
                System.out.print("Children Ticket");
                break;
            default:
                System.out.print("Invalid Input");
                break;
        }
    }
}
