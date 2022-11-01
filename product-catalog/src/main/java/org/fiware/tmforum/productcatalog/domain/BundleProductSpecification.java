package org.fiware.tmforum.productcatalog.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.fiware.tmforum.common.domain.EntityWithId;
import org.fiware.tmforum.common.domain.RefEntity;
import org.fiware.tmforum.common.validation.ReferencedEntity;
import org.fiware.tmforum.mapping.annotations.AttributeGetter;
import org.fiware.tmforum.mapping.annotations.AttributeSetter;
import org.fiware.tmforum.mapping.annotations.AttributeType;
import org.fiware.tmforum.mapping.annotations.MappingEnabled;

import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.Optional;

@MappingEnabled(entityType = ProductSpecification.TYPE_PRODUCT_SPECIFICATION)
@EqualsAndHashCode(callSuper = true)
public class BundleProductSpecification extends RefEntity implements ReferencedEntity {

	@Getter(onMethod = @__({
			@AttributeGetter(value = AttributeType.PROPERTY, targetName = "lifecycleStatus", embedProperty = true) }))
	@Setter(onMethod = @__({
			@AttributeSetter(value = AttributeType.PROPERTY, targetName = "lifecycleStatus", fromProperties = true) }))
	private String lifecycleStatus;

	public BundleProductSpecification(String id) {
		super(id);
	}

	@Override
	public List<String> getReferencedTypes() {
		return Optional.ofNullable(getAtReferredType()).map(List::of).orElse(List.of());
	}
}
