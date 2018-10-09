public class AnalyzingNumbers {

    public static void main(String[] args) {

        // et program der tager nogle tal, viser gennemsnittet og hvor mange af tallene der er over gennemsnit.
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int n = input.nextInt();
        double[] numbers = new double[n];
        double sum = 0;

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {

                numbers[i] = input.nextDouble();
                sum += numbers[i];
            }

            double average = sum / n;

            int count = 0;  // the numbers of elements above average
            for (int i = 0; i < n; i++)
                if (numbers[i] > average)
                    count++;

            System.out.println("Average is " + average);
            System.out.println("Number of elements above the average is " + count);
        }
    }
