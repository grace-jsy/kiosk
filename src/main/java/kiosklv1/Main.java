package kiosklv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String startBtn = "Start";

        while(true) {
            System.out.print("Enter Start: ");
            startBtn = scanner.nextLine();

            if (startBtn.equalsIgnoreCase("start")) {
                break;
            } else {
                System.out.println("Wrong text, try again");
            }
        }

        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1. ShackBurger    | ₩ 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        System.out.println("2. SmokeShack     | ₩ 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        System.out.println("3. CheeseBurger   | ₩ 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        System.out.println("4. Hamburger      | ₩ 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
        System.out.println("0. Close          | Close |");
        System.out.print("Your menue Number: ");


        while (startBtn.equalsIgnoreCase("start")) {
            int inputMenuNum = scanner.nextInt();

            if (inputMenuNum == 0) {
                System.out.println("Exiting the program.");
                break;
            } else if (inputMenuNum < 1 || inputMenuNum > 4) {
                System.out.println("Wrong Number");
                System.out.print("Your menu Number: ");
            } else {
                System.out.println("Your menu is " + inputMenuNum);
                break;
            }
        }
    }
}
