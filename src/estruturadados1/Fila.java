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
    
    int inicio, fim, qtdElementos, qtd;
    
    public Object[] fila;
            
    public Fila(int qtd){
        this.qtd=qtd;
        this.inicio = 0;
        this.fim = 0;
        this.qtdElementos = 0;
        this.fila = new Object [this.qtd];    
    }
    
    public boolean filaCheia(){
        if(this.qtdElementos==this.qtd)
            return true;
        else
            return false;
    }
    
    public boolean filaVazia(){
        if(this.inicio==qtdElementos)
            return true;
        else
            return false;
    }
    
    public void inserir(Object obj){
        if(!filaCheia()){
            this.fila[fim]=obj;
            this.qtdElementos++;
            if(this.fim==qtd){
                this.fim = inicio;
            }else{
                this.fim++;
            }
        }
    }
    
    public Object remover(){
        if(this.filaVazia()){
            return null;
        }else{
            this.qtdElementos--;
            this.fim--;
            return this.fila[fim+1];
        }
    }
    
    
    
}
