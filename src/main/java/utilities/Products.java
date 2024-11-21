package steps;

import utilities.Meta;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
@Table(name="products")
public class Products {

    @Column(name = "id")
    public Integer id;
    public String description;
    public String sku;
    public String updatedAt;
    public String createdAt;
    public String merchantId;
    public List<String> images;
    public Boolean insuranceFlag;
    public Object information;
    public String name;
    public Integer mainPrice;
    public Boolean isMainPrice;
    public Integer minimumPurchase;
//    public Volume volume;
    public Boolean isActive;
    public Integer categoryId;
    public Object revisionNote;
    public Object streetId;
    public Object videoUrl;
    public Integer refId;
    public String skuSource;
    public Integer maximumPurchase;
    public String status;
    public List<Object> wholeSale;
    public String type;
    public Object vendorProductId;
    public Meta meta;
    public Boolean isRequiredByProvider;
    public Boolean isText;
    public Boolean isDigital;

}