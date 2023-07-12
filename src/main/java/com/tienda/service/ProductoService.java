package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;

public interface ProductoService {

    //metodo para consultar los productos.El parametro define si se muestran solo los activos o todos
    public List<Producto> getProductos(boolean activos);

    //Se obtiene una categoría por su id
    public Producto getProducto(Producto producto);

    //Insertar: se inserta cuando el idCategora está vacio (valor 0 o null)
    //Modificar: Se modifica cuando el idProducto NO está vacío
    public void save(Producto producto);

    //Se elimina un registro por su IdProducto
    public void delete(Producto producto);

    // Lista de productos con precio entre ordendados por descripción ConsultaAmpliada
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);

    //Lista de productos utilizando consultas con JPQL    
    public List<Producto> metodoJPQL(double precioInf, double precioSup);
    
    
 //Lista de productos utilizando consultas con SQL Nativo
    public List<Producto> metodoNativo(double precioInf, double precioSup);

}
