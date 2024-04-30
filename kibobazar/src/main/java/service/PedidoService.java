package service;

import java.util.List;
import entity.Pedido;

public interface PedidoService {
    Pedido getPedidoById(Long id);
    Pedido getPedidoByCorreo(String email);
    Pedido createPedido(Pedido pedido);
    List<Pedido> getAllActivePedido();
    List<Pedido> getAllInactivePedido();
    Pedido updatePedido(Pedido pedido, Long id);
    void deletePedido(Long id);
}