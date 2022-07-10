package di;

import modelo.Cliente;
import service.AtivacaoClienteService;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", "joao@gmail.com", "+24491234");
        Cliente cliente2 = new Cliente("Maria", "maria@gmail.com", "+24491234");

        AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService();
        ativacaoClienteService.ativar(cliente1);
        ativacaoClienteService.ativar(cliente2);

    }

}
