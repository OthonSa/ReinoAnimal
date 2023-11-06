package ReinoAnimal;

public class Aereo extends Animal{

	/**
	 * Classe reponsavel por conter todos os animais aereos, abaixo temos:
	 * Atributo que armazena a altitude que o animal consegue voar.
	 * 
	 * @author 20201064010009
	 */
	
	private double altitudeVoo;

    /**
     *  Construtor da classe Aereo
     *
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
     * 
     */
    public double getAltitudeVoo() {
        return altitudeVoo;
    }

    
    public void setAltitudeVoo(double altitudeVoo) {
        this.altitudeVoo = altitudeVoo;
    }
}
