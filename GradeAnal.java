import java.util.Scanner;
public class GradeAnal{

public static void main(String[] Almalel){
Scanner scanner = new Scanner(System.in);

int sum = 0;
int highest = grades[0];
int[] gr = new int[5];

System.out.print("Enter 1st Grade: ");
gr = scanner.nextInt();

System.out.print("Enter 2nd Grade: ");
gr = scanner.nextInt();

System.out.print("Enter 3rd Grade: ");
gr = scanner.nextInt();

System.out.print("Enter 4th Grade: ");
gr = scanner.nextInt();

System.out.print("Enter 5th Grade: ");
gr = scanner.nextInt();


for (int gr : grades){
sum += gr;
if (gr > highest){
highest = grade;
}
}
double ave = (double) sum / grades.length;
System.out.println("Average Grade: " + ave);
System.out.println("Highest Grade: " + highest);
}
}
