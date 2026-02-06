import java.util.*;
class HelloWorld {

  static int N1, N2;

  static Scanner sc = new Scanner(System.in);

  static int Sum(int x, int y){
  return x + y;

}

     public static void main(String Almalel[]){
       System.out.println("Hello World!");

       System.out.print("Enter First Number: ");
       N1 = sc.nextInt();
       System.out.print("Enter Second Number: ");
       N2 = sc.nextInt();

       System.out.println("Sum = " + Sum(N1,N2));
     }
}
