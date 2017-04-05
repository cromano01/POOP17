
import java.io.*;
import java.util.*;

//Clase Fecha Java
public class Fecha {

    private int Dia;
    private String Mes;
    private int Anio;
    private int MesInt;
    private int NMes;
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //Constructor por defecto
    public Fecha() {
    }

    //Constructor con parámetros
    public Fecha(int dia_p, String mes_p, int anio_p) {
        this.Dia = dia_p;
        this.Mes = mes_p;
        this.Anio = anio_p;
    }

    public Fecha(int dia_p, String mes_p) {
        this.Dia = dia_p;
        this.Mes = mes_p;
    }

    public Fecha(int dia_p) {
        this.Dia = dia_p;

    }

    //Establecer y obtener
    public void EstablecerDia(int dia_p) {
        Dia = dia_p;
    }

    public void EstablecerMes(String mes_p) {
        Mes = mes_p;
    }
    
    public void EstablecerMesInt(int mes_p) {
        MesInt = mes_p;
    }

    public void EstablecerAnio(int anio_p) {
        Anio = anio_p;
    }

    public int ObtenerDia() {
        return Dia;
    }

    public String ObtenerMes() {
        return Mes;
    }
    public int ObtenerMesInt() {
        return MesInt;
    }

    public int ObtenerAnio() {
        return Anio;
    }

// método ObtenerFecha
    public String ObtenerFecha() {
        return Dia + " - " + (Mes) + " - " + Anio;
    }

    //método de fecha incorrecta
    public String MalaFecha() {
        return "Esa fecha no existe";
    }

    //método para la verificacion de fecha correcta
    public boolean fechaCorrecta() {
        boolean DiaCorrecto, MesCorrecto, AnioCorrecto;
        AnioCorrecto = Anio >= 1582;
        MesCorrecto = validaMes(Mes);
        switch (NMes) {
            case 2:
                if (MesBisiesto()) {
                    DiaCorrecto = Dia >= 1 && Dia <= 29;
                } else {
                    DiaCorrecto = Dia >= 1 && Dia <= 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                DiaCorrecto = Dia >= 1 && Dia <= 30;
                break;
            default:
                DiaCorrecto = Dia >= 1 && Dia <= 31;
        }
        return DiaCorrecto && MesCorrecto && AnioCorrecto;
    }

    //Método privado para comprobar si el anio es bisiesto
    //Este método lo utiliza el método fechaCorrecta
    private boolean MesBisiesto() {
        return (Anio % 4 == 0 && Anio % 100 != 0 || Anio % 400 == 0);
    }

    //Método toString para mostrar la fecha
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (Dia < 10) {
            sb.append("0");
        }
        sb.append(Dia);
        sb.append("-");
        if (Integer.parseInt(Mes) < 10) {
            sb.append("0");
        }
        sb.append(Mes);
        sb.append("-");
        sb.append(Anio);
        return sb.toString();
    }

    private boolean isNumeric(String Mes) {
        try {
            Integer.parseInt(Mes);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

//mes en letras
    public boolean validaMes(String m) {
        int numes=0;
        if (isNumeric(m)) {
            numes = Integer.parseInt(m);
        } else {
            switch (m.toUpperCase()) {
                case "ENERO":
                    numes = 1;
                    break;
                case "FEBRERO":
                    numes = 2;
                    break;
                case "MARZO":
                    numes = 3;
                    break;
                case "ABRIL":
                    numes = 4;
                    break;
                case "MAYO":
                    numes = 5;
                    break;
                case "JUNIO":
                    numes = 6;
                    break;
                case "JULIO":
                    numes = 7;
                    break;
                case "AGOSTO":
                    numes = 8;
                    break;
                case "SEPTIEMBRE":
                    numes = 9;
                    break;
                case "OCTUBRE":
                    numes = 10;
                    break;
                case "NOVIEMBRE":
                    numes = 11;
                    break;
                case "DICIEMBRE":
                    numes = 12;
                    break;

                default:

                    System.out.println("Ese mes no existe");

            }
        }return numes >= 1 && numes <= 12;
    
    } 

        public void asignarFechaCalendario() {
        Calendar fechaSistema = Calendar.getInstance();
        EstablecerDia(fechaSistema.get(Calendar.DAY_OF_MONTH));
        EstablecerMesInt(fechaSistema.get(Calendar.MONTH));
        EstablecerAnio(fechaSistema.get(Calendar.YEAR));
    }

        public String leeString() {
        try{
            this.dato = br.readLine();
        } catch(IOException e) {
        }

        return this.dato;
    }

    public float leeFloat() {
        try{
            return Float.valueOf(br.readLine());
        } catch(IOException e) {
        }

        return 0.0F;
    }

    public int leeInt() {
        try{
            return Integer.valueOf(br.readLine());
        } catch(IOException e) {
        }

        return 0;
    }
}
}
 //Termina clase Fecha

    /*
case "Febrero":
Mes = 2;
break;
case "Marzo":
Mes = 3;
break;
case "Abril":
Mes = 4;
break;
case "Mayo":
Mes = 5;
break;
case "Junio":
Mes = 6;
break;
case "Julio":
Mes = 7;
break;
case "Agosto":
Mes = 8;
break;
case "Septiembre":
Mes = 9;
break;
case "Octubre":
Mes = 10;
break;
case "Noviembre":
Mes = 11;
break;
case Diciembre:
Mes = 12;
break;

     */
