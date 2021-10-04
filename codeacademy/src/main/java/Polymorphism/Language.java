package Polymorphism;

public class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionSpoken;
    protected String wordOrder;

    Language( String langName, int speakers, String regions, String wdOrder) {
        this.name = langName;
        this.numSpeakers = speakers;
        this.regionSpoken = regions;
        this.wordOrder = wdOrder;
    }

    public void getInfo(){
        System.out.println( name + " is spoken by " + numSpeakers + "  people mainly in " + regionSpoken);
        System.out.println( "The language follows the word order: " + wordOrder);
    }

    public static void main(String[] args) {
        Language spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
        spanish.getInfo();
        Mayan kiche = new Mayan("Kʼicheʼ", 2330000);
        kiche.getInfo();
        SinoTibetan sn = new SinoTibetan("Chinese", 1000000000);
        sn.getInfo();

        SinoTibetan mandarinChinese = new SinoTibetan("Mandarin Chinese", 920000000);
        mandarinChinese.getInfo();
        SinoTibetan burmese = new SinoTibetan("Burmese", 3000000);
        burmese.getInfo();
    }
}