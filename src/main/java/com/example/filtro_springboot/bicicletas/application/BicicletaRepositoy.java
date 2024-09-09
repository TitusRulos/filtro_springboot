package com.example.filtro_springboot.bicicletas.application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.filtro_springboot.bicicletas.domain.entity.Bicicleta;


@Repository
public interface BicicletaRepositoy extends JpaRepository<Bicicleta, Long>{
}
