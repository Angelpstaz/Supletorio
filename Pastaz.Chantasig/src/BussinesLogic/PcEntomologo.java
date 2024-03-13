package BussinesLogic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.Patch;

public class PcEntomologo {
    String pathFile = "C:\\Users\\Angel\\Downloads\\New\\Supletorio\\Pastaz.Chantasig\\src\\data\\AlimentosDeHormigas.txt";
    
    public List<PcCh_Alimento> pcObtenerAlimentosEIrradiarlo(String rutaArchivo) throws IOException {
        List<PcCh_Alimento> alimentos = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 2) {
                    switch (partes[1]) {
                        case "Carnívoro":
                            PcCh_AlimentoCarnivoro alimentoC = new PcCh_AlimentoCarnivoro(partes[0]);
                            alimentos.add(alimentoC);
                            // System.out.println("se agregó carnivoro "+ partes[0]);
                            break;
                        case "Herbívoro":
                            PcCh_AlimentoHervivoro alimentoH = new PcCh_AlimentoHervivoro(partes[0]);
                            alimentos.add(alimentoH);
                            // System.out.println("se agregó herbivoro "+ partes[0]);

                            break;
                        case "Insectívoros":
                            PcCh_AlimentoInsectivoro alimentoI = new PcCh_AlimentoInsectivoro(partes[0]);
                            alimentos.add(alimentoI);
                            // System.out.println("se agregó insectivoro "+ partes[0]);
                            break;
                        case "Omnívoro":
                            PcCh_AlimentoOmnivoro alimentoO = new PcCh_AlimentoOmnivoro(partes[0]);
                            alimentos.add(alimentoO);
                            // System.out.println("se agregó insectivoro "+ partes[0]);
                            break;
                        
                        default:
                            break;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        
        return alimentos;
    }

    public List<PcHormiga> crearHormigueroLarvarioAlimentar(List<PcCh_Alimento> pcLstAlimentoIrradiado) throws IOException{
        pcLstAlimentoIrradiado = pcObtenerAlimentosEIrradiarlo(pathFile);
        for(int i=0; i <30; i++){
            PcHormigaLarva pcLarva= new PcHormigaLarva(pcLstAlimentoIrradiado.get(i));
            
        }

        return null;

    }
}
