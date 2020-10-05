import java.util.Scanner;
import java.util.ArrayList;

class TelaConsoleMenu{

    Scanner teclado = new Scanner(System.in);
    ArrayList<Atleta> matriculas = new ArrayList<Atleta>();
    //Atleta atletaDaAcademia = new Atleta();

  public void executar(){

    boolean sair = false;

    int op;
    menu();
    while(!sair){ 
               
      op = teclado.nextInt();


      if(op == 0){
        sair = true;
      }

      if(op == 1){
        incluirNovoAtleta();
        menu();
      }

      if(op == 5){
        listarAtletas();
        menu();
      }

      if(op == 10){
        removerAtleta();
        menu();
      }


      

    }
  }
  

  private static void menu(){
    System.out.println("\nMENU *****");
      System.out.println("1. [x] ATLETA");
      System.out.println("2. [<] AVALIAÇÂO");
      System.out.println("5. [<] LISTAGEM");      
      System.out.println("7. [<] CONSULTA ATLETA");
      System.out.println("10. [<] REMOVE");
      System.out.println("0. [+] SAIR");
      System.out.println("-------------");
      System.out.println("Opção:_");  
  }

  private void incluirNovoAtleta(){
      System.out.println("Novo Atleta");

      System.out.print("nome_: ");
      String nome = teclado.next();

      System.out.print("idade_: ");
      int idade =  teclado.nextInt();

      Atleta novo = new Atleta();
      novo.setNome(nome);
      novo.setIdade(idade);

      //matriculas = novo;
      matriculas.add(novo);

    }

    private void listarAtletas(){

      System.out.println("\nListagem de Atletas:");

      if (matriculas.size() > 0){
      int i = 1;
      for(Atleta atemp : matriculas){
      System.out.println(i++ + " - "+ atemp.getNome() + " (" + atemp.getIdade() + ")");
}
}
      else{
        System.out.println("Nenhum atleta matriculado");
      }
    }

    private void removerAtleta(){

      System.out.println("\nRemover Atleta: ");

      this.listarAtletas();

      System.out.println("\nSelecione_: ");
      int posicao =  teclado.nextInt();

      matriculas.remove(posicao-1);

      
      System.out.println("\nRemovido!");
}
}