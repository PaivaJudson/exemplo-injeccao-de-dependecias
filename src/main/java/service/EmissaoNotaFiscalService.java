package service;

import modelo.Cliente;
import modelo.Produto;
import notificacao.Notificador;
import notificacao.NotificadorEmail;

public class EmissaoNotaFiscalService {

    private Notificador notificador;

    public EmissaoNotaFiscalService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void emitir(Cliente cliente, Produto produto){
        notificador.notificar(cliente, "Nota fiscal do produto "+produto.getNome() + " foi emitida!");
    }

}
