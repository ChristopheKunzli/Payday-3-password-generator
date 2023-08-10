public class PasswordGenerator {
    public static void main(String[] args) {
        int[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Generate passwords with 4 distinct digits
        for (int d1 : digits) {
            for (int d2 : digits) {
                if (d2 != d1) {
                    for (int d3 : digits) {
                        if (d3 != d1 && d3 != d2) {
                            for (int d4 : digits) {
                                if (d4 != d1 && d4 != d2 && d4 != d3) {
                                    System.out.println("" + d1 + d2 + d3 + d4);
                                }
                            }
                        }
                    }
                }
            }
        }

        // Generate passwords with 3 distinct digits
        for (int d1 : digits) {
            for (int d2 : digits) {
                if (d2 != d1) {
                    for (int d3 : digits) {
                        if (d3 != d1 && d3 != d2) {
                            System.out.println("" + d1 + d2 + d3 + d3);
                        }
                    }
                }
            }
        }
    }
}
