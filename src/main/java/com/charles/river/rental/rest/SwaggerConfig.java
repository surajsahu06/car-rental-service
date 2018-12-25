package com.charles.river.rental.rest;

import static springfox.documentation.schema.AlternateTypeRules.newRule;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.WildcardType;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.async.DeferredResult;

import com.fasterxml.classmate.TypeResolver;

@Configuration
@EnableSwagger2
@Profile("!unit-test")
public class SwaggerConfig {

  @Bean
  public Docket swaggerDocs() {
    TypeResolver typeResolver = new TypeResolver();

    return new Docket(DocumentationType.SWAGGER_2).select()
      .apis(RequestHandlerSelectors.basePackage("com.charles.river.rental.rest"))
      .paths(PathSelectors.any())
      .build()
      .genericModelSubstitutes(ResponseEntity.class)
      .useDefaultResponseMessages(true)
      .alternateTypeRules(newRule(
        typeResolver.resolve(DeferredResult.class, typeResolver.resolve(ResponseEntity.class, WildcardType.class)),
        typeResolver.resolve(WildcardType.class)));
  }
}
