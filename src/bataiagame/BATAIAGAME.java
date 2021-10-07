
package bataiagame;



public class BATAIAGAME {

    
    public static void main(String[] args) {
        //selecionando os bunecos
        System.out.println("ESCOLHA SEU CAMPEÃO");
        
        Buneco buneco1 = new Buneco("Alesios", "Guerreiro",2);
        Buneco buneco2 = new Buneco("Ermack", "Mago",2);
        Buneco buneco3 = new Buneco("Astaroth", "Necromante", 2);
        Buneco buneco4 = new Buneco("DIO","Entidade" , 10);
        
        //condições de batalha
        int vidaBuneco2 = buneco2.getVida();
        int vidaBuneco3 = buneco3.getVida();
        int defesaBuneco2 = buneco2.getDefesa();
        int defesaBuneco3 = buneco3.getDefesa();
        
        //campeões selecionados
          System.out.println(buneco2.getNome() + " Chegou pra BATALHA");
          System.out.println(buneco3.getNome() + " Chegou pra BATALHA");
          
        //batalha
        if (vidaBuneco2 > vidaBuneco3 && defesaBuneco2 >= defesaBuneco3) {
            
            System.out.println(buneco2.getNome() + " Venceu o x1");
        }else{
            System.out.println(buneco3.getNome() + " Venceu o x1");
        }
        
    }

    
}
