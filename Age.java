class Age{
public static void main(String[] args){

int age =-2;

if(age<1)
{
	return;
}
char result=  age <=10 ?  'K' : age >10 && age<=20?'T':'A';

/*1-10 =kids
11=20 Teenager
>20=adults
*/

System.out.println("result" +result);

//age <=10 ? 'k' : 'T'
 
/*if( age >=1 && age<=10)
{
System.out.println("Kids");
}

else if(age >=11 && age<=20){   
System.out.println("Teenager");
}
else if(age >=21 && age<=35){
System.out.println("adult");
}
else if(age >=36 && age<=55){
System.out.println("Middle age");
}
else{
System.out.println(" Senior citizen");
}*/



}
}