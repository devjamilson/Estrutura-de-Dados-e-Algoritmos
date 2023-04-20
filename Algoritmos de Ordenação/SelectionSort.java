//[30,45,60,10,5,92]
//coloca o menor elemento na esquerda

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {50,2,1,78,60};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
    
    public static void selectionSort(int[] array) {
        int n = array.length;
        
        // Percorre o array
        for (int i = 0; i < n-1; i++) {
            // Encontra o menor elemento no array desordenado
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Troca o menor elemento com o primeiro elemento do array desordenado
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}