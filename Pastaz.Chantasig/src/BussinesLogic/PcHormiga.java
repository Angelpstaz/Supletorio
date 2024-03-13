package BussinesLogic;
public abstract class PcHormiga {
 private String chestado="VIVA";
private PcCh_Alimento pcCh_Alimento;

public PcHormiga(String chestado) {
    this.chestado = chestado;
}

public String getEstado() {
    return chestado;
}

public void setEstado(String chestado) {
    this.chestado = chestado;
}
public PcHormiga(PcCh_Alimento pcCh_Alimento) {
    this.pcCh_Alimento = pcCh_Alimento;
}
 
}
