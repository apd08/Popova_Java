import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число a:");
            int a = scanner.nextInt();
            System.out.println("Введите число b:");
            int b = scanner.nextInt();
            if(a>b){
                System.out.println("a>b");
            }
            if(a<b){
                System.out.println("a<b");
            }
            else{
                System.out.println("a=b");
            }

            System.out.println("Результат сложения: " + a + " + " + b+ " = "  + (a + b));
            System.out.println("Результат вычитания: " + a + " - " + b+ " = "  + (a - b));
            System.out.println("Результат умножения: " + a + " * " + b+ " = "  + (a * b));
            System.out.println("Результат деления: " + a + " / " + b+ " = "  + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Нельзя делить 0");
        }

    }
    }
