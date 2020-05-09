package oop.inheritance;

public class Father {


    public String favoriteDish="Kabab";
    public String favoriteTVChannel="CNN";
    public String GrandfatherIdNumber="26778889";

    public String getFatherSSN() {
        return fatherSSN;
    }

    public void setFatherSSN(String fatherSSN) {
        this.fatherSSN = fatherSSN;
    }

    private String fatherSSN="44998766";

    public Father() {
    }

    public Father(String favoriteDish) {
        this.favoriteDish = favoriteDish;
    }


    public Father(String favoriteDish, String favoriteTVChannel) {
        this.favoriteDish = favoriteDish;
        this.favoriteTVChannel = favoriteTVChannel;
    }


    public Father(String favoriteDish, String favoriteTVChannel, String grandfatherIdNumber) {
        this.favoriteDish = favoriteDish;
        this.favoriteTVChannel = favoriteTVChannel;
        GrandfatherIdNumber = grandfatherIdNumber;
    }



}



