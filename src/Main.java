import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<String> list = new ArrayList<String>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while(true){
            System.out.println("Выберете операцию: 1 - добавить, 2 - показать, 3 - удалить.");
            byte op = sc.nextByte();
            if(op == 1) {
                addBuy();
            }
            if(op == 2) showBuys();
            if(op == 3) removeBuy();
        }
    }

    private static void addBuy(){
        sc.nextLine();
        System.out.println("Какую покупку хотите добавить?");
        String s = sc.nextLine();
        list.add(s);
        System.out.println("Итого в списке покупок: " + list.size());
    }

    private static void showBuys(){
        System.out.println("Список покупок:");
        int i = 1;
        for(String s : list) {
            System.out.print(i +". ");
            System.out.println(s);
            i++;
        }
    }

    private static void removeBuy(){
        sc.nextLine();
        System.out.println("Какую хотите удалить? Введите номер или название");
        String s = sc.nextLine();
        int number = -1;
        try {
            number = Integer.parseInt(s) - 1;
        } catch (NumberFormatException e) {
            //error
            number = list.indexOf(s);
        }
        s = list.get(number);
        list.remove(number);
        System.out.println("Покупка \"" + s + "\" удалена.");
        showBuys();
    }
}