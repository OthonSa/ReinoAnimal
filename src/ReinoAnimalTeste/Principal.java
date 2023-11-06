package ReinoAnimalTeste;

import ReinoAnimal.*;
/**
 * essa classe é responsavel por conter o teste da classes criadas
 * @author 20201064010009
 *
 */
public class Principal {

	public static void main(String[] args) {
		/**
		 * aqui nesses 3 blocos de codigos contem os animais de cada ambiente especifico com seus dados
		 * que serão colerados e impressos.
		 */
		Aquatico aqua1 = new Aquatico("atum azul", "femea", 7, "agua salgada", false);
        Aquatico aqua2 = new Aquatico("tilapia", "macho", 3, "agua doce", true);

        Terrestre terra1 = new Terrestre("tigre de bengala", "femea", 2, "asia", true);
        Terrestre terra2 = new Terrestre("tamandua", "macho", 8, "America do Sul", true);

        Aereo aereo1 = new Aereo("mae da lua", "macho", 3, 54.5);
        Aereo aereo2 = new Aereo("pinguin imperador", "femea", 10, 37.9);

        /**
         * aqui sera feito o teste dos metodos Testando os métodos
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
         *  aqui vai sair a impressão dos animais a quantidade de animais instanciados
         */
        System.out.println("Quantidade de animais instanciados: " + Animal.getContador());
    }

}
