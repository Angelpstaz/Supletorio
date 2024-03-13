package BussinesLogic;

public class PcCh_AlimentoInsectivoro extends PcCh_Alimento {

    public PcCh_AlimentoInsectivoro(String pcCh_escalaRadiacion) {
        super(pcCh_escalaRadiacion);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void pcchSetIrradiar(int porcentajeIrradiacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pcchSetIrradiar'");
    }

  

    @Override
    public String toString() {
        return getClass().getCanonicalName();
    }

}
