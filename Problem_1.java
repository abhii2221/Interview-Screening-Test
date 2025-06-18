import java.util.Scanner;
public class Problem_1{
    double a,b;
    String operation;


    //We intitialize the value by the help of Constuctor

    Problem_1(double a,double b)
    {
        this.a=a;
        this.b=b;
    }
    //Method to perform operation
    public void Calculator_opration(String operation)
    {
        switch (operation) {
            case "add":
                System.out.println("Result: " + (a + b));
                break;
            case "sub":
                System.out.println("Result: " + (a - b));
                break;
            case "mult":
                System.out.println("Result: " + (a * b));
                break;
            case "div":
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
    }

    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number :");
        double a=sc.nextDouble();
        System.out.println("Enter Second number :");
        double b =sc.nextDouble();
        System.out.println("Enter Operation (add,sub,mult,div)");
        String operation=sc.next();
        sc.close();
        //Creating object of Calculator class and passing values to constructor
        

        Problem_1 cal=new Problem_1(a , b);
        //calling the method to perform operation
        cal.Calculator_opration(operation);
       

    }

}