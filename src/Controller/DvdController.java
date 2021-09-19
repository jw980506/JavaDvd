package Controller;

import Entity.DvdEntity;

import java.util.Scanner;
import java.util.UUID;

public class DvdController {
    Scanner sc = new Scanner(System.in);

    DvdEntity[] dvd = new DvdEntity[50];

    int cnt = 0;

    //등록
    public void insert() {
        System.out.println("\nDVD 등록을 시작합니다");
        System.out.printf("DVD 번호 : ");
        int num = Integer.parseInt(sc.nextLine());
        System.out.printf("출시년 : ");
        int year = Integer.parseInt(sc.nextLine());
        System.out.printf("DVD명 : ");
        String name = sc.nextLine();
        System.out.printf("제작사 : ");
        String pro = sc.nextLine();
        System.out.printf("장르 : ");
        String gen = sc.nextLine();
        System.out.println("ISBN은 자동으로 생성됩니다");
        UUID isbn = UUID.randomUUID();

        System.out.printf("DVD를 등록하시겠습니까? (1.등록, 2.다시입력)");
        int selnum = Integer.parseInt(sc.nextLine());
        if (selnum == 1) {
            //입력받은 내용들을 배열에 저장
            dvd[cnt] = new DvdEntity(num, isbn, year, name, pro, gen);
            cnt++;

            for (int i = 0; i < dvd.length; i++) {
                System.out.println("\n***DVD 등록 완료***");
                System.out.println("DVD 번호 : " + dvd[i].getDvdNumber());
                System.out.println("출시년 : " + dvd[i].getDvdLanunchYear());
                System.out.println("DVD명 : " + dvd[i].getDvdName());
                System.out.println("제작사 : " + dvd[i].getGenre());
                System.out.println("장르 : " + dvd[i].getGenre());
                System.out.println("ISBN : \n" + dvd[i].getIsbn());
                break;
            }
        }
        else if (selnum == 2) {
            insert();
        }
        else {
            System.out.printf("잘못입력하셨습니다");
            System.out.printf("초기화면으로 돌아갑니다");
        }
    }//End 등록

    //조회
    public void show() {
        if (cnt == 0) {
            System.out.printf("\n등록되어 있는 DVD가 없습니다");
            System.out.printf("초기화면으로 돌아갑니다");
        }
        else {
            System.out.println("\n등록되어 있는 DVD목록입니다");

            for (int i=0; i < dvd.length; i++) {
                if (dvd[i] != null) {
                    System.out.println(i + 1 + "번째 DVD 번호 : " + dvd[i].getDvdNumber());
                    System.out.println(i + 1 + "번째 출시년 : " + dvd[i].getDvdLanunchYear());
                    System.out.println(i + 1 + "번째 DVD 명 : " + dvd[i].getDvdName());
                    System.out.println(i + 1 + "번째 제작사 : " + dvd[i].getProduction());
                    System.out.println(i + 1 + "번째 장르 :  " + dvd[i].getGenre());
                    System.out.println(i + 1 + "번째 ISBN : " + dvd[i].getIsbn());
                    System.out.println("\n");
                }
            }
        }
    }//End 조회

    public void modify() {
        System.out.println("수정 메뉴 입니다");
        System.out.printf("수정을 원하시는 인덱스를 입력해주세요 : ");
        System.out.println("수정을 원하시지 않으면 0번을 눌러주세요");
        //수정을 위한 인덱스 대신 받을 변수
        int num = Integer.parseInt(sc.nextLine());

        if (num == 0) {
            System.out.printf("초기 메뉴로 돌아갑니다.");
        }

        else {
            System.out.println("수정 전 DVD 번호 : " + dvd[num - 1].getDvdNumber());
            System.out.println("수정 전 출시년 : " + dvd[num - 1].getDvdLanunchYear());
            System.out.println("수정 전 DVD 명 : " + dvd[num - 1].getDvdName());
            System.out.println("수정 전 제작사 : " + dvd[num - 1].getProduction());
            System.out.println("수정 전 장르 :  " + dvd[num - 1].getGenre());
            System.out.println("------------------------------------\n");

            System.out.printf("수정 할 DVD 번호 : ");
            int number = Integer.parseInt(sc.nextLine());
            System.out.printf("수정 할 출시년 : ");
            int year = Integer.parseInt(sc.nextLine());
            System.out.printf("수정 할 DVD 명 : ");
            String name = sc.nextLine();
            System.out.printf("수정 할 제작사 : ");
            String pro = sc.nextLine();
            System.out.printf("수정 할 장르 : ");
            String gen = sc.nextLine();
            UUID isbn = dvd[num - 1].getIsbn();

            //수정된 내용을 배열에 다시 저장
            dvd[num - 1] = new DvdEntity(number, isbn, year, name, pro, gen);
        }
    }//End 수정

    public void delete() {
        System.out.println("삭제 메뉴 입니다");
        System.out.printf("삭제를 원하는 인덱스를 입력해주세요 : ");

        int num = Integer.parseInt(sc.nextLine());


    }//End 삭제
}//End