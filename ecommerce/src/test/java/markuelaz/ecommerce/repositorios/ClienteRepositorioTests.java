package markuelaz.ecommerce.repositorios;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import markuelaz.ecommerce.entidades.Cliente;

@SpringBootTest
public class ClienteRepositorioTests {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Test
    public void deveSalvarUmClienteNovo() {

        var cliente = new Cliente();
        cliente.setNome("Maria Souza");
        cliente.setEmail("maria.souza@email.com");
        cliente.setTelefone("11999998888");

        clienteRepositorio.save(cliente);

        assertNotNull(cliente.getId());
    }
}