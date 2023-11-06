package ReinoAnimal;

/**
		 * Classe reponsavel por conter todos os dados base dos animais, abaixo temos:
	 	* Atributo que armazena a espécie do animal,Atributo que armazena o sexo do animal,
	 	* Atributo que armazena a data de nascimento do animal,
	 	* Atributo de classe para contar a quantidade de animais instanciados.
	 	*
	 	* @author 20201064010009
	 	*/
public class Animal {
	 	
		private String especie;  
	    private String sexo;    
	    private int dataNascimento;  
	    private static int contador = 0;

	    /**
	     *  Construtor da classe Animal
	     * @param especie aqui vai referenciar a especie do animal
	     * @param sexo aqui vai referenciar do animal
	     * @param dataNascimento aqui vai referenciar a data de nascimento
	     */
	
	    public Animal(String especie, String sexo, int dataNascimento) {
	        this.especie = especie;
	        this.sexo = sexo;
	        this.dataNascimento = dataNascimento;
	        incrementarContador();
	    }

	    /**
	     *  Método privado para incrementar o contador de animais
	     */
	    private void incrementarContador() {
	        contador++;
	    }

	    /**
	     * Método que simula o ato de comer do animal
	     */
	    public void comer() {
	        System.out.println("O animal está comendo...");
	    }

	    /**
	     * Método que exibe o perfil do animal, mostrando os atributos
	     */
	    public void perfil() {
	        System.out.println("Espécie: " + especie);
	        System.out.println("Sexo: " + sexo);
	        System.out.println("Data de Nascimento: " + dataNascimento);
	    }

	    /**
	     *  Método estático para obter a quantidade de animais instanciados
	     * @return aqui vai pegar o contador
	     */
	     
	    public static int getContador() {
	        return contador;
	    }

	    /**
	     * logo abaixo temos os gets e sets da classe animal
	     * 
	     */
	
	    public String getEspecie() {
	        return especie;
	    }

	   
	    public void setEspecie(String especie) {
	        this.especie = especie;
	    }

	   
	    public String getSexo() {
	        return sexo;
	    }

	   
	    public void setSexo(String sexo) {
	        this.sexo = sexo;
	    }

	   
	    public int getDataNascimento() {
	        return dataNascimento;
	    }

	    
	    public void setDataNascimento(int dataNascimento) {
	        this.dataNascimento = dataNascimento;
	    }
	
}
