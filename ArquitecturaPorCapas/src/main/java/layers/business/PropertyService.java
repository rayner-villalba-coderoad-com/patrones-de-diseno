package layers.business;

import layers.data_access.PropertyGateway;
import layers.entities.Property;

import java.util.List;

public class PropertyService {
    private PropertyGateway gateway;

    public PropertyService() {
        gateway = PropertyGateway.getInstance();
    }

    public List<Property> getAllProperties() {
        List<Property> properties = gateway.getAll();
        return properties;
    }

}
