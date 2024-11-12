package org.fiware.tmforum.productofferingterm;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.fiware.tmforum.common.domain.PlaceRef;
import org.fiware.tmforum.product.ProductOfferingTerm;

@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerRestriction extends ProductOfferingTerm {

    private final String atType = "CustomerRestriction";

    private ProductOfferingProperty[] hiddenProperty;
    private boolean authenticatedOnly;
    private GeographicAddressRefOrValue[] permittedCustomerRegion;
    private GeographicAddressRefOrValue[] prohibitedCustomerRegion;

}
