import BussinesLogic.PcEntomologo;

public class App {
    public static void main(String[] args) throws Exception {
        String pathFile = "C:\\Users\\Angel\\Downloads\\New\\Supletorio\\Pastaz.Chantasig\\src\\data\\AlimentosDeHormigas.txt";
        System.out.println("Hello, World!");
        PcEntomologo  pc = new PcEntomologo();
        pc.pcObtenerAlimentosEIrradiarlo(pathFile);
    }
}
