public class PE12 {
	
	//test
    public static void main (String[] args) {
        int i = 1;
        int x = 2;
        boolean found = false;
        while (!found) {
            if (divisors(i) > 250) {
                System.out.println(i);
                found = true;
            }
            else {
                i +=x;
                x++;
            }
        }
    }

    public static int divisors (int n) {
        int counter = 0;
        for (int i = 1; i*i <= n; i++) {
            if (n % i == 0) counter++;
        }
        return counter;
    }
}