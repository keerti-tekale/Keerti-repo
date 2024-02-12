class MaxMin_array{
public static void main(String[] args){
int a[] ={4,5,2,8,-3,6};
int min = a[0];
int max =a[0];
//System.out.println(a.length);
boolean flag=false;
for(int i=0;i<a.length;i++){

if(a[i] > max )
{
  max=a[i];

}
if(a[i]<min){
	min=a[i];
}
}

System.out.println("Min: " + min + " Max: " + max);
}
}

