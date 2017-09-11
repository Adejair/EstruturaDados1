
package estruturadados1;
import java.util.Scanner;

public class EstruturaDados1 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Pilha pia = new Pilha();
        Pilha pia2 = new Pilha();
        Pilha metPilhas = new Pilha();
        int menu = -1;
        Scanner sc = new Scanner(System.in);
        while(menu != 0){
            
            System.out.println("Informe o numero do exercicio: ");
            menu = sc.nextInt(); sc.nextLine();
            
            switch (menu){               
                
                case 1:
                    for (int i = 0;i<5;i++){
                        System.out.println("Valor?");
                        int valor = sc.nextInt();
                        pia.empilhar(valor);

                        System.out.println("Valor da segunda pilha:");
                        valor = sc.nextInt();
                        pia2.empilhar(valor);
                    }

                    if(metPilhas.pilhaIgual(pia, pia2)){
                        System.out.println("Pilhas Iguais!");
                    }
                    
                break;
                
                case 2:
                    System.out.println("Caguei... coloque a porra da expressão");

                    String coisa; 
                    coisa = sc.nextLine();
                    
                    pia = metPilhas.empilhadoramentoStrings(coisa);
                    System.out.println("Tamanho da pilha " + pia.tamanho());
                    pia.imprimirPilha();
                break;
                
                case 3:
                    
                    String placa;
                    Object aux;
                    String menu3 = null;
                    int manobras = 0;
                    Pilha pilhaCarros = new Pilha(10);
                    Pilha pilhaCarrosAux = new Pilha();
                    int saida = -1;
                    while(saida != 0){
                        System.out.println("Bem vindo ao Estacionamento Ruim");
                        System.out.println("Informe a placa do veículo desejado");
                        placa = sc.nextLine();
                        System.out.println("Informe entrada (E), saida (S)");
                        menu3 = sc.nextLine();
                        switch (menu3){

                            case "E":
                                if(pilhaCarros.full()){
                                    System.out.println("Não há vagas!");
                                }
                                    pilhaCarros.empilhar(placa);
                            break;
                            case "S":
                                boolean parar = false;
                                while(parar==false){
                                   aux = pilhaCarros.desempilhar();
                                   pilhaCarrosAux.empilhar(aux);
                                   manobras ++;
                                   if(aux.equals(placa)){
                                       parar=true;
                                   }
                                }
                                if(manobras>1){
                                    for(int i=0;i<manobras;i++){
                                        pilhaCarros.empilhar(pilhaCarrosAux.desempilhar());
                                    }
                                }
                                System.out.println("Numero de manobras: " + manobras);
                                pilhaCarros.imprimirPilha();
                            break;
                        }
                        
                        System.out.println("\nSe desejar sair digite 0;");
                        saida = sc.nextInt(); sc.nextLine();
                    }
                    
                break;
                    
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }   
    
    
}
