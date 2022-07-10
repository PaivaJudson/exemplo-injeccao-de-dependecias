package service;

import modelo.Cliente;
import notificacao.NotificadorEmail;

public class AtivacaoClienteService {

    public void ativar(Cliente cliente){
        cliente.ativar();

        NotificadorEmail notificadorEmail = new NotificadorEmail();
        notificadorEmail.notificar(cliente, "Seu cadastro no sistema está ativo");
    }

}
