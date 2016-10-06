package tipos.estruturados.rbbr;

public class Stack {

	private Object item[];
	private int top;
	
	public Stack (int tam) {
		this.item = new Object[tam];
		this.top=0;
		
			
	}
	public void empilhar (Object elemento) throws Exception {
		
		if(this.top == this.item.length){
			throw new Exception ("Erro: A pilha ta cheia");
			
		}else{ 
				this.item[this.top++]=elemento;
			
		}
		
	}
	public Object desempilhar() throws Exception {
		if(this.empty())
			throw new Exception("Erro: A pilha esta vazia");
				return this.item[--this.top];
			
			
			
	}
	public int buscaElemento(Object elemento){
		for(int i=0; i<this.tam();i++){
			if (this.item[i].equals(elemento)){
				return i;
		}
				
		}
					return -1;
		}

		
	public boolean empty(){
		return (this.top == 0);
		
	}
	
	public int tam(){
		return this.top;
		
	}
	
}
