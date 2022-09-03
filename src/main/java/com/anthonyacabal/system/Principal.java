package com.anthonyacabal.system;

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
        System.out.println(pDao.getAll());
        System.out.println(sDao.getAll());
    }
}