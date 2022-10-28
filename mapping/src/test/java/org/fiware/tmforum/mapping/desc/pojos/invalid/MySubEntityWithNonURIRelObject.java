package org.fiware.tmforum.mapping.desc.pojos.invalid;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.fiware.tmforum.mapping.annotations.DatasetId;
import org.fiware.tmforum.mapping.annotations.EntityId;
import org.fiware.tmforum.mapping.annotations.EntityType;
import org.fiware.tmforum.mapping.annotations.MappingEnabled;
import org.fiware.tmforum.mapping.annotations.RelationshipObject;

import java.net.URI;

@EqualsAndHashCode
@MappingEnabled(entityType = "sub-entity")
public class MySubEntityWithNonURIRelObject {

    @Getter(onMethod = @__({@EntityId}))
    private URI id;

    @Getter(onMethod = @__({@RelationshipObject}))
    private String invalidRelationshipObject;

    @Getter(onMethod = @__({@EntityType}))
    private String type = "sub-entity";

    public MySubEntityWithNonURIRelObject(String id) {
        this.id = URI.create(id);
    }

}
