class Prime_num{
public static void main(String[] args){

//int num =111;
// 9-not prime, 16-not prime, 23-prime, 37-prime, 8-not prime
for(int num=0;num<=100;num++){

//int count =0;
boolean flag =true;
if(num==0 || num==1){  

flag=false;
}
for(int i=2;i<=num/2;i++){
	
if(num%i==0){
	//count++;	
	flag= false;
	break;
}

/*if(count==2) {
	flag= false;
	break;
}*/

}
if(flag){
	System.out.println("it is a prime" +num);
}
/*else{
System.out.println("it is not prime" +num);
}*/
}	
}
}

