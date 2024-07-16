const anExampleVariable = "Hello World";
console.log(anExampleVariable);

var x: number = 5;
//x = 'Marcos';
let nome: string = 'Marcos';
var vFlag: boolean = true;
type tCidade = "Blumenau" | "Gaspar" | "Itajaí";
var vCidade: tCidade = "Gaspar";
type tGenerico = "Marcos" | 5 | true;
var vGenerico: tGenerico = 5;
vGenerico = "Marcos";

class Pessoa {
    id: number;
    nome: string;
    constructor (pId: number, pNome: string) {
        this.id = pId;
        this.nome = pNome;
    }
}

const cPessoa: Pessoa = new Pessoa(1,'Marcos');

function olaMundo(): void {
    console.log('Olá, mundo');
}

olaMundo();

function dobro(pNumero: number): number {
    return pNumero*2;
}

var vResultado: number = dobro(4);

function verifica(pValor: string | number): string {
    var vRetorno: string = '';
    if (typeof pValor === "string") {
        //vRetorno = pValor+' é string';
        vRetorno = `${pValor} é string`;
    }
    if (typeof pValor === "number") {
        vRetorno = `${pValor} é number`;
    }

    return vRetorno;
}

var vetNomes: Array<string> = ['Marcos', 'Cardoso'];
var vetGenerico: Array<string | number> = ['Marcos', 10];
var vetGenerico2: Array<boolean | object>;
vetGenerico2 = [
    true,
    false,
    {
        nome: "Cardoso"
    },
    {
        "endereco": "Rua 7 de setembro"
    },
    {
        ativo: true
    }
]
var vetPessoa: Array<Pessoa>;
vetPessoa = [
    {
        id: 1,
        nome: "Marcos"
    }
];

interface Generica<Tipo> {
    propriedade: Tipo
}

var vGenerica: Generica<number>;
vGenerica = {
    propriedade: 10
};
var vGenerica2: Generica<boolean | string>;
vGenerica2 = {
    propriedade: true
};
vGenerica2 = {
    propriedade: "Blumenau"
}
var vGenerica3: Generica<Pessoa>;
vGenerica3 = {
    propriedade: {
        id: 345,
        nome: "Cardoso"
    }
};