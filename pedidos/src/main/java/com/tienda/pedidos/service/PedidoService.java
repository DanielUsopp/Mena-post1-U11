package com.tienda.pedidos.service;

import com.tienda.pedidos.dto.PedidoRequestDTO;
import com.tienda.pedidos.dto.PedidoResponseDTO;

import java.util.List;

// Interfaz — abstraccion que cumple DIP: el controller depende de esto,
// no de PedidoServiceImpl
public interface PedidoService {
    PedidoResponseDTO crear(PedidoRequestDTO dto);
    PedidoResponseDTO buscarPorId(Long id);
    List<PedidoResponseDTO> listarPorCliente(String clienteEmail);
}
