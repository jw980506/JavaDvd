package TestMain;

import Controller.DvdController;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        // 객체 생성
        DvdController ctrl = new DvdController();

        int selnum;

        while (true) {
            System.out.println("****메뉴입니다****");
            System.out.println("1. Insert - 등록");
            System.out.println("2. Show - 조회");
            System.out.println("3. Modify - 수정");
            System.out.println("4. Delete - 삭제");
            System.out.println("5. Exit - 프로그램 종료");
            System.out.println("****************");
            System.out.print("원하시는 메뉴 번호를 선택하세요 : \n");

            selnum = sc.nextInt();  // 문자입력했을시 오류가 안뜨게 하고 예외처리?
            switch (selnum) {
                case 1:
                    ctrl.insert();
                    break;
                case 2:
                    ctrl.show();
                    break;
                case 3:
                    ctrl.modify();
                    break;
                case 4:
                    ctrl.delete();
                    break;
                default:
                    System.out.println("프로그램을 종료합니다");
                    System.exit(0);
           }
        }
    }
}
