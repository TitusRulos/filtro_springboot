package com.example.filtro_springboot.ventas.application;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.filtro_springboot.ventas.domain.entity.Venta;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Long>{   
}
