    
package PeluqueriaCanina.Persistencia;

import PeluqueriaCanina.Logica.Duenio;
import PeluqueriaCanina.Logica.Mascota;
import PeluqueriaCanina.Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorBD {
    
    DuenioJpaController DuenioJPA = new DuenioJpaController();
    MascotaJpaController MascotaJPA = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota perro) {
       DuenioJPA.create(duenio);
       MascotaJPA.create(perro);
    }

    public List<Mascota> vermascotas() {
       return MascotaJPA.findMascotaEntities();
    }

    public void eliminar(int num_cliente) {
        try {
            MascotaJPA.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascota buscar(int id) {
        return MascotaJPA.findMascota(id);
    }

    public void actualizar(Mascota M) {
        try {
            MascotaJPA.edit(M);
        } catch (Exception ex) {
            Logger.getLogger(ControladorBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Duenio buscarduenio(int idduenio) {
        return DuenioJPA.findDuenio(idduenio);
    }

    public void modificarduenio(Duenio D) {
        try {
            DuenioJPA.edit(D);
        } catch (Exception ex) {
            Logger.getLogger(ControladorBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
