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

      if(op == 11){
        listarAtletas();
        menu();
      }

      }


      

    }
  

  private static void menu(){
    System.out.println("\nMENU *****");
      System.out.println("1. [x] ATLETA");
      System.out.println("11. [<] LISTAGEM");
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

      int i = 1;
      for(Atleta atemp : matriculas){
      System.out.println(i++ + " - "+ atemp.getNome() + " (" + atemp.getIdade() + ")");
}

    }






}