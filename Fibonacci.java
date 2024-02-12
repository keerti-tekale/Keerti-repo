class Fibonacci{
public static void main(String[] args){

int m=0,m1=1;int t=0;         //m1  m  t  
System.out.println(m);   // 0,1,1,2    3
System.out.println(m1);
for(int n=0;n<5;n++){
	  t=m+m1;
      m=m1;
	  m1=t;
     System.out.println(t);
}
}
}

