public class OrdenacaoBolhaOtimizada <T extends Comparable<T>> extends OrdenacaoAbstract<T>{
    @Override
    public void ordenar() {
        int i,j;
        int n = getInfo().length;
        boolean trocou;
        for(i=n-1; i>=1; i--){
            trocou = false;
            for(j=0; j < i; j++){
                if(getInfo()[j].compareTo(getInfo()[j+1]) > 0){
                    trocar(j, i+1);
                    trocou = true;
                }
            }
            if(!trocou)
                return;
        }
    }
}
