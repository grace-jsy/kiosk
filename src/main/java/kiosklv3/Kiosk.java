package kiosklv3;

import java.util.List;
import java.util.Scanner;

public class Kiosk {

    // MenuItem을 관리하는 리스트 필드가 존재
    private List<MenuItem> menuItems;


    // List<MenuItem> menuItems는 Kiosk 생성자를 통해 값 할당
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    // main에 있던 입력과 반복문 로직을 start 함수를 만들어 관리
    public void start() {

        Scanner scanner = new Scanner(System.in);
        String startBtn = "Start";

        while(true) {
            System.out.print("Enter Start: ");
            startBtn = scanner.nextLine();

            if (startBtn.equalsIgnoreCase("start")) {
                break;
            } else {
                System.out.println("Wrong text, try again: ");
            }
        }

        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1. ShackBurger    | ₩ 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        System.out.println("2. SmokeShack     | ₩ 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        System.out.println("3. CheeseBurger   | ₩ 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        System.out.println("4. Hamburger      | ₩ 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
        System.out.println("0. Close          | Close |");
        System.out.print("Your menu Number: ");


        while (startBtn.equalsIgnoreCase("start")) {
            int inputMenuNum = scanner.nextInt();
            scanner.nextLine();

            switch (inputMenuNum) {
                case 1:
                    System.out.println("Your Menu is: " + menuItems.get(0));
                    System.out.print("Menu Number or '0' for exit: ");
                    break;
                case 2:
                    System.out.println("Your Menu is: " + menuItems.get(1));
                    System.out.print("Menu Number or '0' for exit: ");
                    break;
                case 3:
                    System.out.println("Your Menu is: " + menuItems.get(2));
                    System.out.print("Menu Number or '0' for exit: ");
                    break;
                case 4:
                    System.out.println("Your Menu is: " + menuItems.get(3));
                    System.out.print("Menu Number or '0' for exit: ");
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.print("Wrong number, try again: ");
                    break;
            }

        }
    }
}


