package Condicionales;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int numero1,numero2;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog( "Ingrese el primer numero"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
		
		
		if (numero1>numero2) {
			JOptionPane.showMessageDialog(null, "El numero mayor es " +numero1 );
		}
		else if (numero2<numero2) {
			JOptionPane.showMessageDialog(null, "El numero mayor es " +numero2 );
		}
		else {
			JOptionPane.showMessageDialog(null, "Ambos numeros son iguales" );
		}

	}

}
