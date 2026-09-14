package markuelaz.ecommerce.repositorios;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import markuelaz.ecommerce.entidades.Cliente;
import markuelaz.ecommerce.entidades.Pedido;

@SpringBootTest
public class PedidoRepositorioTests {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Autowired
    private PedidoRepositorio pedidoRepositorio;

    @Test
    public void deveSalvarUmPedidoNovo() {

        var cliente = new Cliente();
        cliente.setNome("João Pereira");
        cliente.setEmail("joao.pereira@email.com");
        cliente.setTelefone("11988887777");
        clienteRepositorio.save(cliente);

        var pedido = new Pedido();
        pedido.setData(LocalDateTime.now());
        pedido.setStatus("PENDENTE");
        pedido.setValorTotal(new BigDecimal("250.00"));
        pedido.setCliente(cliente);

        pedidoRepositorio.save(pedido);

        assertNotNull(pedido.getId());
    }
}