import java.util.Scanner;

import static java.lang.Float.valueOf;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
//        Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Object a = scanner.next();
        System.out.println(inputFloat(a));
    }

    public static float inputFloat(Object a) {
        Scanner scanner = new Scanner(System.in);
        try {
            return valueOf((String) a);
        } catch (NumberFormatException e) {
        }
        return inputFloat(scanner.next());
    }
}
