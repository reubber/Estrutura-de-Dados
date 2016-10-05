package exercicios06e07;

public class Stack {
	private Object item[];
	private int top;
	
	public Stack (int tam) {
		this.item = new Object[tam];
		this.top=0;
		
			
	}
	public void empilha (Object elemento) throws Exception {
		
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
		
	public boolean empty(){
		return (this.top == 0);
		
	}
	
	public int tam(){
		return this.top;
		
	}
	
	public Object pesquisar(Object x) throws Exception{
		if(this.empty()){
			throw new Exception("Erro: A pilha esta vazia");
		}
		for(int i=0;i<tam();i++){
			if(this.item[i]==x){
				System.out.println("elemento encontrado");
			}
			
			
		}
				
		
				return item;
	}
		
}
