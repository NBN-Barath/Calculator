import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("------------");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter the number of values (2 or 3): ");
                int digit = sc.nextInt();
                double result = 0;

                if (digit == 2) {
                    System.out.print("Enter two numbers: ");
                    double num1 = sc.nextDouble();
                    double num2 = sc.nextDouble();
                    switch (choice) {
                        case 1:
                            result = Calculator.add(num1, num2);
                            System.out.println(num1 + " + " + num2 + " = " + result);
                            break;
                        case 2:
                            result = Calculator.sub(num1, num2);
                            System.out.println(num1 + " - " + num2 + " = " + result);
                            break;
                        case 3:
                            result = Calculator.mul(num1, num2);
                            System.out.println(num1 + " * " + num2 + " = " + result);
                            break;
                        case 4:
                            if (num2 != 0) {
                                result = Calculator.div(num1, num2);
                                System.out.println(num1 + " / " + num2 + " = " + result);
                            } else {
                                System.out.println("Division by zero is not possible.");
                            }
                            break;
                    }

                } else if (digit == 3) {
                    System.out.print("Enter three numbers: ");
                    double num1 = sc.nextDouble();
                    double num2 = sc.nextDouble();
                    double num3 = sc.nextDouble();
                    switch (choice) {
                        case 1:
                            result = Calculator.add(num1, num2, num3);
                            System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + result);
                            break;
                        case 2:
                            result = Calculator.sub(num1, num2, num3);
                            System.out.println(num1 + " - " + num2 + " - " + num3 + " = " + result);
                            break;
                        case 3:
                            result = Calculator.mul(num1, num2, num3);
                            System.out.println(num1 + " * " + num2 + " * " + num3 + " = " + result);
                            break;
                        case 4:
                            if (num2 != 0 && num3 != 0) {
                                result = Calculator.div(num1, num2, num3);
                                System.out.println(num1 + " / " + num2 + " / " + num3 + " = " + result);
                            } else {
                                System.out.println("Division by zero is not possible.");
                            }
                            break;
                    }

                } else {
                    System.out.println("Invalid number of digits");
                }

            } else {
                System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}
