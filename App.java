import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
        System.out.println("Who are you?");
        Scanner input=new Scanner(System.in);
        String name=input.next();
        System.out.println("Hello, "+name+"!");
        input.close();

        System.out.println("Tossing a coin...");
        int H=0;
        int T=0;
        for(int i=1;i<=3;i++){
            int r=new Random().nextBoolean()?1:0;
            if(r==1){
                System.out.println("Round"+i+": Heads");
                H++;
            }
            else{
                System.out.println("Round"+i+": Tails");
                T++;
            }
        }
        System.out.println("Heads: "+H+", Tails: "+T);
    }
}