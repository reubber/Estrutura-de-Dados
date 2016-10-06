package fila.circular.estruturados.rbbr;

public class FilaArranjoCircular {
	
	private Object itens[];
	int tam, frente, tras ,totalElementos;
	
	public FilaArranjoCircular(int maxTam) {
		this.itens = new Object[maxTam];
		this.frente = 0;
		this.tras = this.frente;
		
	}
	
	public FilaArranjoCircular(){
		this.itens = new Object[8];
		this.tam = 8;
	}
	
	public void enfilerar (Object elemento){
		
		if(!full())
		{ 
			itens[tras] = elemento;
			tras = (tras+1)%tam;
			totalElementos++;
		}		else
		{
			aumentarFila();
			itens[tras] = elemento;
			tras = (tras+1)%tam;
			totalElementos++;
		}
	}
	
	public Object desenfilerar() throws Exception{
		if(vazia())
		{
			throw new Exception("erro: lista vazia");
			
		}
		else
		{
			Object x = itens[frente];
			itens[frente] = null;
			frente = (frente+1)%tam;
			totalElementos--;
				return x;
		}
	}
	
	public int buscaElemento(Object elemento){
		for(int i=0; i<this.tam;i++){
			if (this.itens[i].equals(elemento)){
				return i;
		}
				
		}
					return -1;
	}
	
		public void aumentarFila(){
			int novoTamanho = tam + ((tam * 2));
				Object aux[] = new Object[novoTamanho];
					for(int i = 0; i < this.totalElementos; i++){
							aux[i] = itens[(frente + i)%tam];
					}
					itens = aux;
						frente = 0;
							tras = totalElementos;
								tam = novoTamanho;
	}
	
		public boolean vazia(){
			return frente == tras;
	}
	
		public boolean full(){
			return (tras+1)%tam == frente;
	}
	
	
		public void Listar(){
			int i = 0; 
			
					System.out.print("[");
			while(i < itens.length){
					System.out.print(itens[i]);
								i++;
							if(i < itens.length){
					System.out.print(",");				
							}
							else
							{
					System.out.print("]");				
				}
			}
					System.out.println(".");	
		}
	
	public Object[] getItens() {
		
		return itens;
	
	}

	public void setItens(Object[] itens) {
		this.itens = itens;
	}

	
	
}


