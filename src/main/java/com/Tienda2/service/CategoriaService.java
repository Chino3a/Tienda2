package com.Tienda2.service;

import com.Tienda2.domain.Categoria; 
import java.util.List; 

public interface CategoriaService {
    //asigna el metodo para despues implementarlo en el serviceImpl (Read)
    public List<Categoria> getCategorias(boolean activos);
    
    public Categoria getCategoria (Categoria categoria);
    
    public void save (Categoria categoria);
    
    public void delete (Categoria categoria);
}
 
    
 