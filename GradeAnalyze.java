import java.util.Scanner;
public class GradeAnalyze{

public static void main(String[] Almalel){
Scanner scanner = new Scanner(System.in);

int[] gr = new int[5];
int sum = 0;

for (int i = 0; i < grades.length; i++) {
System.out.print("Enter Grade " + (i + 1) + ": ");
grades[i] = scanner.nextInt();
}   
int highest = grades[0];

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
