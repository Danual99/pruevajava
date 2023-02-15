import modelos.*;
import utilidades.UtilidadesFactura;

import java.time.LocalDate;
import java.util.List;

public class pruebaV1 {

    public static void main(String[] args) {

        //Variable tipo almacen

        Almacen almacen1 = new Almacen(1, "PaquitaSala", 40000);

        System.out.println(almacen1);

        Cliente cliente1 = new Cliente(1, "30276778J", "Juan", "Rico", "C_Pineda", TipoCliente.PARTICULAR);

        System.out.println(cliente1);

        Producto producto1 = new Producto(1, "ABC45", "Judias Rojas", LocalDate.of(1999,04,30), TipoProducto.Alimentacion, almacen1, 5.66);

        System.out.println(producto1);



    }




}
