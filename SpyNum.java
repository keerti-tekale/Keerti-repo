class SpyNum{
public static void main(String[] args){

int num = 1412 ; //1412//123

//sum up the individual digits= 1+2+3=6, multiply =6

//summ of individualdigts=product of individual digits
int result= 0;
int final_result=0; //sum
int final_1=1; //product 

while(num >0){
	result= num%10;
	num=num/10;
	final_result= final_result+result;
	final_1= final_1*result;
}

if(final_result==final_1)
{
	System.out.println("Spynum");
}
else{
	System.out.println("not spynum");
}
}
}




