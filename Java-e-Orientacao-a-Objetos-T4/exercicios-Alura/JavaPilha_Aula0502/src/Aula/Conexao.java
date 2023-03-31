package Aula;

class Conexao {
	public void fecha() throws ConexaoException {
//	public int fecha() throws ConexaoException {
//		return 1 / 0; // --> Se executar um método que irá ocorrer uma exceção, vai ser chamado o
						// "Try-Catch"
		
//		return 1 / 1; //- --> Com essa linha não vai ocorrer exceção.
		
		throw new ConexaoException("Erro ao fechar conexão: null"); // -->throw para forçar a "bomba"
//		System.out.println();
	}
}
