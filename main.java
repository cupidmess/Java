//addition of matrices
import java.util.*;
class main {
public static void main(String[]args){
Scanner sc = new Scanner (System.in);
int r,c,i,j,k;
System.out.println("Enter number of rows and columns");
r = sc.nextInt();
c= sc.nextInt();
int [][] arr1 = new int [r][c];
int [][] arr2 = new int [r][c]; 
int [][] res =new int [r][c];
int [][] diff =new int[r][c];
int [][] mul =new int [r][c];
System.out.println("Enter elements for matrix 1");
for (i=0;i<r;i++){
for (j=0;j<c;j++){
System.out.println("Enter element");
arr1[i][j]=sc.nextInt();
}
}
System.out.println("Enter elements for matrix 2");
for (i=0;i<r;i++){
for (j=0;j<c;j++){
System.out.println("Enter element");
arr2[i][j]=sc.nextInt();
}
}
System.out.println("Elements for matrix 1");
for (i=0;i<r;i++){
for (j=0;j<c;j++){
System.out.print(arr1[i][j]);
System.out.print("\t");
}
System.out.println();
}
System.out.println("Elements for matrix 2");
for (i=0;i<r;i++){
for (j=0;j<c;j++){
System.out.print(arr2[i][j]);
System.out.print("\t");
}
System.out.println();
}
for (i=0;i<r;i++){
for (j=0;j<c;j++){
res[i][j]=arr1[i][j]+arr2[i][j];
}
}
for (i=0;i<r;i++){
for (j=0;j<c;j++){
diff[i][j]=arr1[i][j]-arr2[i][j];
}
}
for (i=0;i<r;i++){
for (j=0;j<c;j++){
for (k=0;k<c;k++){
mul[i][j]+=arr1[i][k]*arr2[k][j];
}
}
}
System.out.println("Sum is");
for (i=0;i<r;i++){
for (j=0;j<c;j++){
System.out.print(res[i][j]);
System.out.print("\t");
}
System.out.println();
}
System.out.println("Difference is");
for (i=0;i<r;i++){
for (j=0;j<c;j++){
System.out.print(diff[i][j]);
System.out.print("\t");
}
System.out.println();
}
System.out.println("Product is");
for (i=0;i<r;i++){
for (j=0;j<c;j++){
System.out.print(mul[i][j]);
System.out.print("\t");
}
System.out.println();
}
}
}