import java.util.Scanner;

public class cal {
    public static void main(String args[])
    {
        double a,b;
        double add,sub,mul,div;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a:");
        a=sc.nextInt();
        System.out.println("enter value of b:");
        b=sc.nextInt();
        System.out.println("enter your choice:");
        int c= sc.nextInt();
        switch(c){
            case 1: 
            add=a+b;
             System.out.println("add="+add);
             break;
            case 2:
                 sub=a-b;
                 System.out.println("sub="+sub);
                 break;
            case 3:
                 mul=a*b;
                System.out.println("mul="+mul);
                break;
            case 4:
                 div=a/b;
                 System.out.println("div="+div);
            default:
                System.out.println("wrong choice");
        }
        System.out.println();
    }
    
}
