import java.util.ArrayList;

public class SuperAdmin {

    private Usuario usuario;
    private SuperAdmin superAdmin = null;

    //Usamos un Singleton ya que solo debe haber un superAdmin
    private SuperAdmin(Usuario usuario) {
        this.usuario = usuario;
    }

    public SuperAdmin newSuperAdmin(Usuario usuario) {

        if(superAdmin == null) {
            superAdmin = new SuperAdmin(usuario);
        }
        else {
            System.out.println("Ya existe un superAdmin");
        }

        return superAdmin;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


}
