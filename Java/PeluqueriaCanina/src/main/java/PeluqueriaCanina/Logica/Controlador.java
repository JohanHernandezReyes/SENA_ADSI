
package PeluqueriaCanina.Logica;

import PeluqueriaCanina.Persistencia.ControladorBD;
import java.util.List;

public class Controlador {
    
    ControladorBD ControlPersistence = new ControladorBD();
    
    public void guardar(String nombre_perro, String raza, String color, String observaciones, Boolean Alergico, Boolean Atencion_especial,String nombre_duenio, String celular){        
       Duenio duenio = new Duenio();
       duenio.setNombre(nombre_duenio);
       duenio.setCelular(celular);
       
       Mascota perro = new Mascota();
       perro.setNombre_perro(nombre_perro);
       perro.setRaza(raza);
       perro.setColor(color);
       perro.setObservaciones(observaciones);
       perro.setAlergico(Alergico);
       perro.setAtencion_especial(Atencion_especial);
       perro.setIdduenio(duenio);
               
       ControlPersistence.guardar(duenio, perro);
    } 

    public List <Mascota> vermascotas() {
        return ControlPersistence.vermascotas();
    }

    public void borrarmascota(int id) {
       ControlPersistence.eliminar(id);
    }

    public Mascota buscarmascota(int id) {
       return ControlPersistence.buscar(id);
    }

    public void actualizar(Mascota M, String nombre_perro, String raza, String color, String observaciones, boolean Alergico, boolean Atencion_especial, String nombre_duenio, String celular) {
        M.setNombre_perro(nombre_perro);
        M.setColor(color);
        M.setRaza(raza);
        M.setObservaciones(observaciones);
        M.setAlergico(Alergico);
        M.setAtencion_especial(Atencion_especial);
        ControlPersistence.actualizar(M);
        
        Duenio D = this.buscarduenio(M.getIdduenio().getIdduenio());
        D.setNombre(nombre_duenio);
        D.setCelular(celular);
        this.modificarduenio(D);
    }

    private Duenio buscarduenio(int idduenio) {
        return ControlPersistence.buscarduenio(idduenio);
    }

    private void modificarduenio(Duenio D) {
        ControlPersistence.modificarduenio(D);
    }

   
    
}
