//prime number using count and break

class PrimeNum2{
public static void main(String [] args)
{

int num=2;
int count =0;

for(int i=2;i<num;i++)
{
if(num%i==0){
count++;
}

if(count==2)
{

break;
}
}

if(flag)
{
System.out.println("its prime"+num);
}
else 
	System.out.println("not prime"+num);
}
}
