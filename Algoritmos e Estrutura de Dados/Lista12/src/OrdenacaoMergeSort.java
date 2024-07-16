public class OrdenacaoMergeSort <T extends Comparable<T>> extends OrdenacaoAbstract<T>{
    @Override
    public void ordenar() {
        int n = getInfo().length - 1;
        quickSort(0, n);
    }
    private void quickSort(int inicio, int fim){
        if(inicio < fim){
            int idxPivo = parcionar(inicio, fim);
            quickSort(inicio, idxPivo - 1);
            quickSort(idxPivo + 1, fim);
        }
    }
    private int parcionar(int incio, int fim){
        return 1;
    }
}
