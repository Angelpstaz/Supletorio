package BussinesLogic;

public abstract class PcCh_Alimento implements PcCh_IAlimentoRadioactivo{
    private String PcCh_escalaRadiacion;

    public PcCh_Alimento(String pcCh_escalaRadiacion) {
        this.PcCh_escalaRadiacion = pcCh_escalaRadiacion;
    }

    public String getPcCh_escalaRadiacion() {
        return PcCh_escalaRadiacion;
    }

    public void setPcCh_escalaRadiacion(String pcCh_escalaRadiacion) {
        PcCh_escalaRadiacion = pcCh_escalaRadiacion;
    }
    public String pcObtenerTipoAlimento(){
        return  "";
    }
    
}
