import java.util.Scanner;
class pattern1
{    
public static void main(String args[])   
{    
Scanner sc=new Scanner(System.in); 
int s=sc.nextInt();
int i, j;    
for (i=0; i<s; i++)   
{        
for (j=0; j<=i; j++)   
{    
System.out.print("* ");   
}    
System.out.println();   
}   
}   
}  