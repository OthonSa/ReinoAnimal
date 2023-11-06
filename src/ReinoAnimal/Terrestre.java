package ReinoAnimal;

/**
 * classe pra especificar animais terrestres
 * @author 20201064010009
 */
public class Terrestre extends Animal{
	
	/**
	 * atributos exclusivos da classe terrestre
	 */
	private String regiao;  
    private boolean possuiPelagem;  
    
    /**
     * 
     * construtor para isersção de novos animais terrestres
     * @param especie referenciar as especies terrestres
     * @param sexo referenciar o sexo do bixo
     * @param dataNascimento referenciar a data de nascimento do bixo
     * @param regiao referenciar a terra do bixo
     * @param possuiPelagem referenciar a pelugem do animal
     */
    public Terrestre(String especie, String sexo, int dataNascimento, String regiao, boolean possuiPelagem) {
        super(especie, sexo, dataNascimento);
        this.regiao = regiao;
        this.possuiPelagem = possuiPelagem;
    }
    /**
     * simular o andar do animal
     */
    public void mover() {
        System.out.println("O animal está se movendo...");
    }
    
    @Override
    public void comer() {
        System.out.println("O animal terrestre está comendo...");
    }
   
    @Override
    public void perfil() {
        super.perfil();
        System.out.println("Região: " + regiao);
        System.out.println("Possui Pelagem: " + possuiPelagem);
    }

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
