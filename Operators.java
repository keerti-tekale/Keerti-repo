class Operators{
public static void main(String args[]){

int a=10,b=30,c=5;
System.out.println(a==10 && b<40);// == will check for the value a==10 means 10 ==10 is checked its true so returns true.
System.out.println(a==5 || b<20);//as first condn is true it will not execute and check second condn and return result.
System.out.println(a==10 && c++ ==5); //as c++ is a psot increment the value will be incremented later.
System.out.println(c);
System.out.println(a==4 && b==30); //as first condn is false second will not be evaluated.
//! is logical unary not is applicable only to boolean values
boolean flag=true;
boolean mark=false;
System.out.println(!flag); //return the opposite of flag

//Ternary operator
System.out.println(a==10 ? 10:0); //if a==10 then print 10 else print 0
System.out.println(a==10 ? b<30?5:4: c<5?30:0);
System.out.println(a<10 ? b<30?2:4 : c<5?40:1);

//operator precedence:  Brackets, increment/decrement,division,multiplication and then addition and substraction(BIDMAS)

System.out.println((a++ * b) * c /c + a -b);
                // first (a++ *b) will be executed = a*b = 300
				// a++ increment will be done =11
				// c/c is done= 6/6=1
				//  multiply by c/c followed by +a and then -b = 300*1 =300 +a =300+11 =311 -30 =281
				
System.out.println((++a * b) * c /c + a -b); 
                   
				   //a=12
				   //12*30=360
				   //c/c= 6/6
				   //360*1=360
				   //360+12 =372
				   //372-30=342
System.out.println(++a * b); // a=13* 30 = 390
System.out.println(a + (b--*c) -c /a); //ans 193 ask?
//30*6=180
//b-- =29
// -6/13 = 0
//180+a = 193


//relational operators
System.out.println(a==b);
System.out.println(a!=b);
System.out.println(b>c);
System.out.println(c<a);
System.out.println(a>=b);
System.out.println(c<=b);
}
}


