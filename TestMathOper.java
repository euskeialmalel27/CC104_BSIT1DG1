class TestMathOper {
public static void main(String Almalel[]){

 MathOper3 object1, object2;
 object1 = new MathOper3();

 System.out.println(object1.n1);
 System.out.println(object1.n2);

 object1.dispSum();

 object2 = new MathOper3(75,85);
 object2.dispSum();
}
}
