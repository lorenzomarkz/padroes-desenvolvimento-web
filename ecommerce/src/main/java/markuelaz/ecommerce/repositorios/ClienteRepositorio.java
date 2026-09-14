package markuelaz.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import markuelaz.ecommerce.entidades.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {

}