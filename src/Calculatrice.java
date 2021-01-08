import javax.swing.SwingUtilities;

public class Calculatrice {
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				// Creation de ma fenetre
				CalculatriceFenetre fenetre = new CalculatriceFenetre();
				fenetre.setVisible(true);
				println("test");
			}
		});
	}
}