
package bataiagame;


public class Buneco {
    //atributos 
    private String nome;
    private String tipo;
    private int level;
    private int vida;
    private int ataque;
    private int magia;
    private int atkMagico;
    private int defesa;
    
    //construtor

    public Buneco(String nome, String tipo, int level) {
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
        CalcLevel();
        arquetipo();
        imprimeBuneco();
    }
    
    
    //metodos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public int getAtkMagico() {
        return atkMagico;
    }

    public void setAtkMagico(int atkMagico) {
        this.atkMagico = atkMagico;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    public void arquetipo(){
    switch(this.tipo){
        case "Guerreiro" -> {
            this.ataque = 10;
            this.defesa = 8;
            this.vida = 50;
            }
            
        case "Mago" -> {
            this.ataque = 2;
            this.atkMagico = 12;
            this.defesa = 5;
            this.magia = 25;
            this.vida = 40;
            }
            
        case "Necromante" -> {
            this.ataque = 6;
            this.atkMagico = 9;
            this.defesa = 6;
            this.magia = 26;
            this.vida = 30;
            }
            
        case "Entidade" -> {
            this.ataque = 30;
            this.atkMagico = 18;
            this.defesa = 15;
            this.magia = 60;
            this.vida = 70;
            }
    }
    
    }
    public void imprimeBuneco(){
        System.out.println("Nome: " + nome + " | " +
                           "Tipo: " + tipo + " | " +
                           "Level: " + level + " | " +
                           "Vida: " + vida + " | " +
                           "Magia: "+ magia + "| "+       
                           "Ataque: " + ataque + " | " +
                           "Ataque-Magico: " + atkMagico + " | " +        
                           "Defesa: " + defesa + " | "
        );
        
        

    
    }
    public void CalcLevel(){
    vida = vida + (level / 2);
    ataque = ataque + (level / 3);
    defesa = defesa + (level / 2);
    magia = magia + (level / 2);
    atkMagico = atkMagico + (level/3);
    }
}
