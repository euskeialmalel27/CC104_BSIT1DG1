import java.util.*;
class DecisionDemo {

   public static void main(String Almalel[]) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Input number: ");
   double grd = sc.nextDouble();
   
   if (grd > 74.4)
   System.out.println("You Passed");
   else
   System.out.println("You Failed");

   if (grd < 101 && grd > 89) {
   System.out.println("Excellent");
   }
   else if (grd > 79) {
   System.out.println("Very Good");
   }
   else if (grd > 74) { 
   System.out.println("Good");
   }
   else {
   System.out.println("Poor");
   }

   System.out.print("Input day: ");
   int day = sc.nextInt();

   switch(day) {
   case 1:System.out.println("Sunday");break;
   case 2:System.out.println("Monday");break;
   case 3:System.out.println("Tuesday");break;
   case 4:System.out.println("Wednesday");break;
   case 5:System.out.println("Thursday");break;
   case 6:System.out.println("Friday");break;
   case 7:System.out.println("Saturday");break;
   }
 }
}
