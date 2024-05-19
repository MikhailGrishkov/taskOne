import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два разных числа");
        System.out.println("Введите первое число");
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();

        if (a!=b){
            System.out.println("Сумма чисел = " +(a+b));
            System.out.println("Разница чисел = " + Math.abs(a-b));
            for(int i = a; i <= b; i++) {
                System.out.print(" "+i);
            }
            for(int i = a; i >= b; i--) {
                System.out.print(" "+i);
            }
        }
        else {System.out.println("Числа одинаковые, введите другие числа");

        }


    }
}
