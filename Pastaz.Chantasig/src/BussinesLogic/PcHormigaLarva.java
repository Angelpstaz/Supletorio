package BussinesLogic;
public class PcHormigaLarva extends PcHormiga implements ChIHormigaLava {
    
    public PcHormigaLarva(String chestado) {
        super(chestado);
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
