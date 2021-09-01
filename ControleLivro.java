import java.util.ArrayList;
import java.util.List;
public class ControleLivro {
  private List<Livro> livros = new ArrayList<Livro>();
  
  /********************************************************************* 
   * Metodo: cadastrarLivro.
   * Funcao: Inserir um objeto Livro em um ArrayList de Livro.
   * Parametros: titulo = Texto contendo titulo do livro.
                 nomeautor = Texto contendo nome do autor do livro.
                 editora = Texto contendo nome da editora do livro.
                 issn = Numeros que representam o codigo de publicacao do livro.
   * Retorno: void.
   ********************************************************************* */
  
  public void cadastrarLivro(String titulo, String nomeautor, String editora, long issn){ 
    Livro temp = new Livro(titulo, nomeautor, editora, issn); //Objeto Livro temporario criado para ser inserido na lista.
    livros.add(temp); //Adicionando o Livro na Lista
  } //Fim do metodo cadastrarLivro.
  
  /********************************************************************* 
   * Metodo: buscaTitulo.
   * Funcao: Buscar um objeto livro em um ArrayList de livro atravez do titulo atribuido.
   * Parametros: titulotemp = Texto contendo titulo do livro a ser buscado.
   * Retorno: Livro.
   ********************************************************************* */
  
  public Livro buscaTitulo(String titulotemp){
    for(int i = 0; i<this.livros.size(); i++){ //Percorre todo o ArrayList.
      if(this.livros.get(i).getTitulo().equals(titulotemp)){ //Se essa posicao do ArrayList for o Objeto Livro correspondente.
      return this.livros.get(i); //Retorna esse objeto.
      } //Fim do if.
    } //Fim do for.
    return null; //Se nao encontrar nao retorna.
  } //Fim do metodo buscaTitulo.
  
  /********************************************************************* 
   * Metodo: imprimeLivros.
   * Funcao: Retornar um String contendo todos os dados de todos os objetos Livro do ArrayList.
   * Parametros: Nenhum.
   * Retorno: String.
   ********************************************************************* */
  
  public String imprimeLivros(){
    String dadoslivros = ""; //Variavel de retorno inicialmente vazia.
    for(int i = 0; i<livros.size(); i++){ //Percorre todo o ArrayList.
      if(livros.get(i) != null){ //Se uma posicao nao for vazia.
      dadoslivros += "----------------------------------------\n"+"Livro " + (i+1) + ":\n\n" + livros.get(i).dadosLivro() + "\n\n"; // Os dados dessa posicao sao adicionados na variavel.
      } //Fim do if.
    } //Fim do for.
    return dadoslivros; //Retorna essa variavel contendo os dados obtidos.
  } //Fim do metodo imprimeLivros.
  
  /********************************************************************* 
   * Metodo: removeLivro.
   * Funcao: Remover um objeto Livro do ArrayList atravez do seu titulo.
   * Parametros: titulotempo = Texto contendo titulo do objeto Livro a ser removido do ArrayList.
   * Retorno: void.
   ********************************************************************* */
  
  public void removeLivro(String titulotempo){
    livros.remove(buscaTitulo(titulotempo)); //Utiliza o metodo buscaTitulo para encontrar o livro e remover do array com o metodo remove.
  } //Fim do metodo removeLivro.

} //Fim da classe ControleLivro.