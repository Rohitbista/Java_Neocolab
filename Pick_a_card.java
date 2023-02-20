import java.util.*;
public class Pick_a_card {
    public static void main(String[] args) throws Exception{
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to pick a card(y/n): ");
        char choice = input.next().charAt(0);
        while(choice == 'y' || choice == 'Y'){
            int rd = rand.nextInt(52);
            if(rd < 13){
                rd+=1;
                if(rd>1 && rd<11){
                    System.out.print("The card you picked is "+rd+" of Clubs");                  
                }else if(rd == 1){
                    System.out.print("The card you picked is Ace of Clubs");
                }else if(rd == 11){
                    System.out.print("The card you picked is Jack of Clubs");
                }else if(rd == 12){
                    System.out.print("The card you picked is Queen of Clubs");
                }else if(rd == 13){
                    System.out.print("The card you picked is King of Clubs");
                }
            }else if(rd<26){
                rd-=12;
                if(rd>1 && rd<11){
                    System.out.print("The card you picked is "+rd+" of Diamonds");                
                }else if(rd == 1){
                    System.out.print("The card you picked is Ace of Diamonds");
                }else if(rd == 11){
                    System.out.print("The card you picked is Jack of Diamonds");
                }else if(rd == 12){
                    System.out.print("The card you picked is Queen of Diamonds");
                }else if(rd == 13){
                    System.out.print("The card you picked is King of Diamonds");
                }
            }else if(rd<39){
                rd-=25;
                if(rd>1 && rd<11){
                    System.out.print("The card you picked is "+rd+" of Hearts");                  
                }else if(rd == 1){
                    System.out.print("The card you picked is Ace of Hearts");
                }else if(rd == 11){
                    System.out.print("The card you picked is Jack of Hearts");
                }else if(rd == 12){
                    System.out.print("The card you picked is Queen of Hearts");
                }else if(rd == 13){
                    System.out.print("The card you picked is King of Hearts");
                }
            }else if(rd<53){
                rd-=38;
                if(rd>1 && rd<11){
                    System.out.print("The card you picked is "+rd+" of Spades");                  
                }else if(rd == 1){
                    System.out.print("The card you picked is Ace of Spades");
                }else if(rd == 11){
                    System.out.print("The card you picked is Jack of Spades");
                }else if(rd == 12){
                    System.out.print("The card you picked is Queen of Spades");
                }else if(rd == 13){
                    System.out.print("The card you picked is King of Spades");
                }
            }
            System.out.print("\nDo you want to pick a card again(y/n): ");
            choice = input.next().charAt(0);
        }
    }
}
