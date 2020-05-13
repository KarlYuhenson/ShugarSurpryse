import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<Sweets> sweets = new ArrayList<>();
        boolean formed = false;
        double totalPrice = 0.00;
        double totalWeight = 0.00;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Нажмите номер пункта, чтобы добавить продукт в подарок:");
        System.out.println("'1' - конфеты \"Snikers\"");
        System.out.println("'2' - конфеты \"Chupa-chups\"");
        System.out.println("'3' - печенье \"Юбилейное\"");
        System.out.println("'4' - закончить выбор");
        while (!formed) {

            String choice = reader.readLine();

            switch (choice) {
                case "1":
                    Сandies candySnikers = new Сandies("Конфеты \"Snikers\"", 100, 15.99, "Есть орехи");
                    sweets.add(candySnikers);
                    totalPrice += candySnikers.getPrice();
                    totalWeight += candySnikers.getWeight();
                    System.out.println("Конфеты \"Snikers\" добавлены в подарок");
                    break;
                case "2":
                    Сandies candyChupa = new Сandies("Конфеты \"Chupa-chups\"", 50, 7.88, "Нет орехов");
                    sweets.add(candyChupa);
                    totalPrice += candyChupa.getPrice();
                    totalWeight += candyChupa.getWeight();
                    System.out.println("Конфеты \"Chupa-chups\" добавлены в подарок");
                    break;
                case "3":
                    Сookies yubileynoe = new Сookies("Печенье \"Юбилейное\"", 200, 100.66, "Нет орехов");
                    sweets.add(yubileynoe);
                    totalPrice += yubileynoe.getPrice();
                    totalWeight += yubileynoe.getWeight();
                    System.out.println("Печенье \"Юбилейное\" добавлен в подарок");
                    break;
                case "4":
                    formed = true;
                    break;
            }


        }
        int count = 0;
        System.out.println("\nСодержимое подарка:");
        for (Sweets sweet:sweets) {
            count++;
            System.out.println(count + ". " + sweet.getName() + " - " + sweet.getUniqueParameter());
        }
        System.out.println(String.format("\nОбщий вес подарка: %s гр.\nОбщая сумма подарка: %s руб.", totalWeight, totalPrice));
    }

}

//        Сущности:
//        Базовый абстрактный класс для всех видов сладостей и конкретные сладости, наследующиеся от базового,
//        Интерфейс коробочки с методами: добавить, удалить (по индексу/либо  последний) сладость, вывести вес, стоимость коробочки, вывести всю информацию обо всех сладостях,
//        Конкретные реализации интерфейса коробочки. Внутри коробочка  содержит массив сладостей и работает с ними. Вне коробочки сам массив  недоступен,
//        Умная оптимизация подарка с методом reduceWeight(double weight),  которая удаляет сладости с меньшим весом из коробочки до тех пор, пока  вес коробочки не станет меньше входного параметра. Аналогично для цены.
