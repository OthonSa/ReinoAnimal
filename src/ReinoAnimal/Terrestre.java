package ReinoAnimal;
/**
	 * Classe reponsavel por conter todos os animais terrestres, abaixo temos:
	 * Atributo que armazena a regiao,Atributo que armazena o tipo da pelagem,
	 * 
	 * @author 20201064010009
	 */
public class Terrestre extends Animal{
	
	private String regiao;  
    private boolean possuiPelagem;  

    /**
     * Construtor da classe Terrestre para especificar que o animal é terrestre
     * @param aqui vai referenciar da especie
     * @param aqui vai referenciar do sexo
     * @param aqui vai referenciar da dataNascimento
     * @param aqui vai referenciar da regiao
     * @param aqui vai referenciar da possuiPelagem
     */
    public Terrestre(String especie, String sexo, int dataNascimento, String regiao, boolean possuiPelagem) {
        super(especie, sexo, dataNascimento);
        this.regiao = regiao;
        this.possuiPelagem = possuiPelagem;
    }

    /**
     * Método que simula o ato de mover do animal terrestre
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
     * @return retorna o tipo da regiao do animal
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
