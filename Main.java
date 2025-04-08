import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        byte choice;
        byte inchoice;
        lable:while(true) {
            System.out.println(" 1.Addition \n 2.Subtraction \n 3.Mul \n 4.Div \n 5.exit");
            System.out.print("Enter your choice:");
            choice = sc.nextByte();
            switch (choice) {
                case 1:
                    System.out.println(" 1)add 2 num \n 2)add 3 num \n 3)add n num");
                    inchoice = sc.nextByte();
                    if (inchoice == 1) {
                        System.out.println("Enter value 1:");
                        double a = sc.nextDouble();
                        System.out.println("Enter value 2:");
                        double b = sc.nextDouble();
                        double result = Calculator.add(a, b);
                        System.out.println("The result is " + result);
                    } else if (inchoice == 2) {
                        System.out.println("Enter value1:");
                        double a = sc.nextDouble();
                        System.out.println("Enter value 2:");
                        double b = sc.nextDouble();
                        System.out.println("Enter value 3:");
                        double c = sc.nextDouble();
                        double result = Calculator.add(a, b, c);
                        System.out.println("The result is " + result);
                    }
                    else if (inchoice == 3)
                    {
                        double b= 0;
                        base:while(true){
                            System.out.print("Enter the value:");
                            double a= sc.nextDouble();
                            b=b+a;
                            System.out.println("The value is:"+b);
                            if(a==0){
                                break lable;
                            }
                        }
                    }
                    else {
                        System.out.println("Enter the valid num");
                    }
                    break;
                case 2:
                    System.out.println(" 1)sub 2 num \n 2)sub 3 num \n 3)sub n num");
                    inchoice = sc.nextByte();
                    if (inchoice == 1) {
                        System.out.println("Enter value 1:");
                        double a = sc.nextDouble();
                        System.out.println("Enter value 2:");
                        double b = sc.nextDouble();
                        double result = Calculator.sub(a, b);
                        System.out.println("The result is " + result);
                    } else if (inchoice == 2) {
                        System.out.println("Enter value1:");
                        double a = sc.nextDouble();
                        System.out.println("Enter value 2:");
                        double b = sc.nextDouble();
                        System.out.println("Enter value 3:");
                        double c = sc.nextDouble();
                        double result = Calculator.sub(a, b, c);
                        System.out.println("The result is " + result);
                    }
                    else if (inchoice == 3)
                    {
                        double b= 0;
                        base:while(true){
                            System.out.print("Enter the value:");
                            double a= sc.nextDouble();
                            b=b-a;
                            System.out.println("The value is:"+b);
                            if(a==0){
                                break lable;
                            }
                        }
                    }
                    else {
                        System.out.println("Enter the valid num");
                    }
                    break;
                case 3:
                    System.out.println(" 1)mul 2 num \n 2)mul 3 num \n 3)mul n num");
                    inchoice = sc.nextByte();
                    if (inchoice == 1) {
                        System.out.println("Enter value 1:");
                        double a = sc.nextDouble();
                        System.out.println("Enter value 2:");
                        double b = sc.nextDouble();
                        double result = Calculator.mul(a, b);
                        System.out.println("The result is " + result);
                    } else if (inchoice == 2) {
                        System.out.println("Enter value1:");
                        double a = sc.nextDouble();
                        System.out.println("Enter value 2:");
                        double b = sc.nextDouble();
                        System.out.println("Enter value 3:");
                        double c = sc.nextDouble();
                        double result = Calculator.mul(a, b, c);
                        System.out.println("The result is " + result);
                    }
                    else if (inchoice == 3) {
                        double b = 0;
                        base:
                        while (true) {
                            System.out.print("Enter the value:");
                            double a = sc.nextDouble();
                            b = b * a;
                            System.out.println("The value is:" + b);
                            if (a == 0) {
                                break lable;
                            }
                        }
                    }
                    else {
                        System.out.println("Enter the valid num");
                    }
                case 4:
                    System.out.println(" 1)mul 2 num \n 2)mul 3 num \n 3)mul n num");
                    inchoice = sc.nextByte();
                    if (inchoice == 1) {
                        System.out.println("Enter value 1:");
                        double a = sc.nextDouble();
                        System.out.println("Enter value 2:");
                        double b = sc.nextDouble();
                        double result = Calculator.div(a, b);
                        System.out.println("The result is " + result);
                    } else if (inchoice == 2) {
                        System.out.println("Enter value1:");
                        double a = sc.nextDouble();
                        System.out.println("Enter value 2:");
                        double b = sc.nextDouble();
                        System.out.println("Enter value 3:");
                        double c = sc.nextDouble();
                        double result = Calculator.div(a, b, c);
                        System.out.println("The result is " + result);
                    }
                    else {
                        System.out.println("Enter the valid num");
                    }
                case 5:
                    break lable;
                default:
                    System.out.println("invalid choice ..... Enter a valid number");

            }
        }
    }
}
