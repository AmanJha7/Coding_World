import java.util.Scanner;

public class Daimond 
{
    public static void main(String[] args) {
        System.out.println("enter value");
        Scanner sc=new Scanner(System.in);
       // sc%2==0?System.out.println("wrong choice"):System.out.println("here the daimond");
       int a=sc.nextInt();
       int bq=a-1;
       for(int i=1;i<=a;i++){
        for(int j=0;j<(a-i);j++){
            System.out.print(" ");
        }
        for(int k=1;k<=((2*i)-1);k++){
            System.out.print("*");
        }
        System.out.println();
       }
       for(int l=1;l<a;l++){
        for(int m=1;m<=l;m++){
            System.out.print(" ");

        }
        
        for(int n=1;n<=((2*bq)-1);n++){
            System.out.print("*");
            
        }
        bq--;
        System.out.println();
       }


    }
}
