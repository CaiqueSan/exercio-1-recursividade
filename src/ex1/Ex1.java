package ex1;

import javax.swing.JOptionPane;

public class Ex1 {
	
	public static void main(String args[]) {
		int a;
		a = Integer.parseInt((JOptionPane.showInputDialog("Digite um numero")));
		System.out.println(Ex1(a));
	}
	
	public static int Ex1(int n) {
		// a condi��o de parada � quando o valor n chega a zero, sendo imposs�vel continuar a soma
		if (n <= 0)
				return 0;
		else {
		// a fun��o soma o valor n atual e chama a mesma fun��o novamente enviando um valor menor, assim os numeros s�o somados em sequ�ncia
			return n + (Ex1 (n-1));
		}
	}

}
