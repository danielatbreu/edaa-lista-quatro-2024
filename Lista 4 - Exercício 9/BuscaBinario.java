public class BuscaBinario {

    public int buscaBinaria(int[] array, int alvo) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (array[meio] == alvo) {
                return meio;
            } else if (array[meio] < alvo) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1;
    }
    
}
