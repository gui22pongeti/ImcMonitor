class TestUnitario{

  public void executarAll() throws Exception {
     testNome();
     testIdade();

  }


   public void testNome(){

     Atleta atleta = new Atleta();
     atleta.setNome("ABCD");
     if(!atleta.getNome().equals("ABCD")){
       System.out.println("[erro] falha miserável manipulando NOME"); 
     }
   }

      public void testIdade() throws Exception {

     Atleta atleta = new Atleta();
     atleta.setIdade(10);
     if(atleta.getIdade() != 10){
       //System.out.println("[erro] falha miserável manipulando IDADE"); 
       throw new Exception("[erro] falha manipulando IDADE valor " + idade);


     }
   }


}