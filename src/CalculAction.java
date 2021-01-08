

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class CalculAction extends AbstractAction {
	private CalculatriceFenetre fenetre;
	
	public CalculAction(CalculatriceFenetre fenetre, String texte){
		super(texte);
		
		this.fenetre = fenetre;
	}
	
	public void actionPerformed(ActionEvent e) { 
		String nombre1String = fenetre.getField1().getText();//On r�cup�re la valeur dans le premier champ
		double nombre1 = Double.parseDouble(nombre1String);//On convertit cette valeur en un nombre
	
		String nombre2String = fenetre.getField2().getText();//On r�cup�re la valeur dans le deuxi�me champ
		double nombre2 = Double.parseDouble(nombre2String);//On convertit cette valeur en un nombre
	
		String operateur = fenetre.getModelOperateurs().getSelectedOperateur();
			
		double resultat = 0;
			
		if("+".equals(operateur)){
			resultat = nombre1 + nombre2;
		} else if ("-".equals(operateur)){
			resultat = nombre1 - nombre2;
		} else if ("*".equals(operateur)){
			resultat = nombre1 * nombre2; 
		} else if ("/".equals(operateur)){
			resultat = nombre1 / nombre2; 
		}
		
		fenetre.getLabel().setText("R�sultat = " +  resultat);
	} 
}