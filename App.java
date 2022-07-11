import java.util.Random;
public class App {
    public static void main(String[] args){
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
        if(H>T){
            System.out.println("You won");
        }
        else{
            System.out.println("You lost");
        }
    }
}