import java.util.Scanner;

class MathOper2 {
public static void main(String Almalel[]){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter 1st No: ");
int n1 = scanner.nextInt();
System.out.print("Enter 2nd No: ");
int n2 = scanner.nextInt();

System.out.println("sum = " + sum(n1, n2));
System.out.println("difference = " + diff(n1, n2));
System.out.println("product = " + prod(n1, n2));
System.out.println("Quotient = " + quot(n1, n2));
System.out.println("Reminder = " + rem(n1, n2));
}

static int sum(int x, int y){return x + y;}
static int diff(int x, int y){return x - y;}
static int prod(int x, int y){return x * y;}
static int quot(int x, int y){return x / y;}
static int rem(int x, int y){return x % y;}
}
