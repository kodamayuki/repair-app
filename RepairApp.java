import java.util.ArrayList;
import java.util.Scanner;

public class RepairApp {
    public static void main(String[] args) {

        ArrayList<String> repairList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("修理受付");

        while (true) {
            System.out.println("\n[1]登録 [2]一覧 [0]終了");
            System.out.print("番号選択: ");
            String choice = sc.nextLine();

            if (choice.equals("0")) {
                System.out.println("終了");
                break;

            } else if (choice.equals("1")) {
                System.out.print("氏名: ");
                String name = sc.nextLine();
                System.out.print("機種名: ");
                String model = sc.nextLine();
                repairList.add(name + "様 (" + model + ")");
                System.out.println("登録完了");

            } else if (choice.equals("2")) {
                System.out.println("受付一覧");
                for (int i = 0; i < repairList.size(); i++) {
                    System.out.println((i + 1) + "件目: " + repairList.get(i));
                }

            } else {
                System.out.println("1,2,0,入力");
            }
        }
    }
}