package markuelaz.ecommerce.repositorios;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import markuelaz.ecommerce.entidades.Categoria;

@SpringBootTest
public class CategoriaRepositorioTests {

    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    @Test
    public void deveSalvarUmaCategoriaNova() {

        var categoria = new Categoria();
        categoria.setNome("Eletrodomésticos");
        categoria.setDescricao("Produtos para casa");

        categoriaRepositorio.save(categoria);

        assertNotNull(categoria.getId());
    }
}