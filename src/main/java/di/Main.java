package di;

import modelo.Cliente;
import notificacao.NotificadorEmail;
import notificacao.NotificadorSMS;
import service.AtivacaoClienteService;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("João", "joao@gmail.com", "+24491234");
        Cliente cliente2 = new Cliente("Maria", "maria@gmail.com", "+24491234");

        AtivacaoClienteService ativacaoClienteService1 = new AtivacaoClienteService(new NotificadorSMS());
        AtivacaoClienteService ativacaoClienteService2 = new AtivacaoClienteService(new NotificadorEmail());

        ativacaoClienteService1.ativar(cliente1);
        ativacaoClienteService2.ativar(cliente2);

    }

}
