import java.util.Scanner;
//прерывание ctrl+d
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String a = scanner.next();
        } catch (RuntimeException a){
            System.out.println("Вы должны ввести строку");
        }
    }
}
