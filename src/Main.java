import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int root1, root2;

        double determinant = b * b - 4 * a * c;

        // condition for real and different roots
        if(determinant > 0) {
            root2 = (int) ((-b - Math.sqrt(determinant)) / (2 * a));
            root1 = (int) ((-b + Math.sqrt(determinant)) / (2 * a));

            System.out.format("root1 = %.2f and root2 = %.2f", root2 , root1);
        }
        // Condition for real and equal roots
        else if(determinant == 0) {
            root2 = root1 = -b / (2 * a);

            System.out.format("root2 = root1 = %.2f;", root2);
        }
        // If roots are not real
        else {
            double realPart = -b / (2 *a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);

            System.out.format("root2 = %.2f-%.2fi and root1 = %.2f+%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
        }
    }
}
