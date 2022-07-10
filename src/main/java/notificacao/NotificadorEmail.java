package notificacao;

import modelo.Cliente;

public class NotificadorEmail {

    public void notificar(Cliente cliente, String mensagem){
        System.out.println("Notificando "+cliente.getNome()+
                           " através do e-mail: "+cliente.getEmail()+
                           " mensagem: "+mensagem);
    }

}
