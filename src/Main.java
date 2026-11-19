import java.util.Scanner;

/**
 * Любая Java-программа создается в классе
 * Класс должен называться также как и файл, в котором он будет находиться
 */
public class Main {

    /**
     * Точка входа. Отсюда запускается исполнение кода
     */
    public static void main(String[] args) {
        System.out.println("Hello, Java!");      // Вывод текста на консоль

        String str;  // Декларация переменной

        str = "text"; // Инициализация переменной

        /*
        Синтаксис работы с переменными в Java

        Тип  имя = значение, например

        Car car = new Car(); - созздает переменную типа Car, называет ее car и присваивает ей ссылку на объект

        В Java существуют 8 примитивных типов, таким образом реализуется стандарт IEEE 754:

        Целые числа
        byte   - 8 бит
        short  - 16 бит
        int    - 32 бита
        long   - 64 бита

        Числа с плавающей точкой
        float  - 32 бита
        double - 64 биты

        Символьный тип
        char  - 16 бит

        Логическая переменная
        boolean - размерность типа зависит от версии JDK, как правило, 32 бита
         */
        byte g= 8;
        double h=7.77;
        char l='l';
        boolean q =true;
        double [] arr = new double[15];
        Scanner sc = new Scanner(System.in);
        int head =1;
        int body =1;
        int legs=2;
        int arms =2;
        int ans=0;
        Car car = new Car(g,10,q);
        Car [] cars = new Car[3];
        cars[0]=car;
        int r=car.getD();
        int i = 6;
        int s=cars[0].getD();
        Human human1 = new Human(head,body,legs,arms,"alex");
        human1.walk();
        String input= sc.next();
        int jsl=human1.getBody();
        System.out.println("Переменная i = " + i + "\n" + g);
        Cat cat1 = new Cat(input);
        cat1.play();
        cat1.take_a_walk();
        double d = 56.345;

        System.out.println("Переменная d = " + d);
        while(true){

            System.out.println("введите числа с которыми хотите произвести опперацию");

            int i1= sc.nextInt();
            int i2= sc.nextInt();
            MathPR cal1=new MathPR(i1,i2);
            System.out.println("введите знак");
            char po= sc.next().charAt(0);
            if (po=='+'){
                ans=cal1.add();
            }
            else if(po=='-') {
                ans=cal1.sub();
            }
            else if(po=='*'){
                ans=cal1.mul();
            }
            else if(po=='/'){
                ans=cal1.div();
            }
            System.out.println("Ответ = "+ ans);
            System.out.println("Хотите ли продолжить?(yes/no)");
            char ans2= sc.next().charAt(0);

            if (ans2=='n'){
                break;
            }
        }
    }
}