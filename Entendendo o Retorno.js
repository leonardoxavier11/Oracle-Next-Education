// 1) Há a declaração da variável cor e dps a sua atualização, porém por fim há a chamada da função teste() - > Que atualiza a cor novamente e esreve no navegador

// let cor = "verde";

// cor = "amarelo";

// function teste() {
//     cor = "vermelho";
//     document.write(cor);
// }

// cor = "azul";

// teste();

// --------------------------------------//--------------------------------------

// 2) Há a declaração da variável cor e dps a sua atualização, porém por fim há a chamada da função teste() sendo atribuida a nova variável novacor -> Porém como não há retorno da função o resultado é: "undefined"

// let cor = "verde";

// cor = "amarelo";

// function teste() {
//     cor = "vermelho";
// }

// cor = "azul";

// let novacor = teste();
// document.write(novacor);
// --------------------------------------//--------------------------------------

// 3) Há a declaração da variável cor e dps a sua atualização, porém por fim há a chamada da função teste() sendo atribuida a nova variável novacor -> Porém agora na função teste() foi declarado o "return (retorno)", e assim o resultado é a cor vemelho

// let cor = "verde";

// cor = "amarelo";

// function teste() {
//     cor = "vermelho";
//     return cor
// }

// cor = "azul";

// let novacor = teste();
// document.write(novacor);