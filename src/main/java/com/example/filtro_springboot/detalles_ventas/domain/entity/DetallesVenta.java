package com.example.filtro_springboot.detalles_ventas.domain.entity;

import java.math.BigDecimal;

import com.example.filtro_springboot.bicicletas.domain.entity.Bicicleta;
import com.example.filtro_springboot.ventas.domain.entity.Venta;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "detalles_venta")
public class DetallesVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "venta_id", nullable = false)
    private Venta venta;

    @ManyToOne
    @JoinColumn(name = "bicicleta_id", nullable = false)
    private Bicicleta bicicleta;

    @Column(nullable = false)
    private Integer cantidad;

    @Column(nullable = false,precision = 10, scale = 2)
    private BigDecimal precioUnitario;
}
