
public class Arrays {
    public static void main(String[] args) {

        String[] myklist = {"Hey", "You", "Me", "Lol"};

        System.out.println(myklist.length);
        System.out.println(myklist[0] + myklist[1] + myklist[2] + myklist[3]);

        double[] mylist = new double[10];
        java.util.Scanner input = new java .util.Scanner(System.in);

        System.out.println("Enter " + mylist.length + " values");

        for (int i = 0; i < mylist.length; i++) {
            mylist[i] = Math.random() * 100;
        }
String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println("Enter a month (1 to 12): ");
        int monthNumber = input.nextInt();
        System.out.println("The month is " + months[monthNumber - 1]);

        int x = 30;
        int[] numbers = new int[x];
        x = 60;
        System.out.println("x is " + x);
        System.out.println("The size of numbers is " + numbers.length);
    }


}
