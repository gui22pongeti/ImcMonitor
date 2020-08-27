class TesteSimples {

 public void executar(){
    Atleta atleta = new Atleta();
    atleta.setNome("Paulo Fernandes");
    atleta.setIdade(27);

    System.out.println("\nNome = "+ atleta.getNome());
    System.out.println("Idade = " +atleta.getIdade());
 }
}