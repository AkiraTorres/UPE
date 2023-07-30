import java.util.ArrayList;

public class Buffer {

    int TAMANHO_MAXIMO=10;
    ArrayList<Integer> dados = new ArrayList<Integer>();

    public void inserir(int novoValor) {
        if(dados.size() >= TAMANHO_MAXIMO) {
            System.out.println("[INSERIR] vai dormir...");
            synchronized(dados) {
                try {
                    dados.wait();
                
                } catch (Exception e) {}
            }

        } else {
            dados.add(novoValor);
            //deve acordar o consumidor
            System.out.println("[INSERIR] acordando consumidor...");
            synchronized(dados) {
                try {
                    dados.notify();
                
                } catch (Exception e) {}
            }
        }
    }

    public int pegarValor() {
        int valor = -1;

        if(dados.size() == 0) {
            System.out.println("[PEGAR] vai dormir...");
            synchronized(dados) {
                try {
                    dados.wait();
                    
                } catch (Exception e) {}
            }
        } else {
            if(dados.size() == TAMANHO_MAXIMO) {
                valor = dados.remove(0);
                System.out.println("[PEGAR] acordando Produtor...");
                //acorda o produtor
                synchronized(dados) {
                    try {
                        dados.notify();
                    
                    } catch (Exception e) {}
                }
    
            } else {
                valor = dados.remove(0);
            }
        }

        return valor;
    }
    
}
