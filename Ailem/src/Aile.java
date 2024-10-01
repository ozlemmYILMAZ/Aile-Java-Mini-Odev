import java.util.ArrayList;
import java.util.List;

public class Aile {
    List<AileUyesi>Aileuyeleri = new ArrayList<>();

    public void addUye(AileUyesi uye){
        Aileuyeleri.add(uye);
    }
    public void printFamilyInfo() {
        for (AileUyesi Aileuyeleri : Aileuyeleri) {
            Aileuyeleri.PrintInfo(); // Her bir aile üyesinin bilgilerini yazdırır.
        }
}}
