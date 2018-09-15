
public class StudentImplementation extends Student{

    public StudentImplementation(String fornamn, String efternamn, String[] uppgiftsbetyg, int antalVgUppgifter){
        super(fornamn, efternamn, uppgiftsbetyg, antalVgUppgifter);
    }
    //Metod för att räkna ut vilket vetyg varje enskild elev får
    public String getKursbetyg() {
        kursbetyg = "G";
        int antaletVg = 0;
        String[] betyg = getUppgiftsbetyg();

        for (int i = 0; i < betyg.length; i++) {

            if (betyg[i].equals("u")) {
                kursbetyg = "U";
                return kursbetyg;
            }

            if (betyg[i].equals("vg")) {
                antaletVg++;
            }
        }

        if (antaletVg >= getAntalVgUppgifter()) {
            kursbetyg = "VG";
        }

        return kursbetyg;
        }

    //Ändrar mall för utskrift i filen betygsfil
    public String toString(){
        return  "Namn: " + fornamn + ", " + efternamn + " || ";
    }
}
