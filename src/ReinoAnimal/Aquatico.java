package ReinoAnimal;

/**
 * uma classe para especificar os animais aquaticos e seus metodos e atributos
 * @author 20201064010009
 */
public class Aquatico extends Animal{
	
	/**
	 * atributos exclusivos dos animais aquaticos
	 */
	private String tipoAgua; 
    private boolean possuiEscamas;
    
    /**
     * 
     * construtor para a inserção de novos animais aquaticos
     * @param especie referenciar a especie do animal
     * @param sexo referenciar o sexo do animal
     * @param dataNascimento referenciar  o anivesario do animal
     * @param tipoAgua referenciar o tipo da agua do animal
     * @param possuiEscamas referenciar se ele tem escamas ou n
     */
    public Aquatico(String especie, String sexo, int dataNascimento, String tipoAgua, boolean possuiEscamas) {
        super(especie, sexo, dataNascimento);
        this.tipoAgua = tipoAgua;
        this.possuiEscamas = possuiEscamas;
    }
    /**
     * simular que o anima ta nadando
     */
    public void nadar() {
        System.out.println("O animal está nadando...");
    }
    
    @Override
    public void comer() {
        System.out.println("O animal aquático está comendo...");
    }
    
    @Override
    public void perfil() {
        super.perfil();
        System.out.println("Tipo de Agua: " + tipoAgua);
        System.out.println("Possui Escamas: " + possuiEscamas);
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }
    
    public boolean isPossuiEscamas() {
        return possuiEscamas;
    }

    public void setPossuiEscamas(boolean possuiEscamas) {
        this.possuiEscamas = possuiEscamas;
    }

}
