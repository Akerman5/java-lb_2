import javax.crypto.Mac;
import java.util.Scanner;

public class Main
{
    public static final String ANSI_RED = "\u001B[31m";

    public static   void   Завдання1() {
        Scanner skr = new Scanner(System.in);

        int a, b;
        boolean p = true;
        while (p)
        {
            System.out.print("\nВведіть  а:");
            a = skr.nextInt();
            System.out.print("\nВведіть  b:");
            b = skr.nextInt();

            if (a >= Math.pow(b,2))
            {
                p = false;
                double s;
                s = Math.sqrt(a - Math.pow(b,2)) + Math.sqrt(a * b);
                System.out.println("\n\n\nВідповідь s = " + s);
            }
            else
            {
                System.out.println("Помилка");
            }
        }

    }
    public  static  void   Заваданя2(int ask1) {
        Scanner skr = new Scanner(System.in);
        int sum = 0;
        int i = 10;
        switch (ask1)
        {
            case 1 :{
                for (; i <= 100; i++)
                {
                    if (i % 3 == 0) {
                        sum += i;
                    }
                }
                System.out.println("\nВідповідь за способом з ||параметром||=" +sum);
            } break;
            case 2 :
            {
                while (i <= 100) {
                    if (i % 3 == 0) {
                        sum += i;
                    }i++;
                }
                System.out.println("\nВідповідь за способом з ||передумовою||=" +sum);
            }break;
            case 3 : {
                do {
                    if (i % 3 == 0) {
                        sum += i;
                    } i++;
                } while (i <= 100);
                System.out.println("\nВідповідь за способом ||післяумовою||=" +sum);
            }break;
            default : System.out.println("Помилка");
        }



    }
    public  static  void   Завдання3() {
        int resx, resy = 0;
        Scanner skr = new Scanner(System.in);
        try{
            System.out.print("\n Введіть x:");
            int x = skr.nextInt();
            System.out.print("\n Введіть n:");
            int n = skr.nextInt();
            if (x > 0 && n > 0)
            {
                for (int ii = 1; ii <= n; ii++) {
                    resx = 1;
                    for (int jj = 1; jj <= ii; jj++) {
                        resx *= ii * x;
                    }
                    resy += resx;
                }
            }else
            {
                throw new Exception();
            }
            System.out.println("Сума добутку формули: " + resy);
        }
        catch (Exception err)
        {
            System.out.println("Помилка");
        }

    }
    public  static  void   Завдання4() {
        int a = 0;
        int  b = 6;

        float dx;
        Exception ERROR = new Exception();
        for (dx = a; dx <= b; dx += 0.5) {
            try
            {
                if ((float)(1 / (1 - Math.sqrt(dx))) != Double.POSITIVE_INFINITY)
                    System.out.println("dx = " + dx + "\t\t\ty = " + (float)(1 / (1 - Math.sqrt(dx))));
                else
                    throw ERROR;
            }catch(Exception er)
            {
                System.out.println("dx = " + dx + "\t\t\ty = Помилка значень.");
            }
        }

    }

    public static void main(String[] args)
    {
        int ask=0, ask1;
        Scanner skr = new Scanner(System.in);

        while (ask!=5) {
            System.out.print(" \nВеберіть завдання " +
                    "          \n1 - Обчислити значення функції з циклом " +
                    "          \n2 - Обчислити суму всіх чисел, кратних 3 у діапазоні [10;100)" +
                    "          \n3 - Обчислити  задачу" +
                    "          \n4 - Обчислити рівняння'"+
                    "          \n5 - Вихід\n");
            ask = skr.nextInt();
            switch (ask)
            {
                case 1: {
                    Завдання1();
                }break;
                case 2: {

                    System.out.println("Оберіть спосіб:" +
                            "\n1  Використанням циклу for" +
                            "\n2  Використанням циклу while" +
                            "\nЗ  Використанням циклу з do while");
                    ask1 = skr.nextInt();
                    Заваданя2(ask1);
                }break;
                case 3: {
                    Завдання3();
                }break;
                case 4: {Завдання4();
                }break;
                case 5: {System.out.print(ANSI_RED +"Програма закрита");
                }break;
                default: System.out.println(ANSI_RED + ("Введіть вірно завдання!"));
            }
        }
    }
}
