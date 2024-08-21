import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Nhập số nguyên thứ nhất: ");
                int a = scanner.nextInt();
                System.out.print("Nhập số nguyên thứ hai (khác 0): ");
                int b = scanner.nextInt();
                int sum = a + b;
                int subtract = a - b;
                int multiply = a * b;
                int divide =  a / b ;
                int remainder =  a % b ;
                System.out.println("Tổng: " + sum);
                System.out.println("Hiệu: " + subtract);
                System.out.println("Tích: " + multiply);
                System.out.println("Thương: " + divide);
                System.out.println("Số dư: " + remainder);

            }
            }
