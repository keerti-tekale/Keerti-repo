class Calculator{


int add(int a, int b){
 return a+b;
}
int substract(int a, int b){
return a-b;
}
double multiply(double a, double b){
return a*b;
}

double divide(double a , double b){
return a/b;
}
}

class CalculatorDemo{
public static void main(String [] args){

Calculator c1=new Calculator();
System.out.println(c1.add(10,20));
System.out.println(c1.substract(60,70));
System.out.println(c1.multiply(5.8,8.9));
System.out.println(c1.divide(9,3));

}
}
