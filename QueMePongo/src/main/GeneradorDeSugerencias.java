import java.util.List;
import java.util.stream.Collectors;

public class GeneradorDeSugerencias {

    public List<Atuendo> generarSugerencia(List<Atuendo> atuendos,int temperatura){
        return atuendos.stream().filter(atuendo -> atuendo.atuendoAptoTemperatura(temperatura))
                .collect(Collectors.toList());
    }
}
