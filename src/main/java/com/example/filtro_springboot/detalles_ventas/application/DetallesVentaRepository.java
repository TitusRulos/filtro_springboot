package com.example.filtro_springboot.detalles_ventas.application;

import com.example.filtro_springboot.detalles_ventas.domain.entity.DetallesVenta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetallesVentaRepository extends JpaRepository<DetallesVenta, Long>{
    
}
