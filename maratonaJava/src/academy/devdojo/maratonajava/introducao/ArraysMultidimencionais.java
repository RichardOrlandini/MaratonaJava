package academy.devdojo.maratonajava.introducao;

public class ArraysMultidimencionais {
    public static void main(String[] args) {
        // arrays linkados ou Matrizes:

        int[][] dias = new int[2][2];

        dias[0][0] = 31;
        dias[0][1] = 27;

        dias[1][0] = 39;
        dias[1][1] = 40;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length ; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("----------------------------------");
        // com forritch:

        for (int[] arrBase: dias) {
            for (int num: arrBase) {
                System.out.println(num);
            }
        }

    }
}
