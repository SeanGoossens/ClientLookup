import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sgoossens on 5/12/2017.
 */
public class Stocks {

    private List<String> ticker;
    private List<String> name;
    private List<Double> high;
    private List<Double> low;

    Stocks() {
        ticker = new ArrayList();
        name = new ArrayList();
        high = new ArrayList(Arrays.asList(7.67,
                5.91,
                4.12,
                8.99,
                2.38
                ));
        low = new ArrayList(Arrays.asList(7.41,
                6.25,
                3.96,
                8.35,
                2.4
                ));

        ticker.addAll(Arrays.asList("AUPH",
                "PTX",
                "HTGM",
                "OCUL",
                "IDXG"
                ));

        name.addAll(Arrays.asList("Aurinia Pharmaceuticals Inc",
                "Pernix Therapeutics Holdings",
                "HTG Molecular Diagnostics",
                "Ocular Therapeutix",
                "Interpace Diagnostics Group"
                ));

    }

    void returnStockInfo() {
        int i = 0;
        System.out.println("Type a Stock ticket to check it's history: ");
        Scanner check = new Scanner(System.in);
        String lookup = check.nextLine();
        while (i < ticker.size()) {
            if (lookup.matches(ticker.get(i))) {
                System.out.println(name.get(i) + "\n" + "Day High: " + high.get(i) + "\n" + "Day Low: " + low.get(i));
                break;
            } else {
                i++;
            }
        }
}}

