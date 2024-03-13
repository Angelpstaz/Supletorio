package BussinesLogic;

public class PcCh_AlimentoHervivoro extends PcCh_Alimento {

    public PcCh_AlimentoHervivoro(String pcCh_escalaRadiacion) {
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
