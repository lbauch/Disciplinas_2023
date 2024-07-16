package Model;

public class Calculadora {

    public FilaVetor<String> extrairTermos(String expressao) {

        //transforma , em . para adequar ao padrão.
        expressao = expressao.replace(",", ".");
        //retira os espaços em branco
        expressao = expressao.replace(" ", "");
        //Cria a fila para armazenar os dados, unindo-os quando necessário.
        FilaVetor<String> fila = new FilaVetor<>(expressao.length());
        //String para concatenar valores numéricos e ponto para aplicar como Double
        String valores = "";
        //Diferença de parênteses abertos e fechados, pois devem possuir o mesmo n°.
        int contParenteses = 0;
        for (int i = 0; i < expressao.length(); i++) {
            char carac = expressao.charAt(i);
            char ant = '1';
            if (i > 0) {
                ant = expressao.charAt(i - 1);
            }
            char prox = '1';
            if (i < expressao.length() - 1) {
                prox = expressao.charAt(i + 1);
            }
            if (i > 0) {
                if (Character.getNumericValue(prox) > 9) {
                    if (ant > 9 || prox == '*' || prox == '/' || prox == ')'
                            || i == expressao.length() - 1) {
                        throw new IllegalArgumentException(
                                "Não podem haver 3 operandos consecutivos");
                    }
                }
            }
            //possibilidades para o operando
            switch (carac) {
                case '-':
                    //Não pode terminar com -
                    if (i == expressao.length() - 1) {
                        throw new IllegalArgumentException(
                                "Expressão incorreta 0");
                    }
                    if (Character.getNumericValue(prox) > 9 || prox == '('
                            || prox == '-') {
                        //caso possua "--", substitui o 1° por +, ignora o 2°
                        if (prox == '-' || prox == '(') {
                            if (!valores.equals("")) {
                                //Insere o valor double armazenado em formato String
                                fila.inserir(valores);
                                //limpa a string valores
                                valores = "";
                            }
                            if (prox == '-') {
                                carac = '+';
                            }
                            fila.inserir("" + carac);
                            i++;
                        } else {
                            //somente aceita números, - ou parênteses após o -.
                            throw new IllegalArgumentException(
                                    "Expressão incorreta 1");
                        }
                    } else {
                        if (i == 0 || ant == '(') {
                            valores += "-";
                        } else {
                            if (!valores.equals("")) {
                                //Insere o valor double armazenado em formato String
                                fila.inserir(valores);
                                //limpa a string valores
                                valores = "";
                            }
                            //insere o caracter atual na fila
                            fila.inserir("-");
                        }
                    }
                    break;
                //precisa ser diferente dos demais, pois tem limitação caso seja inválido
                case ')':
                    if (ant == '-' || ant == '+' || ant == '*' || ant == '/'
                            || ant == '(' || i == 0) {
                        throw new IllegalArgumentException(
                                "Expressão incorreta 2");
                    }
                    if (!valores.equals("")) {
                        //Insere o valor double armazenado em formato String
                        fila.inserir(valores);
                        //limpa a string valores
                        valores = "";
                    }
                    //insere o caracter atual na fila
                    fila.inserir("" + carac);
                    contParenteses--;
                    break;
                //precisa ser diferente dos demais, para contabilizar parênteses;
                case '(':
                    contParenteses++;
                    if ((Character.getNumericValue(prox) > 9 && carac != '(')
                            || i == expressao.length() - 1) {
                        throw new IllegalArgumentException(
                                "Expressão incorreta 3");
                    }
                    if (!valores.equals("")) {
                        //Insere o valor double armazenado em formato String
                        fila.inserir(valores);
                        //limpa a string valores
                        valores = "";
                    }
                    //insere o caracter atual na fila
                    fila.inserir("" + carac);
                    break;
                //Demais operandos
                case '+':
                case '*':
                case '/':
                    if ((Character.getNumericValue(prox) > 9 && carac != '(')
                            || i == expressao.length() - 1) {
                        throw new IllegalArgumentException(
                                "Expressão incorreta 4");
                    }
                    if (!valores.equals("")) {
                        //Insere o valor double armazenado em formato String
                        fila.inserir(valores);
                        //limpa a string valores
                        valores = "";
                    }
                    //insere o caracter atual na fila
                    fila.inserir("" + carac);
                    break;
                default:
                    //verifica se é número ou ponto
                    if ((Character.getNumericValue(carac) >= 0 && Character.
                            getNumericValue(carac) <= 9) || carac == '.') {
                        //Concatena os valores numéricos e o ponto
                        valores += carac;
                        if (i == expressao.length() - 1) {
                            //Necessário, pois em outros casos, inserção se dá no operador
                            fila.inserir(valores);
                            valores = "";
                        }
                    } else {
                        //caso for " ", desconsidera o caracter. 
                        //Lança exceção caso não pertença aos itens acima.
                        throw new IllegalArgumentException();
                    }

            }
        }
        if (contParenteses == 0) {
            return fila;
        } else {
            throw new IllegalArgumentException("Expressão Incorreta 5");
        }
    }

