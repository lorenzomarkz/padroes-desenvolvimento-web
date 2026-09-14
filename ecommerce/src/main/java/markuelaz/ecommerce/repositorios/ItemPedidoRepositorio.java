package markuelaz.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import markuelaz.ecommerce.entidades.ItemPedido;

public interface ItemPedidoRepositorio extends JpaRepository<ItemPedido, Integer> {

}