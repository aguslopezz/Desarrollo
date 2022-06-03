public class Impresion {

    private int idImpresion;
    private String extensionArchivo;
    private String directorioArchivo;


    public Impresion(int idImpresion, String extensionArchivo, String directorioArchivo) {
        this.idImpresion = idImpresion;
        this.extensionArchivo = extensionArchivo;
        this.directorioArchivo = directorioArchivo;
    }

    public int getIdImpresion() {
        return idImpresion;
    }

    public void setIdImpresion(int idImpresion) {
        this.idImpresion = idImpresion;
    }

    public String getExtensionArchivo() {
        return extensionArchivo;
    }

    public void setExtensionArchivo(String extensionArchivo) {
        this.extensionArchivo = extensionArchivo;
    }

    public String getDirectorioArchivo() {
        return directorioArchivo;
    }

    public void setDirectorioArchivo(String directorioArchivo) {
        this.directorioArchivo = directorioArchivo;
    }
}
