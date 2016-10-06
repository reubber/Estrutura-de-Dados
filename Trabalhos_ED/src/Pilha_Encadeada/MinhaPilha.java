package tipos.estruturados.pilhasEncadeadas.rbbr.ufc;

public class MinhaPilha {
	
	private static class Celula {
		Object item;
		Celula prox;
		
	}
	private Celula topo;
	private int tam;
		public Pilhas (){
		this.topo=null;
		this.tam=0;
		
		
	}
		
		
	public void empilhar (Object elemento){
		
		Celula aux = this.topo;
		this.topo= new Celula();
		this.topo.item = elemento;
		this.topo.prox= aux;
		
		
	}
	
	public Object desempilhar() throws Exception {
		if (this.vazia())
				throw new Exception("Ta mt errado: Pilha vazia!!");
		Object item = this.topo.item;
		this.topo = this.topo.prox;
		this.tam--;
		return item;
	}
	
	public boolean vazia() {
		return (this.topo==null);
	}
	
	public int tamanho() {
		return this.tam;
	}

}
