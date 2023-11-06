package ReinoAnimal;
/**
 * Classe reponsavel por conter todos os animais aquaticos, abaixo temos:
 * Atributo que armazena a tipoAgua,Atributo que armazena se ele possui escamas,
 * @author 20201064010009
 */
public class Aquatico extends Animal{
	
	private String tipoAgua; 
    private boolean possuiEscamas;

    /**
     * Construtor da classe Aquatico que vai especificar que o animal é aquatico
     * @param especie aqui vai referenciar da especie do animal
     * @param sexo aqui vai referenciar do sexo dele
     * @param dataNascimento aqui vai referenciar do anivesario dele
     * @param tipoAgua aqui vai referenciar o se vai ser molhada ou n
     * @param possuiEscamasa qui vai referenciar a se vai ter escamas ou n
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
        System.out.println("Tipo de Agua: " + tipoAgua);
        System.out.println("Possui Escamas: " + possuiEscamas);
    }

    /**
     * Getters e setters para os atributos da classe Aquatico
     * @return pega os dados do tipo da agua de manda de volta
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
