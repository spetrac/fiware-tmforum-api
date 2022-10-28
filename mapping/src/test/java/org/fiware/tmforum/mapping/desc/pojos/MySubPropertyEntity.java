package org.fiware.tmforum.mapping.desc.pojos;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.fiware.tmforum.mapping.annotations.AttributeGetter;
import org.fiware.tmforum.mapping.annotations.AttributeSetter;
import org.fiware.tmforum.mapping.annotations.AttributeType;
import org.fiware.tmforum.mapping.annotations.DatasetId;
import org.fiware.tmforum.mapping.annotations.EntityId;
import org.fiware.tmforum.mapping.annotations.EntityType;
import org.fiware.tmforum.mapping.annotations.MappingEnabled;
import org.fiware.tmforum.mapping.annotations.RelationshipObject;

import java.net.URI;

@EqualsAndHashCode
@ToString
@MappingEnabled(entityType = "sub-entity")
public class MySubPropertyEntity {

	@Getter(onMethod = @__({@EntityId, @RelationshipObject, @DatasetId}))
	private URI id;

	@Getter(onMethod = @__({@EntityType}))
	private String type = "sub-entity";

	public MySubPropertyEntity(String id) {
		this.id = URI.create(id);
	}

	@Getter(onMethod = @__({@AttributeGetter(value = AttributeType.PROPERTY, targetName = "name")}))
	@Setter(onMethod = @__({@AttributeSetter(value = AttributeType.PROPERTY, targetName = "name")}))
	private String name = "myName";
}
