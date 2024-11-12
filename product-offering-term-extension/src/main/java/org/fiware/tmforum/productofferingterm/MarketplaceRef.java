package org.fiware.tmforum.productofferingterm;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.fiware.tmforum.common.domain.RefEntity;
import io.github.wistefan.mapping.annotations.AttributeGetter;
import io.github.wistefan.mapping.annotations.AttributeSetter;
import io.github.wistefan.mapping.annotations.AttributeType;
import io.github.wistefan.mapping.annotations.MappingEnabled;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@MappingEnabled(entityType = {"marketplace"})
public class MarketplaceRef extends RefEntity {

    public MarketplaceRef(String id) {
        super(id);
    }

    @Override
    public List<String> getReferencedTypes() {
        return List.of("marketplace");
    }

}
