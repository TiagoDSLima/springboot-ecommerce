package dev.tiago.ecommerce.springboot_ecommerce.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Resource not found: "  + id);
	}

}
