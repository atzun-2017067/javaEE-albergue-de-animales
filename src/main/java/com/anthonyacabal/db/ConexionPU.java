package com.anthonyacabal.db;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Anthony Acabal
 */
public class ConexionPU {
    private static final String PERSISTENCE_UNIT_NAME = "animal_love_pu";
    private EntityManager entityManager;
    private static ConexionPU instance;
    
    private ConexionPU() {
        try {
            entityManager = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
            System.out.println("Conexion establecida a través de una unidad de persistencia.");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
    
    public static ConexionPU getInstance() {
        if (instance == null) {
            instance = new ConexionPU();
        }
        return instance;
    }
    
    public EntityManager getEntityManager() {
        return entityManager;
    }
}