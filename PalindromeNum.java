class PalindromeNum{
public static void main(String[] args){

//121 =666

int num =121;
int temp=num;
int result=0;
int final_result=0;
int intermediate=0;
while(temp>0){
	result = temp%10;  //1, 2, 1
	intermediate= intermediate*10+result; // 0+1, 10+2, 120+1=121
	temp = temp/10;//12, 12/10=1, 1/10=0
	//final_result=final_result+result;  //to show uncomment this and  sops then in the if add final_result/10 ==num/10 for the num 121 then we are getting palindrome ask this.
	//System.out.println(intermediate);
	//System.out.println(num);
	//System.out.println(final_result);
}
//if(final_result/10 == num/10)
if( num == intermediate)
{
	System.out.println("Palindrome");
}
else{
	System.out.println("Not Palindrome");
	
}
}
}

