package org.fiware.tmforum.productofferingterm;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.fiware.tmforum.common.domain.Entity;
import org.fiware.tmforum.product.ProductOfferingTerm;


@Data
@EqualsAndHashCode(callSuper = true)
public class MarketplaceRestriction extends ProductOfferingTerm {

    private MarketplaceRef[] permittedMarketplace;
    private MarketplaceRef[] prohibitedMarketplace;
//    private GeographicAddressRefOrValue[] permittedLegalRegion;
//    private GeographicAddressRefOrValue[] prohibitedLegalRegion;

}
