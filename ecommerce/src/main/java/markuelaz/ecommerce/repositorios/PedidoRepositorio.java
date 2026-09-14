package markuelaz.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import markuelaz.ecommerce.entidades.Pedido;

public interface PedidoRepositorio extends JpaRepository<Pedido, Integer> {

}