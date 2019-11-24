/**
 *
 *
 * @author AmariBolmer
 * Student ID: 
 * Student Email : 
 */
package java_dictionaryproject;

import java.util.Scanner;

public class Java_DictionaryProject {

    public enum CSCoreClasses {
        CSC210(" [Verb] : To learn Java.", " [Noun] : Intro to learn Java.", " [adjective] : Comfortable with Objects and Classes.,ready for CSC 220"),
        CSC220(" [Verb] : Ready to create complex data structres", " [Noun] : Data Structures", " [adjective] : To create data structures"),
        CSC340(null, " [Noun] : A CS uppder division course., Many hours outside of class", " [adjective] : = C++ version of CSC210 + CSC220 + more"),
        Bookable(null, null, " [adjective] : can be ordered."),
        Bookbinder(null, " [Noun] : A person who fastens the pages of books", null),
        Bookcase(null, " [Noun] : A piece of furniture with shelves.", null),
        Book(" [Verb] : To arrange something on a particular date.", " [Noun] : A set of pages.", null);

        //verb -> noun -> adjective
        private final String verb;//String cDesc;
        private final String noun;//int cNum;
        private final String adjective;//String cTittle;

        private CSCoreClasses(String verb, String noun, String adjective) {
            this.verb = verb;
            this.noun = noun;
            this.adjective = adjective;
        }

        public String getNoun() {
            return noun;
        }

        public String getVerb() {
            return verb;
        }

        public String getAdjective() {
            return adjective;
        }

          @Override
        public String toString() {
            return this.name() + ": " + this.noun + "\n" + " "
                    + this.name() + ": " + this.verb + "\n"
                    + this.name() + ": " + this.adjective;
        }
         
    }

    public static void checkinput(String take) {  //one method to excute the search of the enum
        String[] splitT = new String[2];
        boolean found = false;

        if (take.contains(" ")) { //condition for if input contains whitespace
            if (take.indexOf(" ") == take.length()) {  //special case if statement to ignore whitespace after input
                splitT[0] = take;
                splitT[1] = null;
            } else {
                splitT = take.split(" "); //takes two inputs or one and 
            }                             //seperates by white space
        } else {                //handles case if take does not have white space
            splitT[0] = take;
            splitT[1] = null;
        }

        for (CSCoreClasses entry : CSCoreClasses.values()) {  //for loop
            if (entry.name().equalsIgnoreCase(splitT[0])) {  //if statement with data loop that looks for entry's name also ignores case
                if (splitT[1] == null) { //nested loop for if input is only 1 word and outputs only what the enum class holds
                    found = true;
                    if (entry.getVerb() != null) {
                        System.out.print("\t " + entry.name() + entry.getVerb() + "\n");
                    }
                    if (entry.getNoun() != null) {
                        System.out.print("\t " + entry.name() + entry.getNoun() + "\n");
                    }
                    if (entry.getAdjective() != null) {
                        System.out.print("\t " + entry.name() + entry.getAdjective() + "\n");
                    }
                } else {
                    switch (splitT[1]) {            //data structure to find if object contains noun verb or adjective or default wrong input
                        case "noun":
                            if (entry.getNoun() != null) {
                                System.out.print("\t " + entry.name() + entry.getNoun() + "\n");
                                found = true;
                            } else {
                                found = false;
                            }
                            break;
                        case "verb":
                            if (entry.getVerb() != null) {
                                System.out.print("\t " + entry.name() + entry.getVerb() + "\n");
                                found = true;
                            } else {
                                found = false;
                            }
                            break;
                        case "adjective":
                            if (entry.getAdjective() != null) {
                                System.out.print("\t " + entry.name() + entry.getAdjective() + "\n");
                                found = true;
                            } else {
                                found = false;
                            }
                            break;
                        default:
                            System.out.println("\t <2nd argument must be a part of speech>");
                            found = true; // Because the argument is true if you go over the amount of inputs
                    }
                }
            }
        }
        if (found == false) {
            System.out.println("\t <Not Found>");
        }
    }

    public static void main(String[] args) {

        System.out.print("-----Dictionary 340 Standard-----\n");

        Scanner scanner = new Scanner(System.in);
        Boolean bool = false; //Boolean to create while loop

        while (bool == false) { //while loop to control flow of program until user inputs "!Q" into console.
            System.out.print("Search: ");
            String input1 = scanner.nextLine();
            if (input1.equals("!Q")) {
                System.out.println("\n----THANK YOU----\n");
                break;
            }
            System.out.println("\t|");
            checkinput(input1);
            System.out.println("\t|");
        } 

    }

}
