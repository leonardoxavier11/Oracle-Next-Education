function sumirImg() {
    document.getElementById("img").style.display = "none"
}

function aparecerContainer() {
    document.getElementById("container-descriptografia").style.display = "flex"
}

function existeTexto() {
    //Se faz necessário esse "if" para que a imagem não suma, mesmo quando não tiver nada escrito no "text area"
    if (textInput.value.length > 0) {
        sumirImg();
        aparecerContainer();
    }
}

function criptografarTexto() {
    existeTexto();

    novaPalavra = ""; // Se faz necessário criar a variável "novaPalavra" dentro da função, para que seja "zerada" toda vez que clicar no botão de criptografar

    //Se faz necessário criar dois "for (i E j)" para que seja quando tiver lento o primeiro caracter do texto inserido, percorrer todo o "array01" para saber se o caracter existe dentro dele.
    //Caso seja encontrato, irá retornor o caracter da mesma posição que está no "array02". Pois estamos falando de listas ordenadas.
    //Caso não seja encontrado, irá retorno o próprio caracter que foi inserido no input. Através da condição (j === array01.length - 1), onde J sempre estará atualizado com o final após todas as posições do array
    //As opções serão "gravadas" na variável "novaPalavra"
    //O "console.log(j)", foi inserido apenas para ajudar a criar a lógica da função

    let texto = textInput.value;
    for (let i = 0; i < texto.length; i++) {
        for (j = 0; j < array01.length; j++) {
            if (texto[i] === array01[j]) {
                // alert("A letra " + array01[j] + " está na posição " + j + " e vai ser substituido por " + array02[j])
                novaPalavra += array02[j];
                break
            }
            else if (j === array01.length - 1) {
                novaPalavra += texto[i]
            }
            console.log(j)
        }
    }
    document.getElementById("output-text").innerHTML = novaPalavra
}

// function descriptografarTexto() {
//     //Tentando reduzir o tamanho da função com o "for" - AInda não está funcioanndo
//     existeTexto();

//     let texto = textInput.value;
//     let i = 0;

//     const regex1 = array01[i];
//     const regex2 = array02[i];

//     novaPalavra = texto.replaceAll(regex2, regex1);

//     for (i = 1; i < array01.length; i++) {
//         novaPalavra = novaPalavra.replaceAll(regex2, regex1);
//     }

//     document.getElementById("output-text").innerHTML = novaPalavra
// }

function descriptografarTexto() {
    //ESSA FUNÇÃO ESTÁ FUNCIONANDO CORRETAMENTE !

    //Ao invés de usar dois "for" para percorrer os arrays, pode ser usado a função nativa do JavaScript "replace"
    existeTexto();

    let texto = textInput.value;

    novaPalavra = texto.replaceAll(array02[0], array01[0])
    novaPalavra = novaPalavra.replaceAll(array02[1], array01[1])
    novaPalavra = novaPalavra.replaceAll(array02[2], array01[2])
    novaPalavra = novaPalavra.replaceAll(array02[3], array01[3])
    novaPalavra = novaPalavra.replaceAll(array02[4], array01[4])

    document.getElementById("output-text").innerHTML = novaPalavra
}


function copiarTexto() {
    navigator.clipboard.writeText(novaPalavra).then(() => {
        console.log('Content copied to clipboard');
    }, () => {
        console.error('Failed to copy');
    });
}

//Arrays
const array01 = ["e", "i", "a", "o", "u"];
const array02 = ["enter", "imes", "ai", "ober", "ufat"]

//Variáveis
let novaPalavra;

let encryptButton = document.querySelector(".btn01");
let decryptButton = document.querySelector(".btn02")
let copyButton = document.querySelector(".btn04");

let textInput = document.querySelector("textarea");

//Buttons
encryptButton.onclick = criptografarTexto;
decryptButton.onclick = descriptografarTexto;
copyButton.onclick = copiarTexto;


