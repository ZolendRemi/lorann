package main;

import controller.Controller;
import model.Model;
import view.View;

/**
 * The Class Main.
 *
 * @author Jean-Aymeric Diet
 */
public abstract class Main {

	/**
	 * The main method.
	 *
	 * @param args
	 *          the arguments
	 */
	public static void main(final String[] args) {
		final Model model = new Model();// implémente le model
		final View view = new View(model); // La Vue observe le modèle
		final Controller controller = new Controller(view, model); // le contrôleur besoin de view pour la mise à jour et besoin du modele pour faire une action
		view.setController(controller); // couplage faible (C'est une agregation)
		controller.control();
	}
}