package kiosklv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Start: ");
        String startBtn = scanner.nextLine();

        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1. ShackBurger    | ₩ 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        System.out.println("2. SmokeShack     | ₩ 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        System.out.println("3. CheeseBurger   | ₩ 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        System.out.println("4. Hamburger      | ₩ 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
        System.out.println("0을 입력하면 종료됩니다");
        System.out.print("주문을 원하시는 메뉴 번호를 입력해주세요: ");

        int orderNum = scanner.nextInt();
        scanner.nextLine();

        if(orderNum == 1) {
            System.out.println("1. ShackBurger    | ₩ 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        } else if (orderNum == 2) {
            System.out.println("2. SmokeShack     | ₩ 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        } else if (orderNum == 3) {
            System.out.println("3. CheeseBurger   | ₩ 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        } else if (orderNum == 4) {
            System.out.println("4. Hamburger      | ₩ 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
        } else if (orderNum == 0) {
            System.out.println("종료되었습니다");
        }


    }
}
