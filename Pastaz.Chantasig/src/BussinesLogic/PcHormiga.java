package BussinesLogic;
public abstract class PcHormiga {
 private String chestado="VIVA";
private PcCh_Alimento pcAlimento;
public PcHormiga(String chestado) {
    this.chestado = chestado;
}
public PcHormiga(PcCh_Alimento pcAlimento){
  this.pcAlimento=pcAlimento;  
}
public String getEstado() {
    return chestado;
}

public void setEstado(String chestado) {
    this.chestado = chestado;
}
 
}
