import java.util.Scanner;


public class array {
    public static void main(String[] args) {
        
    
Scanner sc= new Scanner(System.in);
System.out.println("Enter the class ");

int arr = sc.nextInt();

System.out.println("enter the no. of students in each class");
int count = sc.nextInt();
int ap[][] = new int[arr][count];

for(int i = 0 ; i<ap.length;i++)
{
    for(int j=0 ; j<ap[i].length;j++)
    {
        System.out.println("Enter the marks of " + j + " the student");
        ap[i][j] =sc.nextInt();
    }
    System.out.println("Enter the marks of other classes");
}
System.out.println("the marks of the student are below ");

    
for(int i = 0 ; i<ap.length;i++)
{
    for(int j=0 ; j<ap[i].length;j++)
    {
        System.out.print(ap[i][j] + " " );
}
    System.out.println();
}

    }
}

    
