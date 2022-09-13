package com.anthonyacabal.system;

import com.anthonyacabal.models.dao.EmpleadoDaoImpl;
import com.anthonyacabal.models.dao.PersonaDaoImpl;
import com.anthonyacabal.models.dao.SalonDaoImpl;

/**
 *
 * @author informatica
 */

public class Principal {
    public static void main(String[] args) {
        PersonaDaoImpl pDao = new PersonaDaoImpl();
        SalonDaoImpl sDao = new SalonDaoImpl();
        EmpleadoDaoImpl eDao = new EmpleadoDaoImpl();
        System.out.println(pDao.getAll());
        System.out.println(sDao.getAll());
        System.out.println(eDao.getAll());
    }
}