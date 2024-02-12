class Greatest_array{
public static void main(String[] args){
int a[] ={4,5,2,8,3,6};
int num=0; int even=0;
int odd=0;

for(int i=0;i<a.length;i++){
/*if(i ==0){

num= a[i];

}*/
if(i%2==0){
	even=even+a[i];
}
	
else{

odd=odd+a[i];
}

}
System.out.println(even);
System.out.println(odd);

if ( even > odd ){
System.out.println("sum of even indices is greatest");
}

else{
System.out.println("sum of odd indices is greatest");
}
}
}