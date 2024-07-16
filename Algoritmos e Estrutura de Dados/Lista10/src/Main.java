public class Main {
    public static void main(String[] args) {
        ListaEstatica<Object> lista = new ListaEstatica<Object>();

        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);

        System.out.println(lista.buscar(2));

    }
}