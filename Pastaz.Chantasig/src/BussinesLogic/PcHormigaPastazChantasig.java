package BussinesLogic;
public class PcHormigaPastazChantasig implements ChIHormigaCarnivoro,ChIHormigaHervivoro,ChIHormigaInsectivoro  {

    @Override
    public String toString() {
        return getClass().getName();
    }

    @Override
    public void comer(PcCh_AlimentoCarnivoro alimento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comer'");
    }

    @Override
    public void comer(PcCh_AlimentoHervivoro alimento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comer'");
    }

    @Override
    public void comer(PcCh_AlimentoInsectivoro alimento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comer'");
    }
}