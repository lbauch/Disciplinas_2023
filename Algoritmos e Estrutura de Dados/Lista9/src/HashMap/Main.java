package HashMap;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        MapaDispersao<Aluno> mapa = new MapaDispersao<>(53);

        Aluno a = new Aluno(12000, "John", LocalDate.now());
        mapa.inserir(12000,a);
        System.out.println(mapa.buscar(12000).getNome());
        mapa.remover(12000);
        System.out.println(mapa.buscar(12000));
    }
}
