package BussinesLogic;

public class PcCh_AlimentoOmnivoro extends PcCh_Alimento {

    public PcCh_AlimentoOmnivoro(String pcCh_escalaRadiacion) {
        super(pcCh_escalaRadiacion);
    }

    @Override
    public void pcchSetIrradiar(int porcentajeIrradiacion) {
        throw new UnsupportedOperationException("Unimplemented method 'pcchSetIrradiar'");
    }

  

    @Override
    public String toString() {
        return getClass().getName();
    }

    @Override
    public String pcObtenerTipoAlimento(){
        return  "Omnivoro";
    }
}
