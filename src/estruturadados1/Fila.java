/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadados1;

/**
 *
 * @author Bruno
 */
public class Fila {
    
    int inicio, fim, qtdElementos, tam;
    
    public Object[] fila;
            
    public Fila(int tamanho){
        this.tam=tamanho;
        this.inicio = 0;
        this.fim = 0;
        this.qtdElementos = 0;
        this.fila = new Object [this.tam];    
    }
    
    public boolean filaCheia(){
        if(this.qtdElementos==this.tam)
            return true;
        else
            return false;
    }
    
    public boolean filaVazia(){
        if(this.qtdElementos==0)
            return true;
        else
            return false;
    }
    
    public void inserir(Object obj){
        if(!filaCheia()){
            this.fila[fim]=obj;
            this.qtdElementos++;
            this.fim++;
            if(this.fim==tam){
                this.fim = 0;
            }    
            
        }else
           System.out.println("Fila cheia");
    }
    
    public Object remover(){
        Object temp = null;
        if(!filaVazia()){
            temp = this.fila[inicio];
            this.fila[inicio] = null;
            this.inicio++;
            this.qtdElementos--;
            if(this.inicio==this.tam){
                this.inicio=0;
            }
        }else{
            System.out.println("Fila Vazia!");
        }
        return temp;
    }  
}
