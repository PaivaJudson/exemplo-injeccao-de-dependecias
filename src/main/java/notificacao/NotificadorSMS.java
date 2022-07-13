package notificacao;

import modelo.Cliente;

public class NotificadorSMS implements Notificador{

    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.println("Notificando "+cliente.getNome()+
                " através de SMS: "+cliente.getTelefone()+
                " mensagem: "+mensagem);
    }

}
