import BussinesLogic.PcEntomologo;

public class App {
    public static void main(String[] args) throws Exception {
        String pathFile = "src\\data\\AlimentosDeHormigas.txt";
        System.out.println("Hello, World!");
        PcEntomologo  pc = new PcEntomologo();
        pc.pcObtenerAlimentosEIrradiarlo(pathFile);
    }
}
