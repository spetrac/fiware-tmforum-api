package org.fiware.tmforum.productofferingterm;

import lombok.EqualsAndHashCode;
import io.github.wistefan.mapping.annotations.MappingEnabled;
import org.fiware.tmforum.common.domain.RefEntity;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@MappingEnabled
public class MarketplaceRef extends RefEntity {

    public MarketplaceRef(String id) {
        super(id);
    }

    @Override
    public List<String> getReferencedTypes() {
        return List.of(getAtReferredType());
    }

}
