import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Задача №1//
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int a = in.nextInt();
        if (a%2==0)
            System.out.println("Число четное");
        else
            System.out.println("Число нечетное");

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
//        boolean f = true;
//        int i;
//        for(i=2; i<n ;i++)
//        {
//            if (n%i==0) {
//                f = false;
//                break;
//            }
//        }
//        if (f)
//            System.out.println("число простое");
//        else
//            System.out.println("число составное ");

        //Задача №7//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите целое число N: ");
//        int N = scanner.nextInt();
//        for (int i = N; i >= 1; i--) {
//            System.out.println(i);
//        }

        //Задача №8//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите первое целое число A: ");
//        int A = scanner.nextInt();
//        System.out.print("Введите второе целое число B: ");
//        int B = scanner.nextInt();
//        if (A > B) {
//            int temp = A;
//            A = B;
//            B = temp;
//        }
//        int sum = 0;
//        for (int i = A; i <= B; i++) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println("Сумма всех четных чисел в диапазоне от " + A + " до " + B + " равна: " + sum);

        //Задача №9//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String in = scanner.nextLine();
//        String reversed = new StringBuilder(in).reverse().toString();
//        System.out.println("Реверс строки: "+reversed);

        //Задача №10//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        String a = scanner.nextLine();
//        if (a.startsWith("-")) {
//            a = a.substring(1);
//        }
//        int Count = a.length();
//        System.out.println("Количество цифр в числе: " + Count);

        //Задача №11//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int a = scanner.nextInt();
//        int f = 1;
//        for (int i = 1; i<=a; i++)
//            f = f*i;
//        System.out.println("Факториал числа равен: "+f);

        //Задача №12//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int a = scanner.nextInt();
//        int sum = 0;
//        for (int i = a; a!=0; a/=10)
//            sum+=(a%10);
//        System.out.println("Сумма цифр числа равна: "+sum);

        //Задача №13//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String input = scanner.nextLine();
//        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();
//        boolean isPalindrome = isPalindrome(cleanedInput);
//        if (isPalindrome) {
//            System.out.println("Строка является палиндромом");
//        } else {
//            System.out.println("Строка не является палиндромом");
//        }
//        scanner.close();
//    }
//    private static boolean isPalindrome(String str) {
//        int left = 0;
//        int right = str.length() - 1;
//        while (left < right) {
//            if (str.charAt(left) != str.charAt(right)) {
//                return false; // Не палиндром
//            }
//            left++;
//            right--;
//        }
//        return true;

        //Задача №14//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите размер массива: ");
//        int Length = scanner.nextInt();
//        int[] array = new int[Length];
//        System.out.print("Введите элементы массива: ");
//        for (int i =0; i<Length;i++)
//            array[i] = scanner.nextInt();
//        int max = Arrays.stream(array).max().getAsInt();
//        System.out.println("Максимальное число массива: "+max);

        //Задача №15//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите размер массива: ");
//        int Length = scanner.nextInt();
//        int[] array = new int[Length];
//        System.out.print("Введите элементы массива: ");
//        for (int i =0; i<Length;i++)
//            array[i] = scanner.nextInt();
//        int sum = Arrays.stream(array).sum();
//        System.out.println("Сумма чисел массива: "+sum);

        //Задача №16//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите размер массива: ");
//        int Length = scanner.nextInt();
//        int[] array = new int[Length];
//        System.out.print("Введите элементы массива: ");
//        int countPos = 0;
//        int countNeg = 0;
//        for (int i = 0; i < Length; i++)
//            array[i] = scanner.nextInt();
//        for (int number : array) {
//            if (number > 0) {
//                countPos++;
//            } else if (number < 0) {
//                countNeg++;
//            }
//        }
//        System.out.println("Количество положительных чисел массива: "+countPos);
//        System.out.println("Количество отрицательных чисел массива: "+countNeg);

        //Задача №17//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите первое целое число A: ");
//        int A = scanner.nextInt();
//        System.out.print("Введите второе целое число B: ");
//        int B = scanner.nextInt();
//        boolean f = true;
//        if (A > B) {
//            int temp = A;
//            A = B;
//            B = temp;
//        }
//        System.out.println("Простые числа в диапазоне от " + A + " до " + B + ":");
//        for (int i = A; i <= B; i++) {
//            if (isPrime(i)) {
//                System.out.print(i + " ");
//            }
//        }
//        scanner.close();
//    }
//    public static boolean isPrime(int number) {
//        if (number <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(number); i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;

        //Задача №18//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String input = scanner.nextLine();
//        int vowelCount = 0;
//        int consonantCount = 0;
//        input = input.toLowerCase();
//
//        for (char ch : input.toCharArray()) {
//            if (Character.isLetter(ch)) {
//                if (isVowel(ch)) {
//                    vowelCount++;
//                } else {
//                    consonantCount++;
//                }
//            }
//        }
//        System.out.println("Количество гласных в строке: " + vowelCount);
//        System.out.println("Количество согласных в строке: " + consonantCount);
//        scanner.close();
//    }
//    public static boolean isVowel(char ch) {
//        return "aeiouy".indexOf(ch) != -1;

        //Задача №19//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String input = scanner.nextLine();
//        String[] words = input.split(" ");
//        StringBuilder reversed = new StringBuilder();
//        for (int i = words.length - 1; i >= 0; i--) {
//            reversed.append(words[i]);
//            if (i != 0) {
//                reversed.append(" ");
//            }
//        }
//        System.out.println("Слова в обратном порядке: " + reversed.toString());
//        scanner.close();

        //Задача №20//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите целое число: ");
//        int number = scanner.nextInt();
//        int originalNumber = number;
//        int sum = 0;
//        int digits = String.valueOf(number).length();
//        while (number > 0) {
//            int digit = number % 10;
//            sum += Math.pow(digit, digits);
//            number /= 10;
//        }
//        if (sum == originalNumber) {
//            System.out.println(originalNumber + " является числом Армстронга.");
//        } else {
//            System.out.println(originalNumber + " не является числом Армстронга.");
//        }
//        scanner.close();
    }
}


