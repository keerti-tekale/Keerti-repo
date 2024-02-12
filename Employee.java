class Employee{
int age;
double salaryPerDay;
int noOfWorkingDays;

Employee(int age, int salaryPerDay,int noOfWorkingDays ){

this.age =age;
this.salaryPerDay=salaryPerDay;
this.noOfWorkingDays=noOfWorkingDays;
}


double Salary(int a,double s, int nowd){
double salary =0;
if(age>40){
	
  salary= s*nowd + 100*nowd;
}

else if(age>60){
	salary =s*nowd + 200*nowd;
}

else{
	salary= s*nowd;
}
return salary;

}
		

}

class EmployeeDemo{
public static void main(String[] args){

Employee emp1 = new Employee(26, 1000, 27);
System.out.println(emp1.Salary(26, 1000, 27));
System.out.println();

Employee emp2 = new Employee(39, 1250, 25);
System.out.println(emp2.Salary(39, 1250, 25));
System.out.println();

Employee emp3 = new Employee(41, 1100, 29);
System.out.println(emp3.Salary(41, 1100, 29));
System.out.println();

Employee emp4 = new Employee(53, 1050, 26);
System.out.println(emp4.Salary(53, 1050, 26));
System.out.println();

Employee emp5 = new Employee(62, 1150, 24);
System.out.println(emp5.Salary(62, 1150, 24));
System.out.println();
double maxsalary= emp1.Salary(26, 1000, 27) < emp2.Salary(39, 1250, 25)? emp3.Salary(41, 1100, 29) > emp4.Salary(53, 1050, 26)?emp3.Salary(41, 1100, 29):emp4.Salary(53, 1050, 26):emp5.Salary(62, 1150, 24);


	System.out.println(maxsalary);


}
}
