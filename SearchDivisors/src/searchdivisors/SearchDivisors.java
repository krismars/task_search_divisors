
package searchdivisors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchDivisors {


    public static void main(String[] args) {
        
        int n = 998998;
        int half = 0;

        List<Integer> div = new ArrayList<Integer>();
        List<Integer> divResult = new ArrayList<Integer>();

        if (n < 0) {
            n *= -1;
        }

        half = n / 2;

        int count = 0;
        int num = n;

        if (num % 2 != 0) {
            div.add(n);
        }
        while (num % 2 == 0) {
            count++;
            num /= 2;
        }

        for (int i = 3; i <= half; i += 2) {
            if (n % i == 0) {
                div.add(i);
            }
        }

        List<Integer> divEven = new ArrayList<Integer>();
        for (int i = 0; i <= count; i++) {
            divEven.add((int) Math.pow(2, i));
            divResult.add((int) Math.pow(2, i));
        }

        for (int i = 0; i < div.size(); i++) {
            for (int j = 0; j < divEven.size(); j++) {
                divResult.add(div.get(i) * divEven.get(j));
            }
        }

        Collections.sort(divResult);
        System.out.println(divResult);
        System.out.println("Also we can append negative divisors.");
    }
}
