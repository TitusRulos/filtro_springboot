package com.example.filtro_springboot.detalles_ventas.infraestructure;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.filtro_springboot.detalles_ventas.domain.entity.DetallesVenta;
import com.example.filtro_springboot.detalles_ventas.domain.service.DetallesVentaService;

@RestController
@RequestMapping(path = "api/v1/detalles_venta")
public class DetallesVentaController {
    @Autowired
    private DetallesVentaService detallesVentaService;

    @GetMapping
    public List<DetallesVenta> getAll(){
        return detallesVentaService.getDetallesVentas();
    }

    @PostMapping
    public void saveUpdate(@RequestBody DetallesVenta detallesVenta) {
        detallesVentaService.saveOrUpdate(detallesVenta);
    }

    @DeleteMapping("/{detallesVentaId}")
    public void delete(@PathVariable("detallesVentaId") Long detallesVentaId) {
        detallesVentaService.delete(detallesVentaId);
    }
    
    @GetMapping("/{detallesVentaId}")
    public Optional<DetallesVenta> getById(@PathVariable("detallesVentaId") Long detallesVentaId) {
        return detallesVentaService.getDetallesVenta(detallesVentaId);
    }
}
