package Controlador;

import Vistas.EskerrikAskoLeihoa;

public class Contador extends Thread {

	
	@Override
    public void run(){
		EskerrikAskoLeihoa ventana4= new EskerrikAskoLeihoa();
		ventana4.setVisible(true);
    	for (int i=0;i<=5;i++) {
        	try {
				Thread.sleep(1000);

			}catch(InterruptedException e){
				e.printStackTrace();
			}	
    	}
    	ventana4.dispose();
    	Metodoak.lehenengoLeihoa();
    }
    	
	
}