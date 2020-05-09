package oop.inheritance;

public class Grandfather {


    public String favoriteDish="Chicken Tandoori";
    public String favoriteTVChannel="National Geography";
    public String GrandfatherIdNumber="2345678";

    private String GrandfatherSSN="444777999";



    public Grandfather() {
    }

    public Grandfather(java.lang.String favoriteDish) {
        this.favoriteDish = favoriteDish;
    }

    public String getGrandfatherSSN() {
        return GrandfatherSSN;
    }

    public void setGrandfatherSSN(String grandfatherSSN) {
        GrandfatherSSN = grandfatherSSN;
    }

    public Grandfather(String favoriteDish, String favoriteTVChannel, String grandfatherIdNumber) {
        this.favoriteDish = favoriteDish;
        this.favoriteTVChannel = favoriteTVChannel;
        GrandfatherIdNumber = grandfatherIdNumber;
    }

    public Grandfather(java.lang.String favoriteDish, java.lang.String favoriteTVChannel) {
        this.favoriteDish = favoriteDish;
        this.favoriteTVChannel = favoriteTVChannel;
    }

















}
