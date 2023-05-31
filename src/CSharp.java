// Klasse CSharp erweitert Programmiersprache
public class CSharp extends Programmiersprache {
    // Feld: statisch getypt
    private boolean istStatischGetypt;

    // Hauptkonstruktor
    public CSharp(String name, String erfinder, boolean istStatischGetypt) {
        // Aufruf Hauptkonstruktor Superklasse
        super(name, erfinder);
        // Initialisiere Feld
        this.istStatischGetypt = istStatischGetypt;
    }

    // Standardkonstruktor
    public CSharp() {
        // Aufruf Hauptkonstruktor mit Default-Werten
        super("C#", "Anders Hejlsberg");
        // Setze Feld auf true
        this.istStatischGetypt = true;
    }

    // Überschreibt printInfo der Superklasse
    @Override
    public void printInfo() {
        // Ruft Methode der Superklasse auf
        super.printInfo();
        // Zusätzliche Ausgabe
        System.out.println("Ist statisch getypt: " + (istStatischGetypt ? "Ja" : "Nein"));
    }
}