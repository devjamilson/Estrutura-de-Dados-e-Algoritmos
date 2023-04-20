//verifica de dois em dois qual é o maior
// [3,4,7,8,4]
// 3 é maior que 4 ?
// não 
// logo eles ficam no mesmo lugar
// 4 é maior que 7? não
// ...
// 8 é mairo que 4? sim
//logo eles trocam de posição
// e assim vai até ele ficar ordenado
// pior caso - vetor de ordem decrescente



import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    
    public static void bubbleSort(int[] array) {
        int n = array.length;
        
        // Percorre o array n vezes
        for (int i = 0; i < n-1; i++) {
            // Percorre o array até a posição n-i-1
            for (int j = 0; j < n-i-1; j++) {
                // Troca os elementos se o elemento atual for maior que o próximo elemento
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
} 
