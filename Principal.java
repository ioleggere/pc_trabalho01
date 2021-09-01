/* **************************************************************** 
*Autor: Euler da Silva Lima.
*Matricula: 201911534.
*Inicio: 02/03/2021.
*Ultima alteracao: 07/03/2021.
*Nome: Biblioteca.
*Funcao: Um simples programa para controlar cadastros de livros em uma biblioteca.
*************************************************************** */

public class Principal{
  public static void main(String[] args) throws Exception{
    try{ //Tratando excecao da janela.
    new Janela(); //Iniciamos a Janela onde contem toda a parte grafica (swing) e a classe de controle do livro.
    }catch(Exception e){
      System.out.println("Erro");
    } //Fim do try catch.
  } //Fim do main.    
} //Fim da classe principal.