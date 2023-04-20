
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
    
    public static void insertionSort(int[] array) {
        int n = array.length;
        
        // Percorre o array a partir do segundo elemento
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i-1;
            
            // Move os elementos maiores que a chave para a direita
            while (j >= 0 && array[j] > key) {
                array[j+1] = array[j];
                j--;
            }
            
            // Insere a chave na posição correta
            array[j+1] = key;
        }
    }
}