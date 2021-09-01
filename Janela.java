import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;

public class Janela extends JFrame {
  JTabbedPane tabs = new JTabbedPane(); //Janela Swing com varias guias.
  
  JPanel cadastrarlivro = new JPanel(); //Painel de cadastro.

  JPanel tabopcao = new JPanel(); //Painel de opcoes.

  JTextField titulo = new JTextField(20); //Campo de texto para receber titulo, passando 20 como parametro, para definir tamanho.

  JLabel titulolabel = new JLabel("Titulo: "); //Label informativo do campo texto.

  JTextField nomeautor = new JTextField(20); //Campo de texto para receber o nome do autor, passando 20 como parametro, para definir tamanho.

  JLabel nomeautorlabel = new JLabel("Nome do Autor: "); //Label informativo do campo do nome do autor.

  JTextField editora = new JTextField(20); //Campo de texto para receber o nome da editora, passando 20 como parametro, para definir tamanho.

  JLabel editoralabel = new JLabel("Editora: "); //Label informativo do campo do nome da editora.

  JTextField issn = new JTextField(20); //Campo de texto para receber o codigo issn, passando 20 como parametro, para definir tamanho.

  JLabel issnlabel = new JLabel("ISSN: "); //Label informativo do campo de codigo issn.

  JButton btncadastro = new JButton("Cadastrar"); //Botão para efetuar cadastro.

  JButton btnimprime = new JButton("Imprimir Livros"); //Botao para imprimir uma lista com os dados de todos os livros.

  JButton btndeleta = new JButton("Remover Livro"); //Botao para remover um livro da lista de livros.
    
