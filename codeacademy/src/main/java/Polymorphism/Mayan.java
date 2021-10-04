package Polymorphism;

class Mayan extends Language{
    Mayan (String langName, int speakers) {
        super(langName, speakers, "Central America", "verb-object-subject");
    }

    @Override
    public void getInfo() {
        System.out.println( name + " is spoken by " + numSpeakers + "  people mainly in " + regionSpoken);
        System.out.println( "The language follows the word order: " + wordOrder);
        System.out.println("Fun fact: " + name + " is an ergative language.");
    }

}