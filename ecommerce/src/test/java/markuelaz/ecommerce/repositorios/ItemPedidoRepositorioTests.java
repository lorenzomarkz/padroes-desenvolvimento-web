package markuelaz.ecommerce.repositorios;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import markuelaz.ecommerce.entidades.Cliente;
import markuelaz.ecommerce.entidades.ItemPedido;
import markuelaz.ecommerce.entidades.Pedido;
import markuelaz.ecommerce.entidades.Produto;

@SpringBootTest
public class ItemPedidoRepositorioTests {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Autowired
    private PedidoRepositorio pedidoRepositorio;

    @Autowired
    private ProdutoRepositorio produtoRepositorio;

    @Autowired
    private ItemPedidoRepositorio itemPedidoRepositorio;

    @Test
    public void deveSalvarUmItemPedidoNovo() {

        var cliente = new Cliente();
        cliente.setNome("Ana Lima");
        cliente.setEmail("ana.lima@email.com");
        cliente.setTelefone("11977776666");
        clienteRepositorio.save(cliente);

        var pedido = new Pedido();
        pedido.setData(LocalDateTime.now());
        pedido.setStatus("PENDENTE");
        pedido.setValorTotal(new BigDecimal("4500.00"));
        pedido.setCliente(cliente);
        pedidoRepositorio.save(pedido);

        var produto = produtoRepositorio.findById(1).orElseThrow();

        var itemPedido = new ItemPedido();
        itemPedido.setQuantidade(1);
        itemPedido.setValorUnitario(produto.getPreco());
        itemPedido.setPedido(pedido);
        itemPedido.setProduto(produto);

        itemPedidoRepositorio.save(itemPedido);

        assertNotNull(itemPedido.getId());
    }
}