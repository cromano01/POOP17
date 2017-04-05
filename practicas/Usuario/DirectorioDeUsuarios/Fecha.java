


public class Fecha{
	
	private int dia;
	private int mes;
	private int anio;

// contructor, que por buena practica van inmediatamante despues de las variable de clase

    public Fecha() {

    }

	public Fecha(int dia_p, int mes_p, int anio_p) {
		this.dia = dia_p;
		this.mes = mes_p;
		this.anio = anio_p;
	}

 //set y get
    public void asignarDia(int dia_p) {
        this.dia = dia_p;
    }


    public void asignarMes(int mes_p) {
        this.mes = mes_p;
    }

    public void asignarAnio(int anio_p) {
        this.anio = anio_p;
    }

    public int obtenerDia() {
        return dia;
    }

    public int obtenerMes() {
        return mes;
    }
    public int obtenerAnio() {
        return anio;
    }

	public void asignarFecha(int dia_param, int mes_param, int anio_param) {
		this.dia = dia_param;
		this.mes = mes_param;
		this.anio = anio_param;
	}

	public String toString(){
		return ""+dia+"/"+mes+"/"+anio+"";
	}
}