    public Janela() throws Exception{
      super("Biblioteca"); //Titulo da janela.
      try{
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Encerrar a execucao do programa ao fecha-lo.

      setSize(250, 600); //Definir o tamanho da janela.

      setLocation(300,100); //Definir a posicao da tela em que a janela sera aberta.

      setVisible(true); //Definir a janela visivel.

      setResizable(false); //Nao permitir que o usuario mude o tamanho da tela.
      
      add(BorderLayout.CENTER, tabs); //Adicionando as guias.

      tabs.addTab("Cadastrar Livro", cadastrarlivro); //Adicionando o painel de cadastro na primeira guia.

      tabs.addTab("Outras Opcoes", tabopcao); //Adicionando o painel de opcoes na segunda guia.

      cadastrarlivro.setBackground(Color.DARK_GRAY); //Definindo a cor de fundo da guia de cadastro como cinza escuro.

      tabopcao.setBackground(Color.DARK_GRAY); //Definindo a cor de fundo da guia de opcoes como cinza escuro.

      titulolabel.setForeground(Color.WHITE); //Definindo a cor do texto da label de titulo como branca.

      nomeautorlabel.setForeground(Color.WHITE); //Definindo a cor do texto da label do nome do autor como branca.

      editoralabel.setForeground(Color.WHITE); //Definindo a cor do texto da label do nome da editoracomo branca.

      issnlabel.setForeground(Color.WHITE); //Definindo a cor do texto da label do codigo issn como branca.

      cadastrarlivro.add(titulolabel); //Adicionando a label de titulo na guia de cadastro.

      cadastrarlivro.add(titulo); //Adicionando o campo de texto de titulo na guia de cadastro.

      cadastrarlivro.add(nomeautorlabel); //Adicionando a label do nome do autor na guia de cadastro.

      cadastrarlivro.add(nomeautor); //Adicionando o campo de texto do nome do autor na guia de cadastro.

      cadastrarlivro.add(editoralabel); //Adicionando a label do nome da editora na guia de cadastro.

      cadastrarlivro.add(editora); //Adicionando o campo do nome da editora na guia de cadastro.

      cadastrarlivro.add(issnlabel); //Adicionando a label do codigo de cadastro na guia de cadastro.

      cadastrarlivro.add(issn); //Adicionando o campo de texto do codigo issn na guia de cadastro.

      btncadastro.setSize(20, 20); //Definindo tamanho do botao de cadastro.

      cadastrarlivro.add(btncadastro); //Adicionando botao de cadastro na guia de cadastro.

      tabopcao.add(btnimprime); //Adicionando botao de imprimir na guia de opcoes.

      tabopcao.add(btndeleta); //Adicionando botao de remover na guia de opcoes.

      ControleLivro control = new ControleLivro(); //Iniciando objeto de controle de livros.

        btncadastro.addActionListener(new ActionListener() { 
        @Override
          public void actionPerformed(ActionEvent e){ //Definindo acao ao clicar no botao de cadastro.
            if(!titulo.getText().equals("") && !nomeautor.getText().equals("") && !editora.getText().equals("") && !issn.getText().equals("")){ //Verificando se os campos nao estao vazios.
              try{ //Excecao do issn como texto.
                String titulol = titulo.getText(); //Recebendo titulo do Campo de texto em uma variavel.

                String nomeautorl = nomeautor.getText(); //Recebendo nome do autor do Campo de texto em uma variavel.

                String editoral = editora.getText(); //Recebendo nome da editora do Campo de texto em uma variavel.

                String stringissn = issn.getText(); //Recebendo issn do Campo de texto em uma variavel.

                long issnl = Long.parseLong(stringissn); //Transformando issn de String para long.

                control.cadastrarLivro(titulol, nomeautorl, editoral, issnl); //Adicionando novo livro no ArrayList do controle.
                //Limpando as variaveis depois de inseri-las no cadastro.
                titulo.setText(""); 

                nomeautor.setText("");

                editora.setText("");

                issn.setText("");

                JOptionPane.showMessageDialog(null, "Cadastro Realizado");

                }catch(NumberFormatException ne){ //Tratamento de issn
                  JOptionPane.showMessageDialog(null, "O ISSN inserido eh invalido.\n(ISSN eh uma sequencia de numeros).");
                  //Limpando as variaveis depois do tratamento.
                  titulo.setText(""); 

                  nomeautor.setText("");

                  editora.setText("");

                  issn.setText("");

                } //Fim do try catch.
            }else{ //Se os campos estiverem vazios.
              JOptionPane.showMessageDialog(null, "Por favor, insira os dados");
              } //Fim do if else.
            } //Fim do ActionPerformed.
        }); //Fim do ActionListener do btncadastro.
        btnimprime.addActionListener(new ActionListener(){
          @Override
            public void actionPerformed(ActionEvent e) { //Definindo acao ao clicar no botao de imprimir dados
              if(control.imprimeLivros() == ""){ //Caso nao encontre nenhum livro.
                JOptionPane.showMessageDialog(null, "Nenhum livro cadastrado");
              }else{ //Caso encontre.
                JOptionPane.showMessageDialog(null, control.imprimeLivros());
              } //Fim do if else.
            } //Fim do actionPerformed.
        }); //Fim do ActionListener do btnimprime.
        btndeleta.addActionListener(new ActionListener(){
          @Override
            public void actionPerformed(ActionEvent e) { //Definindo acao ao clicar no botao de remover livro.
              try{ //Forma de tratamento do botao "cancelar" do InputDialog
                String titulotemp = JOptionPane.showInputDialog(null, "Digite o titulo do livro"); //Variavel para reber titulo inserido pelo usuario.
                if(titulotemp.equals("")){ //Verifica se o campo esta vazio ao confirmar.
                  JOptionPane.showMessageDialog(null, "Por favor digite o titulo");
                }else if(control.buscaTitulo(titulotemp) == null && !(titulotemp.equals(""))){ //Verifica se retornou algum objeto Livro e se a entrada nao foi vazia.
                  JOptionPane.showMessageDialog(null, "Livro nao encontrado, certifique-se de que o livro esteja cadastrado");
                }else{ //Remove o livro, ja que nenhum dos empecilhos foi encontrado
                  control.removeLivro(titulotemp);
                  JOptionPane.showMessageDialog(null, "Livro removido");
                } //Fim do if else.
              }catch(NullPointerException ex){  
                } //Fim do TryCath.
              } //Fim do actionPerformed.
        }); //Fim do ActionListener do btndeleta.
      }catch(Exception e){
        System.out.println("Erro");
      }
    } //Fim do Construtor Janela.
} //Fim da classe Janela.