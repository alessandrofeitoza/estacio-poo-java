function bemvindo() {
    console.log("Boas vindas");
}




let nome = "Joao Pedro"; // string
let idade = 21; // int
let saldo = -908.12 // float
let moraEmFortaleza = true; //bool

let telefones = [
    "85 9 8765-1234",
    "85 9 9878-6969"
]; //array / vetores / matrizes

let telefones2 = [
    ["85", "9 8765-1234"],
    ["85", "9 9878-6969"]
];


let pessoas = [
    [
        "Chiquim",
        ["Rua X", "Rua Y"]
    ],
    [
        "Maria",
        ["Rua A", "Rua B", "Rua C"]
    ]
];

let dados = [{
    nome: 'Chiquim',
    telefones: [
        {
            ddd: '85',
            numero: '1234'
        }, 
        {
            ddd: '85',
            numero: '6969'
        }
    ]
}]

// console.log(
//     dados[0].nome
// );

// console.log(
//     dados[0].telefones[1].numero
// )

let System = {
    out: {
        println: function (texto) {
            console.log(texto)
        }
    }
};

System.out.println("Oi som");
