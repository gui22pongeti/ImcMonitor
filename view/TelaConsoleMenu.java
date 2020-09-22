import java.util.Scanner;

class TelaConsoleMenu{

    Scanner teclado = new Scanner(System.in);
    Atleta atletaDaAcademia = new Atleta();

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
      }

      }


      

    }
  

  private static void menu(){
    System.out.println("\nMENU *****");
      System.out.println("1. [x] ATLETA");
      System.out.println("5. [<] LISTAGEM");
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

      atletaDaAcademia = novo;

    }

    private void listarAtletas(){

      System.out.println("Listagem de Atletas:");

      System.out.println(atletaDaAcademia.getNome() + " (" + atletaDaAcademia.getIdade() + ")");


    }






}