package Auto;

import java.util.List;

public interface AutosDao {
    List<Auto> list();
    void add(Auto auto);
}
