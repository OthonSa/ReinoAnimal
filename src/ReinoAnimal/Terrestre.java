package ReinoAnimal;

public class Terrestre extends Animal{
	
	/**
	 * Classe reponsavel por conter todos os animais terrestres, abaixo temos:
	 * Atributo que armazena a regiao,Atributo que armazena o tipo da pelagem,
	 * 
	 * @author 20201064010009
	 */
	
	private String regiao;  
    private boolean possuiPelagem;  

    /**
     * Construtor da classe Terrestre para especificar que o animal é terrestre
     * 
     */
    public Terrestre(String especie, String sexo, int dataNascimento, String regiao, boolean possuiPelagem) {
        super(especie, sexo, dataNascimento);
        this.regiao = regiao;
        this.possuiPelagem = possuiPelagem;
    }

    /**
     *  Método que simula o ato de mover do animal terrestre
     */
    public void mover() {
        System.out.println("O animal está se movendo...");
    }

    /**
     *  Sobrescreve o método comer da classe Animal
     */
    @Override
    public void comer() {
        System.out.println("O animal terrestre está comendo...");
    }

    /**
     * Sobrescreve o método perfil da classe Animal
     */
    @Override
    public void perfil() {
        super.perfil();
        System.out.println("Região: " + regiao);
        System.out.println("Possui Pelagem: " + possuiPelagem);
    }

    /**
     *  Gets e sets para os atributos da classe Terrestre
     * 
     */
    
    public String getRegiao() {
        return regiao;
    }

    
    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

  
    public boolean isPossuiPelagem() {
        return possuiPelagem;
    }

   
    public void setPossuiPelagem(boolean possuiPelagem) {
        this.possuiPelagem = possuiPelagem;
    }

}
