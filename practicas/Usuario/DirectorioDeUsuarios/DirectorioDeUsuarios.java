

public class DirectorioDeUsuarios{

private String nombre;
private int telefono;
private String direccion;
private String email;
private String nickname;
private Fecha fechaDeNacimiento;
private String contrasenia;
private int id;

    public DirectorioDeUsuarios() {

    }


    public DirectorioDeUsuarios(String nombre, int telefono, String direccion, String email, String nickname, String contrasenia, int id) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.nickname = nickname;
        this.contrasenia = contrasenia;
        this.id = id;
    }


    public String obtenerNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public int obtenerTelefono() {
        return telefono;
    }

    public void asignarTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public void asignarDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String obtenerEmail() {
        return email;
    }

    public void asignarEmail(String email) {
        this.email = email;
    }

    public String obtenerNickname() {
        return nickname;
    }

    public void asignarNickname(String nickname) {
        this.nickname = nickname;
    }

    public Fecha obtenerFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void asignarFechaDeNacimiento(Fecha fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String obtenerContrasenia() {
        return contrasenia;
    }

    public void asignarContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int obtenerId() {
        return id;
    }

    public void asignarId(int id) {
        this.id = id;
    }


public String toString(){

    return ("\nTu eres: "+nombre+" \n\nEligiste el nickname: "+nickname+"\n\n")+
 ("Y tus datos son: \n\n")+("Teléfono: "+telefono) +("\n\nDirección:  "+direccion)+("\n\nFecha de nacimiento es: "+fechaDeNacimiento);


}

	
//private Usuario[] listaDeUsuarios = new Usuario[2];





}