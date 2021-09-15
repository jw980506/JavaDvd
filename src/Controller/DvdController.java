package Controller;

import Entity.DvdEntity;
import java.util.Scanner;

public class DvdController {
    Scanner sc = new Scanner(System.in);

    DvdEntity[] dvd = new DvdEntity[50];

    int cnt = 0;

    // Insert 등록
    public void insert() {
        System.out.println("***DVD 등록을 시작합니다***");
        System.out.print("DVD 번호 : ");
        int num = sc.nextInt();
        System.out.print("출시년 : ");
        int year = sc.nextInt();
        System.out.print("DVD 명 : ");
        String name = sc.next();
        System.out.print("제작사 : ");
        String pro = sc.next();
        System.out.print("장르 : ");
        String gen = sc.next();

        //배열에 저장
        dvd[cnt] = new DvdEntity(num, year, name, pro, gen);
        cnt++;


        System.out.print("DVD를 등록 하시겠습니까?(1.등록 2.다시 입력) : ");

        int selnum = sc.nextInt();
        if (selnum == 1) {
            for (int i = 0; i < dvd.length; i++) {
                System.out.println();
                System.out.println("***DVD 등록 완료***");
                System.out.println("DVD 번호 : " + dvd[i].getDvdNumber());
                System.out.println("출시년 : " + dvd[i].getDvdLaunYear());
                System.out.println("DVD 명 : " + dvd[i].getDvdName());
                System.out.println("제작사 : " + dvd[i].getProduction());
                System.out.println("장르 : " + dvd[i].getGenre());
                break;
            }// End for
        }
        else if (selnum == 2) {
                insert();
            }


        else {
            System.out.println("잘못입력하셨습니다.");
            System.out.println("초기화면으로 돌아갑니다.");
            }

    }// End Insert

    // Show 조회
    public void show() {
        if(cnt == 0) {
            System.out.println("등록되어 있는 DVD가 없습니다.");
            System.out.println("초기화면으로 돌아갑니다.\n");
        }
        else {
            System.out.println("***등록되어 있는 DVD 목록입니다.***");

            for (int i=0; i < cnt; i++) {
                if (dvd[i] != null) {
                    System.out.println(cnt  + "번째 DVD 번호 : " + dvd[i].getDvdNumber());
                    System.out.println(cnt  + "번째 출시년 : " + dvd[i].getDvdLaunYear());
                    System.out.println(cnt  + "번째 DVD 명 : " + dvd[i].getDvdName());
                    System.out.println(cnt  + "번째 제작사 : " + dvd[i].getProduction());
                    System.out.println(cnt  + "번째 장르 : " + dvd[i].getGenre());
                }
            }
        }

    }// End Show

    // Modify 수정
    public void modify() {

    }// End Modify

    // Delete 삭제
    public void delete() {

    }// End Delete

}// End class