/**
 *
 *
 * @author AmariBolmer
 * Student ID: 
 * Student Email : 
 */
package java_dictionaryproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author AmariBolmer
 */
public class StandardProjectDictionary {

    public enum CSCoreClasses {

        CSC210(" : Intro to learn Java.", " : To learn Java.", " : Comfortable with Objects and Classes.", " : Ready for CSC 220"),
        CSC220(" : Data Structures", " : Ready to create complex data structres", " : To create data structures", null),
        CSC340(" : = C++ version of CSC210 + CSC220 + more+", " :  A CS upper division course"," : Many hours outside of class.", null),
        Book(" : A set of pages", " : To arrange something on a particular date", null, null),
        Bookable(" : Can be ordered", null, null, null),
        Bookbinder(" : A person who fastens the pages of books", null, null, null),
        Bookcase(" : A piece of furniture with shelves", null, null, null);

        private String CSCclass;
        private String noun;//int cNum;
        private String verb;//String cDesc;
        private String adjective;//String cTittle;

        private CSCoreClasses(String CSCclass, String noun, String verb, String adjective) {
            this.CSCclass = CSCclass;
            this.noun = noun;
            this.verb = verb;
            this.adjective = adjective;
        }

        public String getCSCclass() {
            return CSCclass;
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
            return "\t " + this.name() + ": " + this.CSCclass + "\n"
                     +"\t " + this.name() + ": " + this.noun + "\n"
                    + "\t " +this.name() + ": " + this.verb + "\n"
                    + "\t " +this.name() + ": " + this.adjective;
        }
         
        public static void main(String[] args) {
            // create map to store
            Map<String, List<String>> map = new HashMap<String, List<String>>();
            // create list one and store values
            List<String> valSetOne = new ArrayList<String>();
            // CSCoreClasses CSC210 = CSC210;
            //   for(CSCoreClasses entry : CSCoreClasses.values()){
            valSetOne.add(CSC210.toString());
            // create list two and store values
            List<String> valSetTwo = new ArrayList<String>();
            
            valSetTwo.add(CSC220.toString());//-00afiahpfodhaf
            // create list three and store values
            List<String> valSetThree = new ArrayList<String>();
            valSetThree.add(CSC340.toString());
            List<String> valSetFour = new ArrayList<String>();
            valSetFour.add(CSC210.toString());
            List<String> valSetFive = new ArrayList<String>();
            valSetFive.add(Bookable.toString());
            List<String> valSetSix = new ArrayList<String>();
            valSetSix.add(Bookbinder.toString());
            List<String> valSetSeven = new ArrayList<String>();
            valSetSeven.add(Bookcase.toString());
            // put values into map
            map.put("csc210", valSetOne);
            map.put("csc220", valSetTwo);
            map.put("csc340", valSetThree);
            map.put("book", valSetFour);
            map.put("bookable", valSetFive);
            map.put("bookbinder", valSetSix);
            map.put("bookCase", valSetSeven);
            
            //search for the key
            boolean bool = false;

            while (bool == false) {
                System.out.print("Search : ");
                Scanner scanner = new Scanner(System.in);
                String searchStr = scanner.next();
                if (searchStr.equals("!Q")) {
                    System.out.println("\n----THANK YOU----\n");
                    break;
                }
                    List<String> values = map.get(searchStr.toLowerCase());
                                    System.out.println("\t|");
                    if (values == null) {
                        System.out.println("\t <Not Found>");
                    } else {
                      for (CSCoreClasses entry : CSCoreClasses.values()) {
                         if (entry.name().equalsIgnoreCase(searchStr)){
                            if (entry.getCSCclass() != null) {
                            System.out.print("\t " + entry.name() + entry.getCSCclass() + "\n");
                            }
                            if (entry.getVerb() != null) {
                            System.out.print("\t " + entry.name() + entry.getVerb() + "\n");
                            }
                            if (entry.getNoun() != null) {
                             System.out.print("\t " + entry.name() + entry.getNoun() + "\n");
                            }
                            if (entry.getAdjective() != null) {
                            System.out.print("\t " + entry.name() + entry.getAdjective() + "\n");
                        }
                      }
                    }
                }
                System.out.println("\t|");
            }
        }
    }
}
 
