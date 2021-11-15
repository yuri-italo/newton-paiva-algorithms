/**
 * Problema 2:
 *
 * Entrada: um vetor de chaves (inteiros) V previamente ordenado e uma chave de busca X
 * Saída: informar se X ocorre em V
 * Obs: Implementar a pesquisa binária por iteração e por recursão
 */
public class Main {
    public static void main(String[] args) {
        int[] numbers = {2,4,7,11,15,33,40};
        System.out.println("Iterative: Number was found at index " + binarySearch(numbers,4));
        System.out.println("Recursive: Number was found at index " + binarySearchRecursive(numbers,33));
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int midNumber = left + (right - left) / 2;

            if (array[midNumber] == target)
                return midNumber;

            if (array[midNumber] < target)
                left = midNumber + 1;
            else
                right = midNumber - 1;
        }

        return -1;
    }

    public static int binarySearchRecursive(int[] array, int target) {
        return binarySearchRecursive(array,target,0, array.length - 1);
    }

    public static int binarySearchRecursive(int[] array, int target, int left, int right) {
        if (right < left)
            return -1;

        int middle = (left + right) / 2;

        if (array[middle] == target)
            return middle;

        if (target < array[middle])
            return binarySearchRecursive(array,target,left,middle - 1);

        return binarySearchRecursive(array,target,middle + 1, right);
    }
}
