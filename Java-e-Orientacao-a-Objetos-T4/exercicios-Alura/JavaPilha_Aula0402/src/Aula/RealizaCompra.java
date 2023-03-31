package Aula;

public static void main(String[] args) {
public void RealizaCompra(Produto produto) {
    //outras instruções aqui...
    if (totalDeProdutosNoEstoque < 0) {
        throw new EstoqueInsuficienteException();
    }
}
}
