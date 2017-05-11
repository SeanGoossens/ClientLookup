import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sgoossens on 5/11/2017.
 */
public class Payroll {
    private List<String> employees;
    private List<Integer> salary;

    Payroll() {
        employees = new ArrayList();
        salary = new ArrayList();


        employees.addAll(Arrays.asList("Abigail Aalderink",
                "Sanford Bartolo",
                "Samuel Bartnick",
                "John Dumas",
                "Kristi Hines",
                "Apple Lyn",
                "Lee Nazal",
                "Lindsy Kline",
                "Vicky James",
                "Bradley Sack",
                "Steven Lamar",
                "Tom Briones",
                "Mike O'Neil",
                "Elly Kam",
                "Steven Davidson",
                "Nate Harris",
                "Bryan Sloane",
                "Chris Borgogni",
                "David Goods",
                "Chatsworth Miller",
                "Stephanie Miller",
                "Scott Joyce",
                "Mary Oms",
                "Jaremy Davis",
                "Darrel Hobbs",
                "David Jones",
                "Mitch Gramlow",
                "Valerie Stevens",
                "Andrew Gupta",
                "Sam Zaborszky",
                "Joe Keenan",
                "Susan Ricas",
                "Peter Bowland",
                "Jonny Chan",
                "Richard David",
                "Matt Baker",
                "Annie Hunter",
                "Jake Prock",
                "Daniel Turek",
                "James Sperman",
                "Mark Cox",
                "David Jones",
                "Steven Perry",
                "Scott Jastrow",
                "Lorna Walker",
                "Mai Taylor",
                "Bobbi Simon",
                "Robert Nole",
                "Irene Pawell",
                "Sarah Smith",
                "Jake Fann",
                "Daniella Ruder",
                "Caylie Price",
                "Emily Bodenham"


                ));


        salary.addAll(Arrays.asList(60569,
                81603,
                86281,
                84186,
                85775,
                75144,
                82162,
                98915,
                83207,
                64717,
                64931,
                70988,
                72254,
                63434,
                62637,
                70556,
                74243,
                89758,
                79876,
                71358,
                84889,
                63713,
                62108,
                65200,
                98302,
                99458,
                89276,
                72179,
                92985,
                85065,
                75120,
                95055,
                65722,
                60682,
                95459,
                60623,
                60691,
                62774,
                74419,
                68451,
                68685,
                66117,
                61173,
                94358,
                62552,
                69213,
                65237,
                69573,
                61225,
                86438,
                99196,
                71400,
                62683,
                77380
                ));
    }

    void printList() {
        int i = 0;

        while (i < employees.size()) {
            System.out.println("Employee: " + employees.get(i));
            System.out.println("Salary: " + salary.get(i));
            System.out.println("");
            i = i + 1;
        }
    }
    void returnEmployeeSalary() {
        int i = 0;
        System.out.println("Type an employee to check their Salary: ");
        Scanner check = new Scanner(System.in);
        String lookup = check.nextLine();
        while (i < employees.size()) {
            if (lookup.matches(employees.get(i))) {
                System.out.println(lookup + "'s salary is " + salary.get(i));
                break;
            } else {
                i++;
            }
        }

    }
}
