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
			tras.setProx(new Celula());
			tras = tras.getProx();
			tras.setValor(elemento);
			
			
	   }

	
	public Object desenfilerar() throws Exception {
			Object valor = null;
			if(this.vazia()){
				throw new Exception ("error: fila vazia!!");
				}
			this.frente=this.frente.prox;
			valor=this.frente.getValor();
			
			return valor;
				
			}
			
			
	

	public int tamanho(){
			Celula aux = frente;
			int i;
				for(i = 0; aux != null; i++){
				aux = aux.getProx();
		}
				return i-1;
		}

	

	public void imprima() {
				Celula aux = frente;
			
			int i = 0, t = tamanho();
			System.out.print("||");
			while(i < t) {
				System.out.print(aux.getProx().getValor());
				aux = aux.getProx();
				if(aux.getProx() == null) {
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


