import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[0][];
        int[][] matrix1=new int[0][];
        String enter;
        System.out.println("1.Add matrices");
        System.out.println("2.Multiply matrix by a constant");
        System.out.println("3.Multiply matrices");
do {

    enter = scanner.nextLine();

    if (enter.equals("1")) {
        System.out.println("First matrix");
        int num = scanner.nextInt();
        int num2 = scanner.nextInt();
        matrix = new int[num][num2];
        System.out.println("Second matrix");
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        matrix1 = new int[num3][num4];

        System.out.println("First matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) Math.round(Math.random() * 100);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Second matrix");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = (int) Math.round(Math.random() * 100);
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
    }
        if (enter.equals("2")) {

            System.out.println("Enter count: ");
            int count = scanner.nextInt();
            System.out.println("Result ");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] *= count);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }

        if (enter.equals("3")) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] *= matrix1[i][j]);
                    System.out.print(" ");

                }
                System.out.println();
            }
        }

}while (!enter.equals("Exit"));


    }
}
