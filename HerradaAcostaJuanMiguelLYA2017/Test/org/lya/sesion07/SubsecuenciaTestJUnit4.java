package org.lya.sesion07;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SubsecuenciaTestJUnit4 {
	private Subsecuencia secuenciaProblema;


	@Before
	

	@Test
       public void testSubsecuenciaNormal() {

        int[] datos = { 1, 2, 3, 0, 0, 0, -1, 0 };

        secuenciaProblema = new Subsecuencia(datos);

        secuenciaProblema.SubsecuenciaFuerzaBruta();
        assertTrue(secuenciaProblema.getSuma() == 6);
        assertTrue(secuenciaProblema.getPrimer() == 0);
        assertTrue(secuenciaProblema.getUltimo() == 2);

        secuenciaProblema.SubsecuenciaMejorado();
        assertTrue(secuenciaProblema.getSuma() == 6);
        assertTrue(secuenciaProblema.getPrimer() == 0);
        assertTrue(secuenciaProblema.getUltimo() == 2);

        secuenciaProblema.SubsecuenciaLineal();
        assertTrue(secuenciaProblema.getSuma() == 6);
        assertTrue(secuenciaProblema.getPrimer() == 0);
        assertTrue(secuenciaProblema.getUltimo() == 2);

    }

	@Test
    public void testSubsecuenciaCero() {

        int[] datos = { 0, 0, 0, 0, 0, 0, 0, 0 };

        secuenciaProblema = new Subsecuencia(datos);

        secuenciaProblema.SubsecuenciaFuerzaBruta();
        assertTrue(secuenciaProblema.getSuma() == 0);
        assertTrue(secuenciaProblema.getPrimer() == 0);
        assertTrue(secuenciaProblema.getUltimo() == 0);

        secuenciaProblema.SubsecuenciaMejorado();
        assertTrue(secuenciaProblema.getSuma() == 0);
        assertTrue(secuenciaProblema.getPrimer() == 0);
        assertTrue(secuenciaProblema.getUltimo() == 0);

        secuenciaProblema.SubsecuenciaLineal();
        assertTrue(secuenciaProblema.getSuma() == 0);
        assertTrue(secuenciaProblema.getPrimer() == 0);
        assertTrue(secuenciaProblema.getUltimo() == 0);

    }

	@Test
    public void testSubsecuenciaNegativos() {

        int[] datos = { -1, -2, -3, -4, -5, -6, -7, -8 };

        secuenciaProblema = new Subsecuencia(datos);

        secuenciaProblema.SubsecuenciaFuerzaBruta();
        assertTrue(secuenciaProblema.getSuma() == 0);
        assertTrue(secuenciaProblema.getPrimer() == 0);
        assertTrue(secuenciaProblema.getUltimo() == 0);
        
        secuenciaProblema.SubsecuenciaMejorado();
        assertTrue(secuenciaProblema.getSuma() == 0);
        assertTrue(secuenciaProblema.getPrimer() == 0);
        assertTrue(secuenciaProblema.getUltimo() == 0);
        
        secuenciaProblema.SubsecuenciaLineal();
        assertTrue(secuenciaProblema.getSuma() == 0);
        assertTrue(secuenciaProblema.getPrimer() == 0);
        assertTrue(secuenciaProblema.getUltimo() == 0);
    }

	@Test
    public void testSubsecuenciaIguales() {

        int[] datos = { 1, 1, 1, 1, 1, 1, 1, 1 };

        secuenciaProblema = new Subsecuencia(datos);

        secuenciaProblema.SubsecuenciaFuerzaBruta();
        assertTrue(secuenciaProblema.getSuma() == 8);
        assertTrue(secuenciaProblema.getPrimer() == 0);
        assertTrue(secuenciaProblema.getUltimo() == 7);

        secuenciaProblema.SubsecuenciaMejorado();
        assertTrue(secuenciaProblema.getSuma() == 8);
        assertTrue(secuenciaProblema.getPrimer() == 0);
        assertTrue(secuenciaProblema.getUltimo() == 7);

        secuenciaProblema.SubsecuenciaLineal();
        assertTrue(secuenciaProblema.getSuma() == 8);
        assertTrue(secuenciaProblema.getPrimer() == 0);
        assertTrue(secuenciaProblema.getUltimo() == 7);

    }

	
}
