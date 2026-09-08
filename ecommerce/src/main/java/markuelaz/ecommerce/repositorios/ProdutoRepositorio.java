package markuelaz.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import markuelaz.ecommerce.entidades.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, Integer>{

}