    public FilaVetor<String> gerarExprPosFixado(
            FilaVetor<String> expressaoInFixada) {
        /*Criando as estruturas de armazenamento:
        pilha b para armazenar os valores e fila c para armazenar a expressão pós fixada*/
        PilhaVetor<String> b = new PilhaVetor<>(expressaoInFixada.getLimite());
        FilaVetor<String> c = new FilaVetor<>(expressaoInFixada.getLimite());
        //Inserir dados pós fixados
        while (!expressaoInFixada.estaVazia()) {
            String valor = expressaoInFixada.retirar();
            switch (valor) {
                //Empilha o parênteses em b.
                case "(":
                    b.push(valor);
                    break;
                case ")":
                    /*desempilha os elementos da pilha b até remover os parênteses de abertura
                correspondente, adicionando os operadores à c.*/
                    while (!b.peek().equals("(")) {
                        c.inserir(b.pop());
                    }
                    //retira o parênteses de b.
                    b.pop();
                    break;
                //obedece a regra de -, pois possui mesma precedência
                case "+":
                case "-":
                    while (!b.estaVazia() && !b.peek().equals("(")) {
                        c.inserir(b.pop());
                    }
                    b.push(valor);
                    break;
                //obedece a regra de /, pois possui mesma precedência
                case "*":
                case "/":
                    //Remove até b estar vazia ou encontrar os operadores de maior precedência
                    while (!b.estaVazia() && (b.peek().equals("*") || b.peek().
                            equals("/"))) {
                        c.inserir(b.pop());
                    }
                    b.push(valor);
                    break;
                default:
                    c.inserir(valor);
                    break;
            }
        }
        //Inserir dados restantes da pilha na fila do formato pós fixado
        while (!b.estaVazia()) {
            c.inserir(b.pop());
        }
        return c;
    }

    public double calcularExprPosFixada(FilaVetor<String> exprPosfixada) {
        PilhaVetor<Double> p = new PilhaVetor<>(exprPosfixada.getLimite());

        double result = 0;
        while (!exprPosfixada.estaVazia()) {
            String txtInserir = exprPosfixada.retirar();
            try {
                double ins = Double.parseDouble(txtInserir);
                p.push(ins);
            } catch (Exception e) {

                double segundo = p.pop();
                double primeiro = 0;
                if(!p.estaVazia()){
                    primeiro = p.pop();
                }
                else{
                    return segundo;
                }
                switch (txtInserir) {
                    case "+":
                        result = primeiro + segundo;
                        p.push(result);
                        break;
                    case "-":
                        result = primeiro - segundo;
                        p.push(result);
                        break;
                    case "*":
                        result = primeiro * segundo;
                        p.push(result);
                        break;
                    case "/":
                        result = primeiro / segundo;
                        p.push(result);
                        break;
                    default:

                }
            }
        }
        return result;
    }
}
