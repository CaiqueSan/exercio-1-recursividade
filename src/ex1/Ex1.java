package ex1;

import javax.swing.JOptionPane;

public class Ex1 {
	
	public static void main(String args[]) {
		int a;
		a = Integer.parseInt((JOptionPane.showInputDialog("Digite um numero")));
		System.out.println(Ex1(a));
	}
	
	public static int Ex1(int n) {
		// a condição de parada é quando o valor n chega a zero, sendo impossível continuar a soma
		if (n <= 0)
				return 0;
		else {
		// a função soma o valor n atual e chama a mesma função novamente enviando um valor menor, assim os numeros são somados em sequência
			return n + (Ex1 (n-1));
		}
	}

}
