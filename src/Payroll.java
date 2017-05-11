import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
                "Vicky James"));


        salary.addAll(Arrays.asList(60569,
                81603,
                86281,
                84186,
                85775,
                75144,
                82162,
                98915,
                83207));
    }

    void printList() {
        int i = 0;

        while (i < employees.size()) {
            System.out.println("Employee Name: " + employees.get(i));
            System.out.println(" Salary: " + salary.get(i));
            i = i + 1;
        }
    }
}
