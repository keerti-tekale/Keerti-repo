class Box{

double width;
double height;
double depth;
}

class BoxDemo{
public static void main (String[] args)
{
Box mybox=new Box();
 mybox.width=5;
 mybox.height=6;
 mybox.depth=10;
 System.out.println(mybox.width*mybox.height*mybox.depth);
 
Box mybox1=new Box();
mybox1.width=7;
mybox1.height=8;
mybox1.depth=15;
//mybox.depth=15; //here java initializes the value to 0.0 by default bcoz it overwrites 10 to 0

System.out.println(mybox1.width*mybox1.height*mybox1.depth);
//System.out.println(mybox1.depth);
 }
 }
 