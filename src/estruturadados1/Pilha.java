
package estruturadados1;


public class Pilha {
    
    int posicaoPilha;
    public Object[] pilha;
    
    public Pilha() {
	this.posicaoPilha = -1;

        this.pilha = new Object[10];
    }
    
    public Pilha(int tamanho){
        this.posicaoPilha = -1;
        this.pilha = new Object[tamanho];
    }
    
    public boolean pilhaVazia() {
            if (this.posicaoPilha == -1) {
                return true; 
            // Verifica que o o atributo posicaoPilha é igual a -1,
            //se for, a pilha é nula, ou seja, ainda esta vazia,
            //retornando verdadeiro.
            }
        return false;
    }
    
    public int tamanho() {
        if (this.pilhaVazia()) {
            return 0; // aqui indica que não tem nenhum conteúdo dentro da pilha
        }
        return this.posicaoPilha + 1;
	// aqui indica quantos itens tem dentro da pilha, somando-se 1, 
	//pois a pilha inicia no zero. Logo, se tivermos 3 itens na pilha,
	// o atributo posicaoPilha vai exibir 2.
	//Para sabermos quantos itens há, precisamos somar um.
}
    public void empilhar(Object valor) {
        // push
        if (this. posicaoPilha < this.pilha.length - 1) { 
	// verifica se a posicaoPilha é menor do que o tamanho da pilha,
	//se for, então é inserido o valor na pilha e ao mesmo tempo é feito
	//o incremento do atributo posicaoPilha
            this.pilha[++posicaoPilha] = valor;
        }
}
    
    public Object desempilhar() {
        //pop
        if (pilhaVazia()) {
            return null;
	// primeiro verificamos se a pilha esta vazia,
	//se estiver, nada será realizado
        }
        return this.pilha[this.posicaoPilha --];
	// aqui retorna o que tem na última posição da pilha
	//e decrementa o atributo posicaoPilha
    }
    public Object ultimo(){
        if (pilhaVazia()){
            return null;
        }
        return this.pilha[this.posicaoPilha];
    }
    
    public boolean full(){
        if (this.posicaoPilha == this.tamanho()) {
                return true; 
            // Verifica que o o atributo posicaoPilha é igual ao tamanho,
        //se for, a pilha está cheia,
            //retornando verdadeiro.
            }
        return false;
    }
    
    public boolean pilhaIgual(Pilha pilha1, Pilha pilha2){
        if (pilha1.tamanho()!=pilha2.tamanho()){
            System.out.println("Pilhas diferentes... até o tamanho ta diferente.");
            return false;
        }
        while(pilha1.pilhaVazia()==false && pilha2.pilhaVazia()==false){
           if(!pilha1.desempilhar().equals(pilha2.desempilhar())){
               System.out.println("Pilhas diferentes");
               return false;
           }
        }
        return true;
    }
    
    public Pilha empilhadoramentoStrings(String coisa){
        if(coisa.isEmpty()){
            System.out.println("A expressão informada está vazia");
            return null;
        }
        
        System.out.println("Tamanho da palavra ->   "+ coisa.length());
        Pilha pilhaExpressao = new Pilha();
        String operadores = null;
        
        for(int i = 0; i<=coisa.length()-1;i++){
            if(coisa.charAt(i)=='*' || coisa.charAt(i)=='/' || coisa.charAt(i)=='+' || coisa.charAt(i)=='-' || coisa.charAt(i)=='^'){
                operadores += coisa.charAt(i);
            }else{
                pilhaExpressao.empilhar(coisa.charAt(i));
            }
        }
        
        if(operadores!=null){
            for(int i = 1; i<operadores.length()-1;i++){
                pilhaExpressao.empilhar(operadores.charAt(i));
            }
            return pilhaExpressao;
        }else{
            return pilhaExpressao;
        }
        
    }
    
    public void imprimirPilha(){
        if(this.pilhaVazia()){
            System.out.println("Meu, essa pilha ta fazia.");
        }else{
            for(int i =0 ; i < this.tamanho(); i++){
                System.out.print(""+ this.desempilhar() + " ");
            }
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}