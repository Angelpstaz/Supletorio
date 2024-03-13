package BussinesLogic;
public class PcHormigaRastreadora extends PcHormiga {

    public PcHormigaRastreadora(String chestado) {
        super(chestado);
    }

    @Override
    public String toString() {
        return getClass().getName();
    }
}
