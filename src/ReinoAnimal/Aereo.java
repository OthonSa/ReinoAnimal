package ReinoAnimal;

/**
 * uma classe para especificar os animais voadores e seus metodos e atributos
 * @author 20201064010009
 */
public class Aereo extends Animal{
	
	/**
	 * atributo exclusivo dos voadores
	 */
	private double altitudeVoo;
	
	/**
	 * 
	 * constrututor para categorizar os animais voadores
	 * @param especie referenciar a especie animal
	 * @param sexo referenciar o sexo do animal
	 * @param dataNascimento referenciar a data de nascimento
	 * @param altitudeVoo referenciar a altitude de voo do animal
	 */
    public Aereo(String especie, String sexo, int dataNascimento, double altitudeVoo) {
        super(especie, sexo, dataNascimento);
        this.altitudeVoo = altitudeVoo;
    }
    
    /**
     * simular que o animal está voando
     */
    public void voar() {
        System.out.println("O animal está voando...");
    }
    
    @Override
    public void comer() {
        System.out.println("O animal aéreo está comendo...");
    }
   
    @Override
    public void perfil() {
        super.perfil();
        System.out.println("Altitude de Voo: " + altitudeVoo);
    }
    public double getAltitudeVoo() {
        return altitudeVoo;
    }

    
    public void setAltitudeVoo(double altitudeVoo) {
        this.altitudeVoo = altitudeVoo;
    }
}
