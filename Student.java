class Student{
int age;
int birthYear ;
int noOfFriends;

void StuDetails(int a, int Year,int nof){
age =a;
birthYear =Year;
noOfFriends=nof;

}

void print(){
System.out.println("student age is"+ age);
System.out.println("student birth year is"+ birthYear);
System.out.println("student num of friends is"+ noOfFriends);
}

int Friends(){
	return noOfFriends;
}

int CalAgeGroup(int a){
	
	if(a==1 && a<=12){
		System.out.println("the person is a Kid");
	}
	else if(a >=13 && a<=19){
		System.out.println("the person is a teenager");
	}
		else if(a >=20 && a<= 45){
		System.out.println("the person is a Adult");
	}
	else{
		System.out.println("the person is a Senior citizen");
	}
	
	return a;
}

int CalSumOfBirthYr(int y){ //1995
		int sum=0;
	while(y >0){
	
		y = y%10; //1995 %10 =5, 9,9 ,1
		y = y/10; //199, 19,1, 0
	  sum= sum+y; //0+5, 14, 23, 24
	}
	
		return sum;
}

}
	


class StudentDemo{
public static void main(String [] args){

Student mystudent1=new Student();
mystudent1.age =1;
mystudent1.birthYear=2023;
mystudent1.noOfFriends=5;

mystudent1.print();
mystudent1.CalAgeGroup(1);
int sum = mystudent1.CalSumOfBirthYr(2023);
System.out.println(sum);
System.out.println();

Student mystudent2 =new Student();
mystudent2.age =21;
mystudent2.birthYear=2003;
mystudent2.noOfFriends=8;

mystudent2.print();
mystudent2.CalAgeGroup(21);
mystudent2.Friends();
System.out.println("Student2 has friends of count" + mystudent2.Friends());

int sum2 = mystudent2.CalSumOfBirthYr(2003);
System.out.println(sum2);
System.out.println();

Student mystudent3 = new Student();
mystudent3.StuDetails(13,2009,19);

mystudent3.print();
mystudent1.CalAgeGroup(13);

int sum3 = mystudent2.CalSumOfBirthYr(2009);
System.out.println(sum3);
System.out.println();

Student mystudent4= new Student();
mystudent4.StuDetails(45,1979,20);
mystudent4.print();
mystudent1.CalAgeGroup(45);
int sum4 = mystudent2.CalSumOfBirthYr(1979);
System.out.println(sum4);
System.out.println();

Student mystudent5=new Student();
mystudent5.StuDetails(50,1974,50);
mystudent5.print();
mystudent1.CalAgeGroup(50);
int sum5 = mystudent2.CalSumOfBirthYr(1974);
System.out.println(sum5);
System.out.println();

}
}

