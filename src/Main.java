import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int n = scanner.nextInt();

        String allocatedLab = allocateLab(x, y, z, n);
        System.out.println(allocatedLab);

        scanner.close();
    }

    public static String allocateLab(int x, int y, int z, int n) {
        int lab1=Math.abs(x-n);
        int lab2=Math.abs(y-n);
        int lab3=Math.abs(z-n);
        int min=Math.min(Math.min(lab1,lab2),lab3);
        if (min==lab1)
            return"L1";
        else if (min==lab2)
        {
           return "L2";
        }
        else
            return "L3";

    }
}