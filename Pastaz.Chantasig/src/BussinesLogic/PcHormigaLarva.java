package BussinesLogic;
public class PcHormigaLarva extends PcHormiga implements ChIHormigaLava{
    
    private PcCh_Alimento pcCh_Alimento;

    public PcHormigaLarva(String chEstado) {
        super(chEstado);
    }

    public PcHormigaLarva(PcCh_Alimento pcAlimento){
        super(pcAlimento);
        
    }
    public PcHormigaLarva(PcCh_Alimento pcAlimento){
        super(pcAlimento);
    }

    @Override
    public String toString() {
        return getClass().getName();
    }

    @Override
    public PcHormiga ChRealizarMetamorfosis(PcCh_Alimento alimento) {
        throw new UnsupportedOperationException("Unimplemented method 'ChRealizarMetamorfosis'");
    }

}

