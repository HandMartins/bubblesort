package service;

public class Bubble {

		public void calculaBubble() {
			
			int[] valores = {9,6,2,7,5,4};
			Integer valor1;
			
			for(int i = 0; i < valores.length - 1; i++) {
				for(int j = i + 1; j < valores.length; j++) {
					if(valores[i] > valores[j]) {
						int aux = valores[i];
						valores[i] = valores[j];
						valores[j] = aux;
					}
				}
			}
			System.out.println("Os valores ordenados são: ");
			for(int i = 0; i < valores.length; i++) {
				
				System.out.print(valores[i] + " ");
			}
			//System.out.print("Valores ordenados: " + valor);
			
		}
}
