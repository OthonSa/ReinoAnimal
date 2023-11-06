package ReinoAnimal;

public class Aquatico extends Animal{
	
	/**
	 * Classe reponsavel por conter todos os animais aquaticos, abaixo temos:
	 * Atributo que armazena a tipoAgua,Atributo que armazena se ele possui escamas,
	 * 
	 * @author 20201064010009
	 */
	
	private String tipoAgua; 
    private boolean possuiEscamas;

    /**
     *  Construtor da classe Aquatico que vai especificar que o animal é aquatico
     * 
     */
    public Aquatico(String especie, String sexo, int dataNascimento, String tipoAgua, boolean possuiEscamas) {
        super(especie, sexo, dataNascimento);
        this.tipoAgua = tipoAgua;
        this.possuiEscamas = possuiEscamas;
    }

    /**
     * Método que simula o ato de nadar do animal aquático
     */
    public void nadar() {
        System.out.println("O animal está nadando...");
    }

    /**
     * Sobrescreve o método comer da classe Animal
     */
    @Override
    public void comer() {
        System.out.println("O animal aquático está comendo...");
    }

    /**
     * Sobrescreve o método perfil da classe Animal
     */
    @Override
    public void perfil() {
        super.perfil();
        System.out.println("Tipo de Água: " + tipoAgua);
        System.out.println("Possui Escamas: " + possuiEscamas);
    }

    /**
     * Getters e setters para os atributos da classe Aquatico
     * 
     */
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
