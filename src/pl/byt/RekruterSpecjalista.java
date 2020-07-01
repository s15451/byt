package pl.byt;

import java.util.ArrayList;
import java.util.List;

public class RekruterSpecjalista extends PracownikHR {
    private String specjalizacja;

    private List<EtapRekrutacji> etapRekrutacjis = new ArrayList<>();

    public void addEtapRekrutacji(EtapRekrutacji etapRekrutacji) {
        if (!etapRekrutacjis.contains(etapRekrutacji)) {
            etapRekrutacjis.add(etapRekrutacji);
            etapRekrutacji.setRekruterSpecjalista(this);
        }
    }

    public void removeEtapRekrutacji(EtapRekrutacji etapRekrutacji) {
        etapRekrutacjis.remove(etapRekrutacji);
    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public List<EtapRekrutacji> getEtapRekrutacjis() {
        return etapRekrutacjis;
    }
}
