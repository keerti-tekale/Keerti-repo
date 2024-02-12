class first{
public static void main(String args[]){
	//long a= 3000000000000000056765434678908765432l;
	
	//int a= 123456789;
	//long b=123456789l;
	//float c= 23456.789654f;
	//double d=34567.5467;
	//byte e= 45678901;
	//short s= 1234567890;
	//boolean f= false;
	//char g= 'e';
	//byte r =129;
	//System.out.println(b);
//System.out.println(c);
//System.out.println(d);
//System.out.println(e);
//System.out.println(f);
//System.out.println(g);
//System.out.println(s);
	
	//int abc= 8;
	//int b=6;
	//b--;
	//int y= --abc + b--;

//System.out.println(abc); //7
//System.out.println(y); //12
//System.out.println(b); //4
//System.out.println(abc);//7

//swaping without using temp variable
/*int a= 2;
int b=5;


a= a+b; //7
b= a-b; //2
a= a-b; //5
System.out.println(a); 
System.out.println(b);*/

/*int a = 10; 
int b =0;
 b += 5; 
System.out.println(b); */

int a=4;
int b=8;
int c=2;

int d= a^a;
int e= c^b; //10 = 1010 = ~ 0101 since its an int it will store 32 bit rest all are 28 bits 0. so you have to do 2's complement.
int f= a&b;
int g = c | (a ^ a);
int h= ~e; //5
int i= a |b;
int j= 8>>3;
int k= b<<3;
System.out.println(d);
System.out.println(e);
System.out.println(f);
System.out.println(g);
System.out.println(h); // op =-11  ask*/
System.out.println(i);
System.out.println(j);
System.out.println(k);
//testing git

//unary operator and not operator

/*int a=10;
b =-a;
int b= !(a); 
System.out.println(b);// error ask*/



}
}



/* 
first.java:9: error: incompatible types: possible lossy conversion from int to byte
        byte e= 45678901;
		first.java:10: error: incompatible types: possible lossy conversion from int to short
        short s= 1234567890; */