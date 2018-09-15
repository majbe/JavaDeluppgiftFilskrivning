import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author glgren
 */
public class Betygssattning {

    public static void main(String[] args) throws FileNotFoundException, IOException {
            //Kollar ifall filen hittas
            //
            try {
                File studentfil = new File("studentfil");
                File betygsfil = new File("betygsfil");
                int antalVgUppgifter = 2;

                ArrayList<Student> studenter = lasStudentfil(studentfil, antalVgUppgifter);
                skrivBetygsfil(studenter, betygsfil);
            }catch(FileNotFoundException ex){
                System.out.println("Kunde inte hitta filen...");
            }catch(IOException ex){
                System.out.println("Något gick fel...");
            }
    }

            /**
             * LÃ¤ser in en textfil dÃ¤r posterna har formatet: efternamn;fÃ¶rnamn;b;b;b;b
             * dÃ¤r b Ã¤r nÃ¥got av betygen vg, g eller u
             *
             * @param studentfil
             * @param antalVgUppgifter
             * @return en lista med Student-objekt
             * @throws FileNotFoundException
             */
            public static ArrayList<Student> lasStudentfil(File studentfil,int antalVgUppgifter) throws IOException {
                // skriv kod for filinlasning har

                String efternamn;
                String fornamn;
                //Kollar så inläsningen av filen fungerar
                //Läser in filen och delger olika attribut för varje ";"
                try {

                    BufferedReader file = new BufferedReader(new FileReader("studentfil.txt"));
                    ArrayList<Student> list = new ArrayList<>();
                    String data = null;
                    Student tmpStudent;

                    while ((data = file.readLine()) != null) {
                        String[] tmp = data.split(";");

                        String[] uppgiftsbetyg = new String[4];
                        efternamn = tmp[0];
                        fornamn = tmp[1];
                        uppgiftsbetyg[0] = tmp[2];
                        uppgiftsbetyg[1] = tmp[3];
                        uppgiftsbetyg[2] = tmp[4];
                        uppgiftsbetyg[3] = tmp[5];


                        tmpStudent = new StudentImplementation(fornamn, efternamn, uppgiftsbetyg, antalVgUppgifter);
                        list.add(tmpStudent);

                    }
                    file.close();
                    return list;
                } catch(IOException ex){
                    System.out.println("Något gick fel vid läsningen av filen...");
                }


                return null;

            }

            /**
             * Skriver studenternas namn samt kursbetyg till filen betygsfil
             *
             * @param list      en lista med Student-objekt
             * @param betygsfil
             * @throws IOException
             */
            public static void skrivBetygsfil (List < Student > list, File betygsfil) throws IOException {
// skriv kod for filskrivning har

                //Skriver över filen med de nya betygen
                //Kollar ifall överskrivningen av filen går till korrekt
                try {
                    BufferedWriter wr = null;
                    wr = new BufferedWriter(new FileWriter(betygsfil));

                    for (int i = 0; i < list.size(); i++) {
                        wr.write(list.get(i) + "Slutbetyg: " + list.get(i).getKursbetyg() + "\n");
                    }

                    wr.close();
                    System.out.println("Betygsfilen är klar...");

                } catch (IOException ex) {
                    System.out.println("Något gick fel vid skrivning till filen... Prova igen.");
                }

            }

        }


