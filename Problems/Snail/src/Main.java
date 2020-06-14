import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int counter = 0;
        int done = 0;
        boolean status = true;

        do {
            done += a;
            counter ++;
            if (done >= h) {
                status = false;
            }
            done -= b;
        } while (status);

        System.out.println(counter);

    }
}