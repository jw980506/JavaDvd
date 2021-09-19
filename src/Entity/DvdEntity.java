package Entity;

import java.util.UUID;

public class DvdEntity {

    private int dvdNumber;      //DVD번호
    private UUID isbn;          //ISBN
    private int dvdLanunchYear; //출시년
    private String dvdName;     //DVD명
    private String production;  //제작사
    private String genre;       //장르
    private int rentalCount;    //전체 대여 횟수
    private float dvdRating;    //평점
    private boolean rental;    //대여여부
    private String rentalName;  //현재 대여중인 회원


    public DvdEntity(int dvdNumber, UUID isbn, int dvdLanunchYear, String dvdName, String production, String genre) {
        this.dvdNumber = dvdNumber;
        this.isbn = isbn;
        this.dvdLanunchYear = dvdLanunchYear;
        this.dvdName = dvdName;
        this.production = production;
        this.genre = genre;
    }

    //getter and setter
    public int getDvdNumber() {
        return dvdNumber;
    }

    public void setDvdNumber(int dvdNumber) {
        this.dvdNumber = dvdNumber;
    }

    public UUID getIsbn() {
        return isbn;
    }

    public void setIsbn(UUID isbn) {
        this.isbn = isbn;
    }

    public int getDvdLanunchYear() {
        return dvdLanunchYear;
    }

    public void setDvdLanunchYear(int dvdLanunchYear) {
        this.dvdLanunchYear = dvdLanunchYear;
    }

    public String getDvdName() {
        return dvdName;
    }

    public void setDvdName(String dvdName) {
        this.dvdName = dvdName;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRentalCount() {
        return rentalCount;
    }

    public void setRentalCount(int rentalCount) {
        this.rentalCount = rentalCount;
    }

    public float getDvdRating() {
        return dvdRating;
    }

    public void setDvdRating(float dvdRating) {
        this.dvdRating = dvdRating;
    }

    public boolean isRental() {
        return rental;
    }

    public void setRental(boolean rental) {
        this.rental = rental;
    }

    public String getRentalName() {
        return rentalName;
    }

    public void setRentalName(String rentalName) {
        this.rentalName = rentalName;
    }
}

