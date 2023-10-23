package com.dalvarez.soap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dalvarez.soap.entity.Vehiculo;

// import jakarta.persistence.Tuple;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, String>{

    @Query("SELECT vs.veh_marca FROM Vehiculo vs WHERE vs.veh_placa = ?1 ")
    String valor(String placa);


    
}