class MathOper3 {
public MathOper3() {
  n1 = 125;
  n2 = 75;
}
public MathOper3(int x, int y){
  n1 = x;
  n2 = y;
}

 int n1 = 0;
 int n2 = 0;

 int sum() {return n1 + n2;}
 int diff() {return n1 - n2;}
 int prod() {return n1 * n2;}
 int quot() {return n1 / n2;}
 int rem() {return n1 % n2;}

 void dispSum(){
 System.out.println("Sum = " + sum());
 System.out.println("Diff = " + diff());
 System.out.println("Prod = " + prod());
 System.out.println("quot = " + quot());
 System.out.println("Rem = " + rem());
}
}
