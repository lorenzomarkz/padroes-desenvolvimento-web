package markuelaz.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import markuelaz.ecommerce.entidades.Categoria;

public interface CategoriaRepositorio extends JpaRepository <Categoria, Short> {

}
