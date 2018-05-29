package org.lya.sesion06;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MatrizEnterosCuadradaTestJUnit4 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testOrdenacionPorFilas() {
		int [][] matriz = {{35, 7, 20, 3, 12, 91, 69}, {26, 17, 28, 43, 5, 83, 67},
				{16, 77, 33, 10, 37, 8, 1}, {13, 27, 36, 48, 54, 9, 4},
				{25, 6, 11, 70, 81, 95, 50}, {2, 88, 14, 15, 21, 19, 29}};
		
        MatrizEnterosCuadrada mat = new MatrizEnterosCuadrada(matriz);
        
		String salidaMatriz = mat.muestraMatriz();
		String salidaEsperadaMatriz = "Matriz:" + "\n"
				+ "35	7	20	3	12	91	69" + "\n"
				+ "26	17	28	43	5	83	67" + "\n"
				+ "16	77	33	10	37	8	1" + "\n"
				+ "13	27	36	48	54	9	4" + "\n"
				+ "25	6	11	70	81	95	50" + "\n"
				+ "2	88	14	15	21	19	29";
		assertEquals(salidaMatriz, salidaEsperadaMatriz);

		
		
		mat.matrizOrdenadaPorFilas();
		salidaMatriz = mat.muestraMatriz();
		salidaEsperadaMatriz = "Matriz:" + "\n"
				+ "3	7	12	20	35	69	91" + "\n"
				+ "5	17	26	28	43	67	83" + "\n"
				+ "1	8	10	16	33	37	77" + "\n"
				+ "4	9	13	27	36	48	54" + "\n"
				+ "6	11	25	50	70	81	95" + "\n"
				+ "2	14	15	19	21	29	88";
		assertEquals(salidaMatriz, salidaEsperadaMatriz);

		

	}
}
