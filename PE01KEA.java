// Almalel,Kirstjn Euskei A.
// BSIT 1D-G1

import java.util.Scanner;
public class PE01KEA{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number: ");
int num = scanner.nextInt();

// no.1

  if (num % 2 == 0){
    System.out.println("Even");
 }else{
    System.out.println("Odd");
 }

// no.2

  if (num > 0){
   System.out.println("Positive");
 }else{
    System.out.println("Negative");
 }

// no.3

   System.out.print("Enter first number: ");
   int num1 = scanner.nextInt();

   System.out.print("Enter secondnumber: ");
   int num2 = scanner.nextInt();

  if (num1 > num2){
   System.out.println("n1 is greater than n2");
 }else{
   System.out.println("n1 is less than n2");
 }

// no.4

   System.out.print("Enter first number: ");
   int n1 = scanner.nextInt();

   System.out.print("Enter second number: ");
   int n2 = scanner.nextInt();

   System.out.print("Enter third number: ");
   int n3 = scanner.nextInt();

  if (n1 > n2 || n1 > n3){
   System.out.println("n1 is greater than others");
  }
  else if (n2 > n3 || n2 > n1){
   System.out.println("n2 is greater than others");
  }
  else if (n3 > n1 || n3 > n2){
   System.out.println("n3 is greater than others");
  }
 }
}
