import java.util.Scanner;

public class cal{
    public static void main(String []args){
            {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter your First Number:");
                    int a =sc.nextInt();
                    System.out.println("Enter your Second Number:");
                    int b  =sc.nextInt();
                    System.out.println("Enter the function to be performed\n" +
                            " 1.Add the two Numbers \n" +
                            " 2.Subtract The two Numbers\n" +
                            " 2.Multiply the Two Numbers\n" +
                            " 4.Divide the Two numbers\n" +
                            " 5.Modules of the number");
                    int c=sc.nextInt();
                    switch (c){
                            case 1:
                                    System.out.println(a+b);
                                    break;
                            case 2:
                                    System.out.println(a-b);
                                    break;
                            case 3:
                                    System.out.println(a*b);
                                    break;
                            case 4:
                                    if(b==0){
                                            System.out.println("Exception number can be divided by zero[Undefined]");
                                    }
                                    else{
                                            System.out.println(a/b);
                                    }
                                    break;
                            case 5:
                                    System.out.println(a%b);
                                    break;
                            default:
                                    throw new IllegalStateException("Unexpected value: " + c);
                    }
            }

    }
}
