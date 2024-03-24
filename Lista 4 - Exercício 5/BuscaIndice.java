public class BuscaIndice {

    public int[] buscarIndices(int[] array, int alvo) {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == alvo) {
                contador++;
            }
        }

        int[] indices = new int[contador];
        contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == alvo) {
                indices[contador++] = i;
            }
        }
        return indices;
    }
    
}
