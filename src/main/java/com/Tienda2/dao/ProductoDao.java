package com.Tienda2.dao;

import com.Tienda2.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository <Producto,Long> {
    
}
