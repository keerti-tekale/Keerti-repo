//prime number using flag and break
class PrimeNum1{
public static void main (String[] args){

int num=8;
int count=0;
boolean flag =true;

for(int i=2;i<num;i++){

if(num%i==0){

flag=false;
break;
}
}
 if(flag)
 {
 System.out.println("it is prime"+ num);
 }
 else{
 System.out.println("it is not prime" +num);
 }

}
}