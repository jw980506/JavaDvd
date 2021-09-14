package Entity;

import java.util.UUID;

public class DvdEntity {
    private int dvdNumber;                      //DVD 번호
    private UUID isbn;                          //ISBN
    private int dvdLaunchYear;                  //출시년
    private String dvdName;                     //DVD 이름
    private String production;                  //제작사
    private String genre;                       //DVD 장르
    private int rentalCount;                    //전체 대여횟수
    private float dvdRating;                    //평점
    private boolean rental;                     //대여여부
    private String rentalName;                  //현재 대여중인 회원

    //기본 생성자
    public DvdEntity() { }

    // 생성자 생성
    public DvdEntity(int dvdNumber, int dvdLaunchYear, String dvdName, String production, String genre, int rentalCount, float dvdRating, boolean rental, String rentalName) {
        this.dvdNumber = dvdNumber;
        this.dvdLaunchYear = dvdLaunchYear;
        this.dvdName = dvdName;
        this.production = production;
        this.genre = genre;
        this.rentalCount = rentalCount;
        this.dvdRating = dvdRating;
        this.rental = rental;
        this.rentalName = rentalName;
    }

    public int getDvdNumber() { return dvdNumber; }
    public void setDvdNumber(int dvdNumber) { this.dvdNumber = dvdNumber; }


    public int getDvdLaunYear() { return dvdLaunchYear; }
    public void setDvdLaunYear(int dvdLaunYear) { this.dvdLaunchYear = dvdLaunYear; }


    public String getDvdName() { return dvdName; }
    public void setDvdName(String dvdName) { this.dvdName = dvdName; }


    public String getProduction() { return production; }
    public void setProduction(String production) { this.production = production; }


    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }


    public int getRentalCount() { return rentalCount; }
    public void setRentalCount(int rentalCount) { this.rentalCount = rentalCount; }


    public float getDvdRating() { return dvdRating; }
    public void setDvdRating(float dvdRating) { this.dvdRating = dvdRating; }


    public boolean isRental() { return rental; }
    public void setRental(boolean rental) { this.rental = rental; }

}// End class