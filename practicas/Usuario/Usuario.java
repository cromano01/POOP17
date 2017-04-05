


//inicio de la clase Usuario
public class Usuario{
	
//atributos o variables de clase
private String nombre;
private int telefono;
private String direccion;
private String email;
private String nickname;
private Fecha fechaDeNacimiento;
private String contrasenia;

//private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//constructores
public Usuario(){}

public Usuario(String nombre, String nickname, String direccion, int telefono, Fecha fechaDeNacimiento){
	this.nombre = nombre;
	this.nickname = nickname;
	this.direccion = direccion;
	this.telefono = telefono;
	this.fechaDeNacimiento = fechaDeNacimiento;

}

public Usuario(String nombre, String nickname){
    this.nombre = nombre;
    this.nickname = nickname;
}

public Usuario(String nombre, int telefono, Fecha fechaDeNacimiento){
    this.nombre = nombre;
    this.telefono = telefono;
    this.fechaDeNacimiento = fechaDeNacimiento;

}
/*
public Usuario(String nombre, ){
this.nombre = nombre;
this.telefono = telefono;
this.direccion = direccion;
this.nickname = nickname;
this.fechaDeNacimiento = fechaDeNacimiento;
this.contrasenia = contrasenia;


}


public Usuario(){
this.nickname = nickname;
}

*/

//métodos set=asignar, get=obtener y otros
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

    public void asignarEmail(String mail) {
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
   
   /*
   public boolean validarNickname(){
    if()

   }
   

   public boolean validarLogin(String nickname, String password){
    if(nickname==true && password==true)
        return true;
   } 

   public String validarPassword(){


   }

   public void registroDeUsuario(){
System.out.println("Ingresa tu primer nombre");

}
*/

public String toString(){

    return ("\nTu eres: "+nombre+" \n\nEligiste el nickname: "+nickname+"\n\n")+
 ("Y tus datos son: \n\n")+("Teléfono: "+telefono) +("\n\nDirección:  "+direccion)+("\n\nFecha de nacimiento es: "+fechaDeNacimiento);


}

}//fin de la clase