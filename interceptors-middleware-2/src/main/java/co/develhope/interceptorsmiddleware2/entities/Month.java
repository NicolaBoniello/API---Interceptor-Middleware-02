package co.develhope.interceptorsmiddleware2.entities;

public class Month {

    private Integer montNumber;
    private String englishName;
    private String italianName;
    private String germanName;

    public Month() {
    }

    public Month(Integer montNumber, String englishName, String italianName, String germanName) {
        this.montNumber = montNumber;
        this.englishName = englishName;
        this.italianName = italianName;
        this.germanName = germanName;
    }

    public Integer getMontNumber() {
        return montNumber;
    }

    public void setMontNumber(Integer montNumber) {
        this.montNumber = montNumber;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getItalianName() {
        return italianName;
    }

    public void setItalianName(String italianName) {
        this.italianName = italianName;
    }

    public String getGermanName() {
        return germanName;
    }

    public void setGermanName(String germanName) {
        this.germanName = germanName;
    }
}