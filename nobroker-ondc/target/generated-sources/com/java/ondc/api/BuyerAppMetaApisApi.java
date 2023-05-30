/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.java.ondc.api;

import com.java.ondc.model.InlineObject21;
import com.java.ondc.model.InlineObject23;
import com.java.ondc.model.InlineObject25;
import com.java.ondc.model.InlineObject27;
import com.java.ondc.model.InlineObject29;
import com.java.ondc.model.InlineResponse200;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Api(value = "BuyerAppMetaApis", description = "the BuyerAppMetaApis API")
public interface BuyerAppMetaApisApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /cancellation_reasons
     * Get cancellation reasons from the Seller App
     *
     * @param inlineObject21  (optional)
     * @return Acknowledgement of message received (status code 200)
     */
    @ApiOperation(value = "", nickname = "cancellationReasonsPost", notes = "Get cancellation reasons from the Seller App", response = InlineResponse200.class, authorizations = {
        
        @Authorization(value = "GatewaySubscriberAuth"),
        
        @Authorization(value = "GatewaySubscriberAuthNew"),
        
        @Authorization(value = "SubscriberAuth")
         }, tags={ "Buyer App Meta APIs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Acknowledgement of message received", response = InlineResponse200.class) })
    @PostMapping(
        value = "/cancellation_reasons",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<InlineResponse200> cancellationReasonsPost(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) InlineObject21 inlineObject21) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : { \"ack\" : { \"status\" : \"ACK\" } }, \"error\" : { \"path\" : \"path\", \"code\" : \"code\", \"type\" : \"CONTEXT-ERROR\", \"message\" : \"message\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /feedback_categories
     * Get a list of categories for which feedback can be given by the Buyer App
     *
     * @param inlineObject27  (optional)
     * @return Acknowledgement of message received (status code 200)
     */
    @ApiOperation(value = "", nickname = "feedbackCategoriesPost", notes = "Get a list of categories for which feedback can be given by the Buyer App", response = InlineResponse200.class, authorizations = {
        
        @Authorization(value = "GatewaySubscriberAuth"),
        
        @Authorization(value = "GatewaySubscriberAuthNew"),
        
        @Authorization(value = "SubscriberAuth")
         }, tags={ "Buyer App Meta APIs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Acknowledgement of message received", response = InlineResponse200.class) })
    @PostMapping(
        value = "/feedback_categories",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<InlineResponse200> feedbackCategoriesPost(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) InlineObject27 inlineObject27) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : { \"ack\" : { \"status\" : \"ACK\" } }, \"error\" : { \"path\" : \"path\", \"code\" : \"code\", \"type\" : \"CONTEXT-ERROR\", \"message\" : \"message\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /feedback_form
     * Get a feedback form from the Seller App
     *
     * @param inlineObject29  (optional)
     * @return Acknowledgement of message received (status code 200)
     */
    @ApiOperation(value = "", nickname = "feedbackFormPost", notes = "Get a feedback form from the Seller App", response = InlineResponse200.class, authorizations = {
        
        @Authorization(value = "GatewaySubscriberAuth"),
        
        @Authorization(value = "GatewaySubscriberAuthNew"),
        
        @Authorization(value = "SubscriberAuth")
         }, tags={ "Buyer App Meta APIs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Acknowledgement of message received", response = InlineResponse200.class) })
    @PostMapping(
        value = "/feedback_form",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<InlineResponse200> feedbackFormPost(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) InlineObject29 inlineObject29) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : { \"ack\" : { \"status\" : \"ACK\" } }, \"error\" : { \"path\" : \"path\", \"code\" : \"code\", \"type\" : \"CONTEXT-ERROR\", \"message\" : \"message\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /rating_categories
     * Get a list of categories that can be rated by the Buyer App
     *
     * @param inlineObject25  (optional)
     * @return Acknowledgement of message received (status code 200)
     */
    @ApiOperation(value = "", nickname = "ratingCategoriesPost", notes = "Get a list of categories that can be rated by the Buyer App", response = InlineResponse200.class, authorizations = {
        
        @Authorization(value = "GatewaySubscriberAuth"),
        
        @Authorization(value = "GatewaySubscriberAuthNew"),
        
        @Authorization(value = "SubscriberAuth")
         }, tags={ "Buyer App Meta APIs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Acknowledgement of message received", response = InlineResponse200.class) })
    @PostMapping(
        value = "/rating_categories",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<InlineResponse200> ratingCategoriesPost(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) InlineObject25 inlineObject25) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : { \"ack\" : { \"status\" : \"ACK\" } }, \"error\" : { \"path\" : \"path\", \"code\" : \"code\", \"type\" : \"CONTEXT-ERROR\", \"message\" : \"message\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /return_reasons
     * Get return reasons from the Seller App
     *
     * @param inlineObject23  (optional)
     * @return Acknowledgement of message received (status code 200)
     */
    @ApiOperation(value = "", nickname = "returnReasonsPost", notes = "Get return reasons from the Seller App", response = InlineResponse200.class, authorizations = {
        
        @Authorization(value = "GatewaySubscriberAuth"),
        
        @Authorization(value = "GatewaySubscriberAuthNew"),
        
        @Authorization(value = "SubscriberAuth")
         }, tags={ "Buyer App Meta APIs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Acknowledgement of message received", response = InlineResponse200.class) })
    @PostMapping(
        value = "/return_reasons",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<InlineResponse200> returnReasonsPost(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) InlineObject23 inlineObject23) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : { \"ack\" : { \"status\" : \"ACK\" } }, \"error\" : { \"path\" : \"path\", \"code\" : \"code\", \"type\" : \"CONTEXT-ERROR\", \"message\" : \"message\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
