import java.sql.SQLOutput;
import java.util.Scanner;
public class CafeReceipt {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("메뉴이름: 아메리카노: 3000, 카페모카: 4000, 카페라떼: 5000, 카라멜마끼아또: 5000 중에 골라주세요. :");
        String menuName = scanner.nextLine();

        System.out.print("몇 잔 하실거에요?: ");
        int count = scanner.nextInt();

        System.out.print("잔당 가격: ");
        int pricePerCup = scanner.nextInt();
        int totalPrice = count * pricePerCup;
        System.out.println("총 가격: " + totalPrice);

        System.out.println("테이크 아웃 여부: true, false로 써주세요.");
        boolean isTakeout = scanner.nextBoolean();
        if(isTakeout == true) {
            System.out.println("총 가격: " + 0.8 * totalPrice);
        }
        else if(!isTakeout) {
            System.out.println("총 가격: " + totalPrice);
        }
    }
}
