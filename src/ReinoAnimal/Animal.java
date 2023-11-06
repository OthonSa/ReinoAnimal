package ReinoAnimal;

/**
 * uma classe generica para animal
 * @author 20201064010009
 */
public class Animal {
	
	 	/**
	 	 * atributos para os animais criados
	 	 */
		private String especie;  
	    private String sexo;    
	    private int dataNascimento;  
	    private static int contador = 0;
	    /**
	     * 
	     * construtor para a inserção de novos animais
	     * @param especie referenciar a especie de animal
	     * @param sexo referenciar o sexo do animal
	     * @param dataNascimento referenciar a data de nascimento
	     */
	    public Animal(String especie, String sexo, int dataNascimento) {
	        this.especie = especie;
	        this.sexo = sexo;
	        this.dataNascimento = dataNascimento;
	        incrementarContador();
	    }
	    /**
	     * contador para somar a lista
	     */
	    private void incrementarContador() {
	        contador++;
	    }
	    /**
	     * simular animal comendo
	     */
	    public void comer() {
	        System.out.println("O animal está comendo...");
	    }
	    /**
	     * exibir as catacteristicas do animal especificico imprimindo
	     */
	    public void perfil() {
	        System.out.println("Espécie: " + especie);
	        System.out.println("Sexo: " + sexo);
	        System.out.println("Data de Nascimento: " + dataNascimento);
	    }
	    
	    public static int getContador() {
	        return contador;
	    }

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
