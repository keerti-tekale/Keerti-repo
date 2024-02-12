//prime number using count and flag

class PrimeNum{
public static void main(String [] args)
{

int num=2;
int count =0;
boolean flag=true;
for(int i=2;i<num;i++)
{
if(num%i==0){
count++;
}

if(count==2)
{
flag=false;

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
