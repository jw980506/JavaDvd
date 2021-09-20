package TestMain;

import Controller.DvdController;
import Entity.DvdEntity;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.printf("\n");
        Scanner sc = new Scanner(System.in);

        // 객체생성
        DvdController ctrl = new DvdController();

        int selnum;

        while (true) {
            System.out.println();
            System.out.println("***메뉴입니다****");
            System.out.println("1. Inser - 등록");
            System.out.println("2. Show - 조회");
            System.out.println("3. Modify - 수정");
            System.out.println("4. Delete - 삭제");
            System.out.println("5. Exit - 프로그램 종료");
            System.out.println("***************");
            System.out.printf("원하시는 메뉴를 입력해주세요 > ");

            selnum = Integer.parseInt(sc.nextLine());


            switch (selnum) {
                case 1: ctrl.insert();
                    break;

                case 2: ctrl.show();
                    break;

                case 3: ctrl.modify();
                    break;

                case 4: ctrl.delete();
                    break;

                default :
                    System.out.printf("프로그램을 종료합니다");
                    System.exit(0);
            }
        }

    }
}