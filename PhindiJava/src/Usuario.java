public class Usuario {

    private String mail;
    private String nombreUsuario;
    private String contraseña;

    public Usuario(String mail, String nombreUsuario, String contraseña) {
        this.mail = mail;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
