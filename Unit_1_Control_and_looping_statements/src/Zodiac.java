import java.util.*;
public class Zodiac{
    public static void main(String[] args){
        int d, m;
        String h;
        h = "haha";
        Scanner input = new Scanner(System.in);
        d = input.nextInt();
        m = input.nextInt();
        if((d<1)||(d>31)||(m<1)||(m>12)){
            System.out.print("Invalid Date/Month");
        }else{
            if(((d>=22)&&(m==12))||((d<=19)&&(m==1))){
                h = "Capricorn";
            }else if(((d>=20)&&(m==1))||((d<=18)&&(m==2))){
                h = "Aquarius";
            }else if(((d>=19)&&(m==2))||((d<=20)&&(m==3))){
                h = "Pisces";
            }else if(((d>=21)&&(m==3))||((d<=19)&&(m==4))){
                h = "Aries";
            }else if(((d>=20)&&(m==4))||((d<=20)&&(m==5))){
                h = "Taurus";
            }else if(((d>=21)&&(m==5))||((d<=20)&&(m==6))){
                h = "Gemini";
            }else if(((d>=21)&&(m==6))||((d<=22)&&(m==7))){
                h = "Cancer";
            }else if(((d>=23)&&(m==7))||((d<=22)&&(m==8))){
                h = "Leo";
            }else if(((d>=23)&&(m==8))||((d<=22)&&(m==9))){
                h = "Virgo";
            }else if(((d>=23)&&(m==9))||((d<=22)&&(m==10))){
                h = "Libra";
            }else if(((d>=23)&&(m==10))||((d<=21)&&(m==11))){
                h = "Scorpio";
            }else if(((d>=22)&&(m==11))||((d<=21)&&(m==12))){
                h = "Sagittarius";
            }
            System.out.print("Astrological sign for "+d+"-"+m+" is "+h);
        }
        
    }
}