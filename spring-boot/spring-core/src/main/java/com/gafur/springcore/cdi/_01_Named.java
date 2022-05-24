package com.gafur.springcore.cdi;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

// lombok annotations
@Data   // setter/getter/equals/hashCode/toString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2

//cdi bean creation
@Named(value = "name")     // string based qualifier
@ApplicationScoped              // Specifies that a bean is application scoped
public class _01_Named {
    private Long namedID;
    private String namedData = "Hello, @Named CDI Bean";

}
