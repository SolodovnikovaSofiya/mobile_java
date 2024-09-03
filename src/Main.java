import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Задача №1//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите целое число: ");
//        int a = in.nextInt();
//        if (a%2==0)
//            System.out.println("Число четное");
//        else
//            System.out.println("Число нечетное");

        //Задача №2//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите первое число: ");
//        int num1 = in.nextInt();
//        System.out.print("Введите второе число: ");
//        int num2 = in.nextInt();
//        System.out.print("Введите третье число: ");
//        int num3 = in.nextInt();
//        System.out.print("Наименьшее число: ");
//        if (num1<num2 && num1<num3)
//            System.out.println(num1);
//        else if (num2<num1 && num2<num3)
//            System.out.println(num2);
//        else
//            System.out.println(num3);

        //Задача №3//
//        int num = 5;
//        for (int i = 1; i <= 10; i++)
//        {
//            int k = i * num;
//            System.out.println(i + "*" + num + "=" + k);
//        }

        //Задача №4//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int num1 = in.nextInt();
//        int sum = 0;
//        for (int i = 0; i<=num1; i++)
//            sum+=i;
//        System.out.print("Сумма чисел: ");
//        System.out.println(sum);

        //Задача №5//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int n = in.nextInt();
//        int[] f = new int[n];
//        f[0] = 0;
//        f[1] = 1;
//        for (int i = 2; i < n; ++i) {
//            f[i] = f[i - 1] + f[i - 2];
//        }
//        for (int i = 0; i < n; ++i) {
//            System.out.println(f[i]);
//        }

        //Задача №6//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int n = in.nextInt();
//        if (n/1==0 && n/n==0)
//            System.out.print("Число простое");


        //Задача №7//
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = in.nextInt();
        int i;
        for (i = 1; i <=a ; i--)
            System.out.println(i);
    }
}
