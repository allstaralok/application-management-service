/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.13).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.showtime.service.application.management.generated.api;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.showtime.service.application.management.generated.model.UserDtls;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-12T21:36:58.218Z")

@Api(value = "getAllUsers", description = "the getAllUsers API")
@RequestMapping(value = "/applicationManagement/v1")
public interface GetAllUsersApi {
	
	Logger log = LoggerFactory.getLogger(GetAllUsersApi.class);

	default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }
	
    @ApiOperation(value = "User Details", nickname = "getAllUsers", notes = "", response = UserDtls.class, responseContainer = "List", tags={ "Admin", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "*OK* - User featched successfully. ", response = UserDtls.class, responseContainer = "List") })
    @RequestMapping(value = "/getAllUsers",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.GET)
    default ResponseEntity<List<UserDtls>> getAllUsers(@NotNull @ApiParam(value = "Get users by status Active All ", required = true) @Valid @RequestParam(value = "status", required = true) String status,@NotNull @ApiParam(value = "Requested number of resources to be provided in the response requested by the client ", required = true) @Valid @RequestParam(value = "limit", required = true) Integer limit,@NotNull @ApiParam(value = "Requested index for start of resources to be provided in the response requested by the client  ", required = true) @Valid @RequestParam(value = "offset", required = true) Integer offset,@ApiParam(value = "The locale of the client " ) @RequestHeader(value="Accept-Language", required=false) String acceptLanguage,@ApiParam(value = "The fields by which the response is sorted. The supported value is - priority. ") @Valid @RequestParam(value = "sort", required = false) List<String> sort) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json;charset=utf-8")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {  \"email\" : \"email\",  \"username\" : \"username\"}, {  \"email\" : \"email\",  \"username\" : \"username\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json;charset=utf-8", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default GetAllUsersApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
