package senai.desafio;

import javax.swing.JOptionPane;

public class DesafioTabelaSenai {

	public static void main(String[] args) {
		
		int operacao = -1;
		Double valor1 = 0.0;
		Double valor2 = 0.0;
		Double valor3 = 0.0;

		Double soma = 0.0;
		Double maximo = 0.0;
		Double minimo = 0.0;
		Double media = 0.0;
		Double totalSemestre = 0.0;
		
			
		while (operacao > -1) {
			Double.parseDouble(JOptionPane.showInputDialog("Digite o valor opera��o Primeiro Trimestre: 1- SOMA / 2- M�XIMO / 3- M�NIMO / 4-M�DIA / 5-TOTAL / 0- SAIR"));
		
		  switch (operacao) {
			case 1:
				valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro valor referente a Janeiro: "));
				valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo valor referente a Fevereiro: "));
				valor3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Terceiro valor referente a Mar�o: "));
				soma = (valor1+valor2+valor3);
				jopDouble("Digite o valor do servi�o"+soma);
				break;
			case 2:
				valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro valor referente a Janeiro: "));
				valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo valor referente a Fevereiro: "));
				valor3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Terceiro valor referente a Mar�o: "));
		        if (valor1 > valor2 && valor1 > valor3 ) {
		        	jopDouble("O maior valor �: " +valor1);
				} else if (valor2 > valor1 && valor2 > valor3) {
					jopDouble("O maior valor �: " +valor2);
				} {
					jopDouble("O maior valor �: "+ valor3);
				}
				break;
			case 3:
				valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro valor referente a Janeiro: "));
				valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo valor referente a Fevereiro: "));
				valor3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Terceiro valor referente a Mar�o: "));
				if (valor1 < valor2 && valor1 < valor3 ) {
					jopDouble("O menor valor �: "+valor1);
				} else if (valor2 < valor1 && valor2 < valor3) {
					jopDouble("O menor valor �: "+ valor2);
				} {
					jopDouble("O menor valor �: "+ valor3);
				}
				break;
			case 4:
				valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro valor referente a Janeiro: "));
				valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo valor referente a Fevereiro: "));
				valor3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Terceiro valor referente a Mar�o: "));
				media = (valor1 + valor2 + valor3 / 3);
				jopDouble("A m�dia do Primeiro Trimestre �: "+ media);
				break;
			case 5:
				valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro valor referente a Primeiro Trimestre: "));
				valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo valor referente a Segundo Trimestre: "));
				totalSemestre = (valor1 + valor2);
				jopDouble("A m�dia do Primeiro Trimestre �: "+ totalSemestre);
				break;
			case 0:
				Double.parseDouble(JOptionPane.showInputDialog("Sair do menu"));
				break;
			default:
				Double.parseDouble(JOptionPane.showInputDialog("Op��o �nvalida"));
				break;
			}
		
		
		}
		
		
		
		}
		
	public static Double jopDouble(String msg) {
		Double numero = 0.0;
		numero = Double.parseDouble(JOptionPane.showInputDialog(msg));
		return numero;
		
	}

}
