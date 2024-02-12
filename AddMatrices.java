class AddMatrices{
public static void main(String[] args){

int stud_marks[][] = { {60,70,80} , {50,40,70} ,  {55,45,70} };

int stud_marks2[][]={{60,71,80} , {50,46,70} ,  {59,45,72} };

int result[][]=new int[3][3];

for(int i=0;i<stud_marks.length;i++){ 
for(int j=0;j<stud_marks2.length;j++){

 result[i][j]= stud_marks[i][j]+stud_marks2[i][j];
 System.out.print(result[i][j] +" ");
 }
 System.out.println();
 }
 
}
}
 