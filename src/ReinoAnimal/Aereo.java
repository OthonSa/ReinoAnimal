package ReinoAnimal;
/**
 * Classe reponsavel por conter todos os animais aereos, abaixo temos:
 * Atributo que armazena a altitude que o animal consegue voar.
 * 
 * @author 20201064010009
 * 
 */
public class Aereo extends Animal{

	private double altitudeVoo;

    /**
     * Construtor da classe Aereo
     * @param especie para referenciar a do troço
     * @param sexo para referenciar o sexo do bixo
     * @param dataNascimento para referenciar a a data de nascimento
     * @param altitudeVoo para referenciar a alto que voa
     */
    public Aereo(String especie, String sexo, int dataNascimento, double altitudeVoo) {
        super(especie, sexo, dataNascimento);
        this.altitudeVoo = altitudeVoo;
    }

    /**
     *  Método que simula o ato de voar do animal aéreo
     */
    public void voar() {
        System.out.println("O animal está voando...");
    }

    /**
     *  Sobrescreve o método comer da classe Animal
     */
    @Override
    public void comer() {
        System.out.println("O animal aéreo está comendo...");
    }

    /**
     *  Sobrescreve o método perfil da classe Animal
     */
    @Override
    public void perfil() {
        super.perfil();
        System.out.println("Altitude de Voo: " + altitudeVoo);
    }

    /**
     *  gets e sets para os atributos da classe Aereo
     * @return aqui vai pegar o dado da altitude do voo
     */
   
    public double getAltitudeVoo() {
        return altitudeVoo;
    }

    
    public void setAltitudeVoo(double altitudeVoo) {
        this.altitudeVoo = altitudeVoo;
    }
}
