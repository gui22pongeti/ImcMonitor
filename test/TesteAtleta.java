class TesteAtleta{
public void testNome() throws Exception{

     Atleta atleta = new Atleta();
     atleta.setNome("ABCD");
     if(!atleta.getNome().equals("ABCD")){
       throw new Exception("[erro] falha manipulando NOME valor " + atleta.getNome());
     }

      atleta.setNome(" ");
     if(!atleta.getNome().equals(" ")){
       throw new Exception("[erro] falha manipulando NOME valor " + atleta.getNome()); 
     }
   }

      public void testIdade() throws Exception {

     Atleta atleta = new Atleta();
     atleta.setIdade(10);
     if(atleta.getIdade() != 10){ 
       throw new Exception("[erro] falha manipulando IDADE valor " + atleta.getIdade());
       }

       atleta.setIdade(02);
     if(atleta.getIdade() != 02){
       //System.out.println("[erro] falha miserável manipulando IDADE"); 
       throw new Exception("[erro] falha manipulando IDADE valor " + atleta.getIdade());
       }

       atleta.setIdade(99999);
     if(atleta.getIdade() != 99999){
       //System.out.println("[erro] falha miserável manipulando IDADE"); 
       throw new Exception("[erro] falha manipulando IDADE valor " + atleta.getIdade());
       }

       atleta.setIdade(25);
     if(atleta.getIdade() != 25){
       //System.out.println("[erro] falha miserável manipulando IDADE"); 
       throw new Exception("[erro] falha manipulando IDADE valor " + atleta.getIdade());
       }
   }


}