package markuelaz.ecommerce.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import markuelaz.ecommerce.entidades.Categoria;

import markuelaz.ecommerce.entidades.Produto;


@SpringBootTest 
public class ProdutoRepositorioTests {
    @Autowired 
    private  CategoriaRepositorio categoriaRepositorio;
     
    @Autowired 
    private ProdutoRepositorio produtoRepositorio;
    
    @Test
    public void deveSalvarUmProdutoNovo() {

        var produto = new Produto ();
        produto.setNome("Notebook Lenovo Legion 5i");
        produto.setDescricao("SSD: 2TB, 144hz");
        produto.setPreco(new BigDecimal("12750.50"));
        produto.setEstoque(Short.parseShort("10"));


        var categoria = categoriaRepositorio.findById(Short.parseShort("1")).orElseThrow();
        produto.setCategoria(categoria);

        System.out.println("ID Antes +" + produto.getId());
        produtoRepositorio.save(produto);
        System.out.println("ID Depois +" + produto.getId());

        assertNotNull(produto.getId());
        assertEquals(60roduto.getId());
    }
}
