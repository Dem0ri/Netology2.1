import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите стоимость билета в рублях: ");
        int price = scanner.nextInt();

        System.out.println("За билет стоимостью " + price + " рублей начислено " + UniversalSteps.formula(price) + "миль." );

    }
}
