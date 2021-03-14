/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Hotel;

/**
 *
 * @author HAZE
 */
@Stateless
public class HotelFacade extends AbstractFacade<Hotel> {

    @PersistenceContext(unitName = "proyect_intPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HotelFacade() {
        super(Hotel.class);
    }
    
}
