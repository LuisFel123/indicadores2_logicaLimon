/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatos;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import modelo.Medida;
import modelo.Persona;

/**
 *
 * @author felip
 */
@Stateless
public class MedidaFacade extends AbstractFacade<Medida> {

    @PersistenceContext(unitName = "indicadores02-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MedidaFacade() {
        super(Medida.class);
    }

    public List<Medida> medidas(Persona p) {
        System.out.println("El id de la persona desde MedidaFacade: " + p.getIdPersona());
        List<Medida> medidas = null;
        int entero= p.getIdPersona();
        try {
            Query consultamp = em.createNamedQuery("Medida.findByIdpersona");
            consultamp.setParameter("idPersona", entero);
            medidas = (List<Medida>) consultamp.getResultList();
            for (Medida medida : medidas) {
                System.out.println(medida);
            }
        } catch (Exception ex) {
            System.out.println("error en la consulta");
            System.err.print(ex);
            return null;
        }
        return medidas;
    }

}
