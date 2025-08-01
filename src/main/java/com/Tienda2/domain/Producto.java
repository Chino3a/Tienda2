package com.Tienda2.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;
import com.Tienda2.domain.Categoria;

@Data
@Entity
@Table(name="producto")
public class Producto implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name="id_producto")
    private Long idProducto;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    private String detalle;
    private int existencias;
    private double precio;

    @ManyToOne
    @JoinColumn(name="id_categoria")
    Categoria categoria;
    
    public Producto() {
    }

    public Producto(String producto, boolean activo) {
        this.descripcion = producto;
        this.activo = activo;
    }
}
