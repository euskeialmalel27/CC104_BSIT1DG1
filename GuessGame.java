import java.util.*;

class GuessGame{
   static Scanner input = new Scanner(System.in);
   static Random N = new Random();
   static int Secret = N.nextInt(101);
   static int Guess = 0;
   static String ans = "";

   public static void main(String Almalel[]){

    do {
        Secret = N.nextInt(101);
        Guess = 0;
     do {

        System.out.print("Enter your Guess (1-100): ");
        Guess = input.nextInt();
        if (Guess > Secret)
           System.out.println("Too High!");
        else if (Guess < Secret)
           System.out.println("Too Low!");
        else
           System.out.println("CONGRATULATIONS!");

     } while (Guess != Secret);
            System.out.println("Play again (Y/N)? ");
            ans = input.next();
      } while (!ans.equalsIgnoreCase("N"));
             System.out.println("Good Bye!");
   }
}
