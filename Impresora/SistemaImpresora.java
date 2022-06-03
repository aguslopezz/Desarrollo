import javax.jws.Oneway;

public class SistemaImpresora {

    private Impresora impresora = new Impresora();

    public void crearImpresion(int idImpresion, String extensionArchivo, String directorioArchivo){
        Impresion impresion = new Impresion(idImpresion, extensionArchivo, directorioArchivo);
        impresora.agregarImpresionALacola(impresion);
    }



    public static void main (String[]argv){





    }

}
