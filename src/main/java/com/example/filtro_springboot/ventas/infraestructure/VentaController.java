package com.example.filtro_springboot.ventas.infraestructure;

import java.util.List;
import java.util.Optional;

import com.example.filtro_springboot.ventas.domain.entity.Venta;
import com.example.filtro_springboot.ventas.domain.service.VentaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping(path = "api/v1/venta")
public class VentaController {
    
    @Autowired
    private VentaService ventaService;

    @GetMapping
    public List<Venta> getAll(){
        return ventaService.getVentas();
    }

    @PostMapping
    public void saveUpdate(@RequestBody Venta venta) {
        ventaService.saveOrUpdate(venta);
    }

    @DeleteMapping("/{ventaId}")
    public void delete(@PathVariable("ventaId") Long ventaId) {
        ventaService.delete(ventaId);
    }
    
    @GetMapping("/{ventaId}")
    public Optional<Venta> getById(@PathVariable("ventaId") Long ventaId) {
        return ventaService.getVenta(ventaId);
    }
}
