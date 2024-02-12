class Practice_array{
public static void main(String [] args)
{

int a[] ={1,2,3,4};
int b[] ={10,12,3,41};
int c[]={1,2,4,5};
int d[]={1,2,5,7};

/*for (int i=0;i<a.length;i++){
for(int j=0;j<b.length;j++){

if(a[i] == b[j]){
//System.out.println("the element is"+ a[i]);
//System.out.println("the element is"+ b[i]);
}
}
}
//System.out.println("true");*/

boolean flag = true;
for (int i=0;i<a.length;i++){ //4 times
	
	
	if(a[i] != b[i]){
		flag = false;
		break;                  
	}
// break; if you have it here it wll always get executed
	
	//System.out.println("the elements from a is"+ a[i]);
	//System.out.println("the elements from b is"+ b[i]);
}

if(flag){
System.out.println("Both arrays ar eequal");
}
else{
	
System.out.println("Both arrays are not equal");
}



/*for (int k=0;k<c.length;k++){
for(int m=0;m<d.length;m++){

if(c[k] == d[m]){
//System.out.println("the element is"+ a[i]);
//System.out.println("the element is"+ b[i]);
}


}*/


}
}