class UnaryOper {
public static void main (String Almalel[]){
int x = 5, y = 8, z = 10, ans = 0;

ans = ++x + y-- + --z;
System.out.println("Ans = " + ans);

ans = --x + y++ + z--;
System.out.println("Ans = " + ans);

ans = x-- + --y + z++;
System.out.println("Ans = " + ans);

System.out.println("x = " + x);
System.out.println("y = " + y);
System.out.println("z = " + z);
}
}
