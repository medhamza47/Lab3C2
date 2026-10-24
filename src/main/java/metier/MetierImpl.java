package metier;
import dao.IDao;
import org.springframework.stereotype.Service;
@Service
public class MetierImpl implements IMetier{
    private final IDao dataSource;
    public MetierImpl(IDao dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public double calcul() {
        double sourceValue = dataSource.getValue();
        return sourceValue * 2.0;
    }
}
