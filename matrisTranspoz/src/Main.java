import java.util.Arrays;

public class Main {
    static void printMatris(int array[][]){
        for (int i[]: array){
            for (int j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] number = { {1,2,3}, {4,5,6} };
        System.out.println("Matris: ");
        printMatris(number);

        int [][] transpoze = new int[number[0].length][number.length];

        for (int i=0; i<number.length;i++){
            for (int j = 0 ; j < number[0].length;j++){
                transpoze [j][i]  = number[i][j];
            }
        }
        System.out.println("Transpoze: ");
        printMatris(transpoze);
    }
}