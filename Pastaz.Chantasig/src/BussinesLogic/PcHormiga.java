package BussinesLogic;
public abstract class PcHormiga {
 private String chestado="VIVA";

public PcHormiga(String chestado) {
    this.chestado = chestado;
}

public String getEstado() {
    return chestado;
}

public void setEstado(String chestado) {
    this.chestado = chestado;
}
 
}
