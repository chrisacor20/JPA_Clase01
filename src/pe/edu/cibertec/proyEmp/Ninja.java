package pe.edu.cibertec.proyEmp;

public class Ninja {
	
	Arma arma ;
	
	public void ataca(Enemigo enemigo){
		arma.ataca(enemigo);
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}
 
	
}
