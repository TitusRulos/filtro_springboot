package com.example.filtro_springboot.detalles_ventas.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.filtro_springboot.detalles_ventas.application.DetallesVentaRepository;
import com.example.filtro_springboot.detalles_ventas.domain.entity.DetallesVenta;

@Service
public class DetallesVentaService {

    @Autowired
    DetallesVentaRepository detallesVentaRepository;

    public List<DetallesVenta> getDetallesVentas(){
        return detallesVentaRepository.findAll();
    }

    public Optional<DetallesVenta> getDetallesVenta(Long id){
        return detallesVentaRepository.findById(id);
    }

    public void saveOrUpdate(DetallesVenta detallesVenta){
        detallesVentaRepository.save(detallesVenta);
    }

    public void delete(Long id){
        detallesVentaRepository.deleteById(id);
    } 
}
