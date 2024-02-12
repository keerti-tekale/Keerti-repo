class PetersonNum{
public static void main(String[] args){

//121 then 121 so palindrome
/*peterson number= 145 => 1! =1
4!=24
5!=120

120+24+1=145; */

int num =145;
int fact=1;
int sum =0;

while(num>0){

int result =num%10;
num= num/10;

for(int i=1;i <= result;i++)
{

fact =fact * i;

}
sum= sum+fact;
fact=1; //restting the value of fact to 1 again for next itertaion
}
System.out.println(sum);

}
}

