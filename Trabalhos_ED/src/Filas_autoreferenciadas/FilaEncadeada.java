package cap3.rbbr.autoreferencia;


public class FilaEncadeada {
	
		
		private Celula frente;
		private Celula tras;

		public FilaEncadeada () {
			this.frente = new Celula();
			this.tras = this.frente;
			this.frente.prox= null;
			
		
		}	
			
		
		public void enfilerar(Object elemento) {
				tras.prox=new Celula();
				tras = tras.prox;
				tras.setItem(elemento);
				
				
		   }

		
		public Object desenfilerar() throws Exception {
				Object valor = null;
				if(this.vazia()){
					throw new Exception ("error: fila vazia!!");
					}
				this.frente=this.frente.prox;
				valor=this.frente.getItem();
				
				return valor;
					
				}
				
				
		

		public int tamanho(){
				Celula aux = frente;
				int i;
					for(i = 0; aux != null; i++){
					
			}
					return i-1;
			}

		

		public void imprima() {
					Celula aux = frente;
				
				int i = 0, t = tamanho();
				System.out.print("||");
				while(i < t) {
					System.out.print(aux.prox.getItem());
					aux = aux.prox;
					if(aux.prox == null) {
						System.out.println("||\n");
			}else{
						System.out.print(" -- ");
			}
						i++;
			}
				
			}

			public boolean vazia(){
				if(tamanho() <= 1){
					return true;
			}
				return false;
			}
}
