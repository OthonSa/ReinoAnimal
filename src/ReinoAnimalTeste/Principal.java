package ReinoAnimalTeste;

import ReinoAnimal.*;

/**
 * uma classe para testar o funcionamento de codigos criados
 * @author 20201064010009
 */
public class Principal {
	
	/**
	 * 
	 * uma classe pra aplicção pratica do codigo
	 * @param args o classico metodo main
	 */
	public static void main(String[] args) {
		
		/**
		 * aqui sera feito a inserção de animais aquaticos
		 */
		Aquatico aqua1 = new Aquatico("atum azul", "femea", 7, "agua salgada", false);
        Aquatico aqua2 = new Aquatico("tilapia", "macho", 3, "agua doce", true);
        /**
         * aqui sera feito a inserção de animais terrestres
         */
        Terrestre terra1 = new Terrestre("tigre de bengala", "femea", 2, "asia", true);
        Terrestre terra2 = new Terrestre("tamandua", "macho", 8, "America do Sul", true);
        /**
         * aqui sera a inserção de animais aereos
         */
        Aereo aereo1 = new Aereo("mae da lua", "macho", 3, 54.5);
        Aereo aereo2 = new Aereo("pinguin imperador", "femea", 10, 37.9);

        /**
         * aqui sera aplicação de metodos criados
         */
        aqua1.nadar();
        aqua1.comer();
        aqua1.perfil();

        terra1.mover();
        terra1.comer();
        terra1.perfil();

        aereo1.voar();
        aereo1.comer();
        aereo1.perfil();
        /**
         * aqui sera realizado a impressão do animal
         */
        System.out.println("Quantidade de animais instanciados: " + Animal.getContador());
    }

}
