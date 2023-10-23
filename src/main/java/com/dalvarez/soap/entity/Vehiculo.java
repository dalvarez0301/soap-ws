package com.dalvarez.soap.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "vehiculos")
@Entity
public class Vehiculo {
    
    @Id
    private String veh_placa;
    private int veh_modelo;
    private long veh_precio;
    private String veh_marca;

    public Vehiculo() {
    }

    public Vehiculo(String veh_placa, int veh_modelo, long veh_precio, String veh_marca) {
        this.veh_placa = veh_placa;
        this.veh_modelo = veh_modelo;
        this.veh_precio = veh_precio;
        this.veh_marca = veh_marca;
    }

    public String getVeh_placa() {
        return veh_placa;
    }

    public void setVeh_placa(String veh_placa) {
        this.veh_placa = veh_placa;
    }

    public int getVeh_modelo() {
        return veh_modelo;
    }

    public void setVeh_modelo(int veh_modelo) {
        this.veh_modelo = veh_modelo;
    }

    public long getVeh_precio() {
        return veh_precio;
    }

    public void setVeh_precio(long veh_precio) {
        this.veh_precio = veh_precio;
    }

    public String getVeh_marca() {
        return veh_marca;
    }

    public void setVeh_marca(String veh_marca) {
        this.veh_marca = veh_marca;
    }

    
    
}