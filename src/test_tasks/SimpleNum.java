package test_tasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class SimpleNum {

    private static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Read the line from keyboard: enter m");
            String i = br.readLine();
            System.out.println("Read the line from keyboard: enter r");
            String o = br.readLine();
            int m = Integer.parseInt(i);
            int r = Integer.parseInt(o);
            System.out.format("Calculation result: %s", calcFunction(m, r));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Integer calcFunction(int m, int r) throws Exception {
        if (m <= 0 || r <= 0) {
            try {
                throw new IllegalAccessException("Argument should be integer. ");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        if (r > m) {
            try {
                throw new IllegalAccessException("r should be <= m.");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return calcFactorial(m) / (calcFactorial(r) * (calcFactorial(m - r)));
    }

    private static Integer calcFactorial(int n) throws Exception {
        if (n <= 1) {
            return 1;
        }
        Integer result = map.get(n);
        if (result != null) {
            return result;
        }
        result = n * (calcFactorial(n - 1));
        map.put(n, result);
        return result;
    }
}


