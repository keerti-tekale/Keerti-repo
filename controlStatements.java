class controlStatements{
public static void main(String[] args)
{
//int i=10;
int j=5;
//int k=531; int a=0,b=0,c=0,d=0;
/*if(i == 10) {
	
 if(j < 20) a = b;
  if(k > 100) c = d; // this if is
  else a = c;        // associated with this else
}
else a = d;

System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);*/
/* if(i==10 && j<=5){
	 System.out.println(a++);
 if(k==345 && i==10){
	 System.out.println(b++);
	 if(k==345 && j==5){
		 System.out.println(c++);
	 if(j==5 && i==10){
		 System.out.println(d++);
	 }
	 else{
		 System.out.println(a);
	 }
	 }
 }
 }*/
 //print even numbers from upto 10
 
 /*for(int i=1;i<=10;i++){
	 
    if(i%2==0)
    System.out.println(i);
 }*/
 
 /*int i=1;
 while(i<=10)
 {
	 if(i%2==1)
	System.out.println(i);
	 i++;
 }*/
 
 /*int l=12;
 do
 {
	 if(k==345 && j==5)
		 System.out.println(k);
	     l++;
 }while(l<=15);  */

/*int month = 13; // April
    String season;
    if(month == 12 || month == 1 || month == 2)
      season = "Winter";
    else if(month == 3 || month == 4 || month == 5)
      season = "Spring";
    else if(month == 6 || month == 7 || month == 8)
      season = "Summer";
    else if(month == 9 || month == 10 || month == 11)
      season = "Autumn";
    else
      season = "Bogus Month";
    System.out.println("13 is a " + season + ".");*/
	//break,return and switch
	
	String help;
	for(int i=0;i<5;i++){
	
	switch(j==531?0:i){
		case 0:
		help="Welcome";
		//break;
		case 1:
		help="Your current status is awesome";
		//break;
		case 2:
		help="your previous transactions are 23";
		//break;
		case 3:
		help="No pending dues";
		//break;
		default:
		help="you have dialled the wrong number";
		//return;
		
	}
	System.out.println("help: " + help);  //value of help is taken as the latest that is the default value
	}
  //ask this if u remove breaks then all defaultwhy?
/*fibonacci		series 
int m=0,m1=1;int t=0;
System.out.println(m);
System.out.println(m1);
for(int n=0;n<5;n++){
	  t=m+m1;
      m=m1;
	  m1=t;
     System.out.println(t);
}

//swap 2 numbers without temp variable
int a= 2;
int b=5;


a= a+b; //7
b= a-b; //2
a= a-b; //5
System.out.println(a); 
System.out.println(b); 
	 
int num1=100,num2=67,num3=78;

	 if(num1>num2)
		 System.out.println("num1 is highest");
	 else if(num2>num3)
		 System.out.println("num2 is greater");
	 else if(num3>num2)
		 System.out.println("num3 is greayer");
	 else if(num1>num3)
		 System.out.println("num1 is greater");
	 
	 else
		 System.out.println("not greater");*/
	 
	 // gcd of 2 numbers
	 
	/* int n1=75, n2=144; int gcd=0;
	 for(int i=1;i<=n1 && i<=n2; i++){
		 if(n1%i==0 & n2%i==0)
			 gcd=i;
	 }
	 System.out.println(gcd); */
	
/*  lcm of 2 numbers
int n3=81,n4=78;int lcm=0, gcd=0;
for(int j=1;j<=n3 && j<=n4;j++){
	if(n3%j==0 & n4%j==0)
		gcd=j;
	    lcm= n3*n4/gcd;
}
System.out.println(gcd);
System.out.println(lcm);*/
}
}

