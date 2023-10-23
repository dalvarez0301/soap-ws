package com.dalvarez.soap.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.dalvarez.soap.entity.Vehiculo;
import com.dalvarez.soap.repository.VehiculoRepository;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@Service
@WebService(serviceName = "vehiculos")
public class VehiculoServices {

    @Autowired
    private VehiculoRepository vehiculoRepository;


    // // OBTENER TODOS LOS VEHICULOS DE LA BD
    @CrossOrigin(origins = "*")
    @WebMethod(operationName = "obtenerVehiculos")
    public List<Vehiculo> consultarVehiculos() {
        return vehiculoRepository.findAll();
    }

    // OBTENER UN VEHICULO POR PLACA
    @CrossOrigin(origins = "*")
    @WebMethod(operationName = "obtenerVehiculoPorPlaca")
    public Vehiculo consultarVehiculoPorPlaca(String placa) {

        return vehiculoRepository.findById(placa).get();

    }
}