public class OrdenacaoBolha <T extends Comparable<T>> extends OrdenacaoAbstract<T>{

    @Override
    public void ordenar() {
        int i,j;
        int n = getInfo().length;

        for(i=n-1; i>=1; i--){
            for(j=0; j < i; j++){
                if(getInfo()[j].compareTo(getInfo()[j+1]) > 0){
                    trocar(j, i+1);
                }
            }
        }
    }
}
