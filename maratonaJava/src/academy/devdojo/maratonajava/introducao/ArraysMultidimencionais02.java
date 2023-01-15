package academy.devdojo.maratonajava.introducao;

public class ArraysMultidimencionais02 {
    public static void main(String[] args) {

        int[][] arrayInt = {{0, 1}, {1, 2, 3,}, {1, 2, 3, 4, 5, 6}};

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n-----");
            for (int num : arrayBase) {
                System.out.println(num+ " ");
            }
        }
    }
}
