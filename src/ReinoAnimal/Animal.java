package ReinoAnimal;

public class Animal {
	 	
	/**
	 * Classe reponsavel por conter todos os dados base dos animais, abaixo temos:
	 * Atributo que armazena a espécie do animal,Atributo que armazena o sexo do animal,
	 * Atributo que armazena a data de nascimento do animal,
	 * Atributo de classe para contar a quantidade de animais instanciados.
	 *
	 * @author 20201064010009
	 */

		private String especie;  
	    private String sexo;    
	    private int dataNascimento;  
	    private static int contador = 0;

	    /**
	     * Construtor da classe Animal
	     * Incrementa o contador ao instanciar um novo animal.
	     */
	    public Animal(String especie, String sexo, int dataNascimento) {
	        this.especie = especie;
	        this.sexo = sexo;
	        this.dataNascimento = dataNascimento;
	        incrementarContador();
	    }

	    /**
	     * Método privado para incrementar o contador de animais
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
	     * Método estático para obter a quantidade de animais instanciados
	     * 
	     */
	    public static int getContador() {
	        return contador;
	    }

	    /**
	     * 
	     * logo abaixo temos os gets e sets da classe animal
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