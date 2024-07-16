package HashMap;

public class MapaDispersao<T> {
    private ListaEncadeada<NoMapa<T>>[] info;

    public MapaDispersao(int tamanho){
        info = new ListaEncadeada[tamanho];
    }

    private int calcularHash(int chave){
        return (chave % info.length);
    }

    public void inserir(int chave, T dado){
        int indice = calcularHash(chave);

        if(info[indice] == null){
            info[indice] = new ListaEncadeada<>();
        }
        NoMapa<T> noMapa = new NoMapa<T>();
        noMapa.setChave(chave);
        noMapa.setInfo(dado);

        info[indice].inserir(noMapa);
    }

    public void remover(int chave){
        int indice = calcularHash(chave);
        if(info[indice] == null){
            return;
        }
        NoMapa<T> noMapa = new NoMapa<>();
        noMapa.setChave(chave);
        info[indice].retirar(noMapa);
    }

    public T buscar(int chave){
        int indice = calcularHash(chave);

        if(info[indice] == null){
            return null;
        }

        NoMapa<T> noMapa = new NoMapa<>();
        noMapa.setChave(chave);

        NoLista<NoMapa<T>> no = info[indice].buscar(noMapa);

        if(no == null){
            return null;
        }
        return no.getInfo().getInfo();
    }
}
