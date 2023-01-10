function criptografarTexto() {
    sumirImg();
    aparecerImg();

    let novaPalavra = "";

    for (let i = 0; i < textInput.value.length; i++) {
        for (j = 0; j < array01.length; j++) {
            if (textInput.value[i] == array01[j]) {
                // alert("A letra " + array01[j] + " está na posição " + j + " e vai ser substituido por " + array02[j])
                novaPalavra += array02[j];
                break
            }
            else if (j == array01.length - 1) {
                novaPalavra += textInput.value[i]
            }
            console.log(j)
        }
    }
    document.getElementById("output-text").innerHTML = novaPalavra
}

function sumirImg() {
    document.getElementById("img").style.display = "none"
}

function aparecerImg() {
    document.getElementById("container-descriptografia").style.display = "inline-block"
}

let button = document.querySelector(".btn01");
let textInput = document.querySelector("textarea");


const array01 = ["e", "i", "a", "o", "u"];
const array02 = ["enter", "imes", "ai", "ober", "ufat"]

button.onclick = criptografarTexto;