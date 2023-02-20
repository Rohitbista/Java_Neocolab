import java.util.*;
public class Scissor_Rock_Paper {
    public static void main(String[] args) throws Exception{
        Random rand = new Random();
        char choice = 'y';
        while(choice == 'y' || choice == 'Y'){
            int rd = rand.nextInt(3);
            //0 is rock, 1 is paper, 2 is Scissor
            Scanner sc = new Scanner(System.in);
            System.out.print("Rock(0), Paper(1) and Scissors(2): ");
            int a = sc.nextInt();
            if(a==rd){
                System.out.print("It is a draw");
            }else if(a == 0 && rd == 1){
                System.out.print("The computer is Paper and you are Rock. Computer Wins");
            }else if(a == 1 && rd == 2){
                System.out.print("The computer is Scissors and you are Paper. Computer Wins");
            }else if(a == 2 && rd == 0){
                System.out.print("The computer is Rock and you are Scissors. Computer Win");
            }else if(a == 1 && rd == 0){
                System.out.print("The computer is Rock and you are Paper. You Win");
            }else if(a == 2 && rd == 1){
                System.out.print("The computer is Paper and you are Scissors. You Win");
            }else if(a == 0 && rd == 2){
                System.out.print("The computer is Scissors and you are Rock. You Win");
            }
            System.out.print("\nDo you want to play again(y/n): ");
            choice = sc.next().charAt(0);
        }
    }
}
