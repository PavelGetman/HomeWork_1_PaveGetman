public class RandomGeneratorDemo {

    public static void main(String[] args){
        int a = (int) (Math.random() * (200 + 1)) - 100;
        int b = (int) (Math.random() * (200 + 1)) - 100;
        int c = (int) (Math.random() * (200 + 1)) - 100;

        int d = a + b + c;

        System.out.println("Первое число" + " - " + a);
        System.out.println("Второе число" + " - " + b);
        System.out.println("Третье число" + " - " + c);

        System.out.println("Сумма чисел" + " - " + d);
    }

}


    /*Функциональные требования:
        1. Сгенерировать 3 случайных числа и вывести их на экран.
        2. Посчитать сумму этих чисел и вывести результат на экран.

        Нефункциональные требования:

        1. Класс с демонстрацией должен называться "RandomGeneratorDemo".
        2. Генерировать числа можно используя классы "Random" или "Math".*/