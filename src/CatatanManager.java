
import java.util.ArrayList;

public class CatatanManager {
    private ArrayList<Catatan> catatanList;

    public CatatanManager() {
        catatanList = new ArrayList<>();
    }

    public void tambahCatatan(Catatan catatan) {
        catatanList.add(catatan);
    }

    public void hapusCatatan(int index) {
        if (index >= 0 && index < catatanList.size()) {
            catatanList.remove(index);
        }
    }

    public void ubahCatatan(int index, Catatan catatan) {
        if (index >= 0 && index < catatanList.size()) {
            catatanList.set(index, catatan);
        }
    }

    public ArrayList<Catatan> getCatatanList() {
        return catatanList;
    }
    
}
