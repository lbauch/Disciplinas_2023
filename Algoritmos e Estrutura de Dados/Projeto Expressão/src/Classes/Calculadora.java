package Classes;

public class Calculadora {

    public FilaVetor<String> extrairTermos(String expressao) {
        // Substituir todas as vírgulas por pontos na expressão//
        expressao = expressao.replace(',', '.');
        // Usando uma expressão regular para dividir a expressão em números e operadores
        String[] tokens = expressao.split("(?<=[-+*/()])|(?=[-+*/()])");
        // Removendo espaços em branco e adicionando os tokens à fila
        FilaVetor<String> expressaoInFixada = new FilaVetor<>(expressao.length());
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i].trim();
            // Verifica se o token é um sinal de menos que faz parte de um número negativo
            if (token.equals("-") && (i == 0 || tokens[i - 1].matches("[-+*/(]"))) {
                // Se for, concatena o sinal de menos com o próximo token (que deve ser um número)
                token += tokens[i + 1].trim();
                // Avança para o próximo token, pois já o usamos
                i++;
            }
            expressaoInFixada.inserir(token);
        }
        return expressaoInFixada;
    }

    public FilaVetor<String> gerarExprPosFixado(FilaVetor<String> expressaoInFixada) {
        //Cria uma Pilha para armazenar temporariamente os tokens//
        PilhaVetor<String> pilhaB = new PilhaVetor<>(expressaoInFixada.getLimite());
        //Cria uma Fila para armazenar a expressão no formato pós fixado//
        FilaVetor<String> exprPosFixada = new FilaVetor<>(expressaoInFixada.getLimite());
        //Laço de repetição While para inserir os tokens na Fila do formato pós fixado//
        while (!expressaoInFixada.estaVazia()) {
            String valor = expressaoInFixada.peek();
            switch (valor) {
                case "(":
                    pilhaB.push(valor);
                    break;
                case ")":
                    while (!pilhaB.peek().equals("(")) {
                        exprPosFixada.inserir(pilhaB.pop());
                    }
                    pilhaB.pop(); // Pop '('
                    break;
                case "+":
                case "-":
                    while (!pilhaB.estaVazia() && !pilhaB.peek().equals("(")) {
                        exprPosFixada.inserir(pilhaB.pop());
                    }
                    pilhaB.push(valor);
                    break;
                case "*":
                case "/":
                    while (!pilhaB.estaVazia() && (pilhaB.peek().equals("*") || pilhaB.peek().equals("/"))) {
                        exprPosFixada.inserir(pilhaB.pop());
                    }
                    pilhaB.push(valor);
                    break;
                default:
                    exprPosFixada.inserir(valor);
                    break;
            }
            expressaoInFixada.retirar();
        }
        //Insere os tokens restantes da Pilha na Fila do formato pós fixado//
        while (!pilhaB.estaVazia()) {
            exprPosFixada.inserir(pilhaB.pop());
        }
        //Retorna uma Fila com os tokens no formato pós fixado//
        return exprPosFixada;
    }

    public static double calcularPosfixa(FilaVetor<String> exprPosFixada) {
        PilhaVetor<Double> pilha = new PilhaVetor<>(exprPosFixada.getLimite());

        while (!exprPosFixada.estaVazia()) {
            String token = exprPosFixada.retirar();

            if (token.matches("-?\\d+(\\.\\d+)?")) {
                pilha.push(Double.parseDouble(token));
            } else {
                double segundoOperando = pilha.pop();
                double primeiroOperando = pilha.pop();

                double resultado;
                switch (token) {
                    case "+":
                        resultado = primeiroOperando + segundoOperando;
                        break;
                    case "-":
                        resultado = primeiroOperando - segundoOperando;
                        break;
                    case "*":
                        resultado = primeiroOperando * segundoOperando;
                        break;
                    case "/":
                        resultado = primeiroOperando / segundoOperando;
                        break;
                    default:
                        throw new IllegalArgumentException("Operador inválido: " + token);
                }

                pilha.push(resultado);
            }
        }

        return pilha.pop();
    }

}
