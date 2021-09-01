public class Livro {
  private static int CONT_CODIGO = 0; //Constante para cada livro ter seu proprio codigo.
  private String titulo; //Titulo do livro.
  private String nomeautor; //Nome do Autor do livro.
  private String editora; //Nome da Editora do livro.
  private long issn; //Codigo de publicacao do livro.
  private int codigo; //Variavel de codigo gerada automaticamente por CONT_CODIGO.

  public Livro(String t, String na, String e, long i){ //Contrutor Livro.
    this.titulo = t;
    this.editora = e;
    this.issn = i;
    this.nomeautor = na;
    this.codigo = CONT_CODIGO;
    CONT_CODIGO++;
  } //Fim do construtor Livro.

  public void setTitulo(String ti){
    this.titulo = ti;
  } //Fim do metodo setTitulo.

  public void setEditora(String ed){
    this.editora = ed;
  } //Fim do metodo setEditora.

  public void setIssn(long is){
    this.issn = is;
  } //Fim do metodo setIssn.

  public void setNomeAutor(String na){
    this.nomeautor = na;
  } //Fim do metodo setNomeAutor.

  public String getTitulo(){
    return this.titulo;
  } //Fim do metodo getTitulo.

  public String getEditora(){
    return this.editora;
  } //Fim do metodo getEditora.

  public long getIssn(){
    return this.issn;
  } //Fim do metodo getIssn.

  public int getCodigo(){
    return this.codigo;
  } //Fim do metodo getCodigo.

  public String getNomeAutor(){
    return this.nomeautor;
  } //Fim do metodo getNomeAutor.

  /********************************************************************* 
   * Metodo: dadosLivro.
   * Funcao: Retornar uma string com os dados do livro.
   * Parametros: Nenhum
   * Retorno: String
   ********************************************************************* */

  public String dadosLivro(){
    return "Titulo: " + this.getTitulo() + " \nAutor: " + this.getNomeAutor() +" \nCodigo: " + this.getCodigo() + " \nEditora: " + this.getEditora() + " \nISSN: " + this.getIssn();
  } //Fim do metodo dadosLivro.
} //Fim da classe Livro.
