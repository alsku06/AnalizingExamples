import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Give a value of A ");
        Scanner scanner= new Scanner(System.in);
        int A=scanner.nextInt();



        int B=-6,C=7;
        int AB=A-B, AC=A-C, BC=B-C;

        if (AB*BC>0)
            System.out.println(B);
        else if (AB*AC<0)
            System.out.println(A);
        else
            System.out.println(C);

    }
}