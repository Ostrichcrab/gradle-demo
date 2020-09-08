import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DarkRule {
  private  Map<String, DarkFeature> darkFeatures = new HashMap<>();

  public DarkRule(DarkRuleConfig darkRuleConfig) {
    List<DarkRuleConfig.DarkFeatureConfig> darkFeatureConfigs = darkRuleConfig.getFeatures();
    for (DarkRuleConfig.DarkFeatureConfig darkFeatureConfig : darkFeatureConfigs) {
      darkFeatures.put(darkFeatureConfig.getKey(), new DarkFeature(darkFeatureConfig));
    }
  }

  public DarkFeature getDarkFeature(String featureKey) {
    return darkFeatures.get(featureKey);
  }
}