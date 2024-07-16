public class ListaOrdenada<T extends Comparable<T>> extends ListaAbstract<T> {
    public void inserir(T dado){
        Object[] info = getInfo();

        if(info.length == getTamanho()){
            redimensionar();
        }

        int posicao = procurarPosicaoInclusao(dado);

        if(posicao<getTamanho()){
            deslocarDados(posicao);
        }

        info = getInfo();
        info[posicao] = dado;

        setTamanho(getTamanho() + 1);
    }

    private void deslocarDados(int posicao){
        Object[] info = getInfo();
        for(int i=getTamanho()-1; i>=posicao; i--){
            info[i+1] = info[i];
        }
    }

    private int procurarPosicaoInclusao(T itemAdicionar){
        Object[] info = getInfo();
        int i;

        for (i=0; i<getTamanho(); i++){

            if(((Comparable)info[i]).compareTo(itemAdicionar)>0){
                break;
            }
        }
        return i;
    }
    public int buscar(T valor){
        Object[] info = getInfo();
        int inicio = 0;
        int fim = getTamanho() - 1;
        int meio;

        while (inicio<=fim){
            meio = (inicio + fim)/2;
            int comparacao = valor.compareTo((T)info[meio]);
            if(comparacao < 0){
                fim = meio-1;
            } else if (comparacao > 0){
                inicio = meio+1;
            } else {
                return meio;
            }
        }

        return -1;
    }
}
