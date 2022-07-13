package notificacao;

import modelo.Cliente;

public interface Notificador {

    public void notificar(Cliente cliente, String mensagem);

}
