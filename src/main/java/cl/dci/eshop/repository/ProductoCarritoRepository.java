package cl.dci.eshop.repository;

import cl.dci.eshop.model.Carrito;
import cl.dci.eshop.model.Producto;
import cl.dci.eshop.model.ProductoCarrito;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoCarritoRepository extends JpaRepository<ProductoCarrito, Integer> {
    //Optional<ProductoCarrito> findByProducto(Producto producto);
    //Optional<ProductoCarrito> findByCarrito(Carrito carrito);
    List<ProductoCarrito> findByCarrito(Carrito carrito);
    List<ProductoCarrito> findByProducto(Producto producto);
}
