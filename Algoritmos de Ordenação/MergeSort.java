import java.util.Arrays;



public class MergeSort {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        mergeSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
    
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            // Encontra o ponto médio do array
            int mid = (left+right)/2;
            
            // Recursivamente ordena os subarrays antes e depois do ponto médio
            mergeSort(array, left, mid);
            mergeSort(array, mid+1, right);
            
            // Combina os subarrays ordenados
            merge(array, left, mid, right);
        }
    }
    
    public static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        // Cria arrays temporários para os subarrays esquerdo e direito
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        // Copia os elementos dos subarrays esquerdo e direito para os arrays temporários
        for (int i = 0; i < n1; i++) {
            L[i] = array[left+i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = array[mid+1+j];
        }
        
        // Combina os arrays temporários em um array ordenado
        int i = 0;
        int j = 0;
        int k = left;
        
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }
        
        // Copia os elementos restantes do subarray esquerdo (se houver)
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }
        
        // Copia os elementos restantes do subarray direito (se houver)
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }
}