import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
    
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Encontra o pivô e rearranja o array em volta dele
            int pi = partition(array, low, high);
            
            // Recursivamente ordena os elementos antes e depois do pivô
            quickSort(array, low, pi-1);
            quickSort(array, pi+1, high);
        }
    }
    
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low-1;
        
        // Percorre o array e move todos os elementos menores que o pivô para a esquerda
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        
        // Move o pivô para a posição correta
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        
        return i+1;
    }
}