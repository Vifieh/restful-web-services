package com.in28minutes.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {
	
	@GetMapping(value="/person/header", headers="X-API-VERDION=1")
	public PersonV1 headerV1() {
		return new PersonV1("Bob");
	}
	@GetMapping(value="/person/header", headers="X-API-VERDION=2")
	public PersonV2 headerV2() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
}
