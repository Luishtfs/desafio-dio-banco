import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Aplicacoes {

        Map<String, Integer> listaProdutos = new HashMap<>() {{
            put("CDB", 5);
            put("LCI", 12);
        }};

    @Override
    public String toString() {
        return "Aplicacoes{" +
                "listaProdutos=" + listaProdutos +
                '}';
    }
}


