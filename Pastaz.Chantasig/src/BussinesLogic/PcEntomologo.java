package BussinesLogic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PcEntomologo {
    
    public List<PcCh_Alimento> pcObtenerAlimentosEIrradiarlo(String rutaArchivo) throws IOException {
        List<PcCh_Alimento> alimentos = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Dividir la línea en dos partes utilizando la coma como delimitador
                String[] partes = linea.split(",");
                if (partes.length == 2) {
                    // Crear un objeto PcCh_Alimento y añadirlo a la lista
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

}
