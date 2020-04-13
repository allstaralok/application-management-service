/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.13).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.showtime.service.application.management.generated.api;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.showtime.service.application.management.generated.model.Credentials;
import com.showtime.service.application.management.generated.model.Response;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-12T21:36:58.218Z")

@Api(value = "signIn", description = "the signIn API")
@RequestMapping(value = "/applicationManagement/v1")
public interface SignInApi {
	
	Logger log = LoggerFactory.getLogger(SignInApi.class);

	default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "User signIn", nickname = "userSignIn", notes = "", response = Response.class, tags={ "AllUsers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "*OK* - User logged in successfully. ", response = Response.class) })
    @RequestMapping(value = "/signIn",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.POST)
    default ResponseEntity<Response> userSignIn(@ApiParam(value = "User signing in " ,required=true )  @Valid @RequestBody Credentials credentials,@ApiParam(value = "The locale of the client " ) @RequestHeader(value="Accept-Language", required=false) String acceptLanguage) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json;charset=utf-8")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"description\" : \"description\",  \"status\" : \"status\"}", Response.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json;charset=utf-8", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default SignInApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
