package metier;
import dao.IDao;
import java.util.List;
import java.util.Map;
public class MetierMultiple implements IMetier {
    private final List<IDao> dataSources;
    private final Map<String, IDao> dataSourcesByBeanName;
    public MetierMultiple(List<IDao> dataSources, Map<String, IDao> dataSourcesByBeanName) {
        this.dataSources = dataSources;
        this.dataSourcesByBeanName = dataSourcesByBeanName;
    }
    public double calcul() { return dataSources.stream().mapToDouble(IDao::getValue).sum(); }
    public Map<String, IDao> getDataSourcesByBeanName() {
        return java.util.Collections.unmodifiableMap(dataSourcesByBeanName);
    }
}
