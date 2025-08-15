import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.err.print("Enter your name : ");
        Scanner in=new Scanner(System.in);
        String name=in.next();
        System.out.println("Hello, "+name);
        boolean run=true;
        while (run) {
            int wrk = choice();
            switch (wrk) {
                case 1:bets();                    
                    break;
                case 2:play(name);
                    break;
                case 3:run=false;
                    System.out.println("Good Bye,Have a Nice Day!");
                    break;
                default:System.out.println("Enter a valid choice!");
            }
        }
    }
    public static void bets(){
        System.out.println("bets    wins");
        System.out.print("1$   - 10$\n10$  - 100$\n100$ - 1000$\n");
    }
    public static void play(String name){
        Scanner in=new Scanner(System.in);
        System.out.print("Place Your Bet : ");
        int bet=in.nextInt();
        Random rand=new Random();
        int luck= rand.nextInt(8);

        System.out.println(luck+" "+luck+" "+luck);
        if((luck*3)==21){
            System.out.println(name+" You Won "+(bet*10)+"$");
        }else{
            System.out.println("Better Luck NextTime");
        }
    }
    static int choice(){
        System.out.println("bets and info : 1");
        System.out.println("Play : 2");
        System.out.println("Exit : 3");
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Choice : ");
        try {
            int ch=in.nextInt();
            return ch;
        } catch (Exception e) {
            System.out.println("Enter a valid choice!");
        }        
        return choice();
    }
}