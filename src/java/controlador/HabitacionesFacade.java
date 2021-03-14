/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Habitaciones;

/**
 *
 * @author HAZE
 */
@Stateless
public class HabitacionesFacade extends AbstractFacade<Habitaciones> {

    @PersistenceContext(unitName = "proyect_intPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HabitacionesFacade() {
        super(Habitaciones.class);
    }
    
}
