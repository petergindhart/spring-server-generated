/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.14).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Employee;
import io.swagger.model.Topic;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-12-02T16:44:07.114Z[GMT]")
@Api(value = "topic", description = "the topic API")
public interface TopicApi {

    @ApiOperation(value = "list of all topics", nickname = "topicGet", notes = "", response = Topic.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = Topic.class, responseContainer = "List") })
    @RequestMapping(value = "/topic",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Topic>> topicGet();


    @ApiOperation(value = "delete a topic", nickname = "topicIdDelete", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success"),
        @ApiResponse(code = 404, message = "no topic with this id") })
    @RequestMapping(value = "/topic/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> topicIdDelete(@ApiParam(value = "id of topic",required=true) @PathVariable("id") Integer id);


    @ApiOperation(value = "list of employees interested in this topic", nickname = "topicIdEnthusiastsGet", notes = "", response = Employee.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = Employee.class, responseContainer = "List") })
    @RequestMapping(value = "/topic/{id}/enthusiasts",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Employee>> topicIdEnthusiastsGet(@ApiParam(value = "id of topic",required=true) @PathVariable("id") Integer id);


    @ApiOperation(value = "a topic by id", nickname = "topicIdGet", notes = "", response = Topic.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = Topic.class),
        @ApiResponse(code = 404, message = "no topic with this id") })
    @RequestMapping(value = "/topic/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Topic> topicIdGet(@ApiParam(value = "id of topic",required=true) @PathVariable("id") Integer id);


    @ApiOperation(value = "update topic by id", nickname = "topicIdPut", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "topic updated") })
    @RequestMapping(value = "/topic/{id}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> topicIdPut(@ApiParam(value = "id of topic",required=true) @PathVariable("id") Integer id,@ApiParam(value = ""  )  @Valid @RequestBody Topic body);


    @ApiOperation(value = "create a new topic", nickname = "topicPost", notes = "", response = Integer.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "topic created", response = Integer.class) })
    @RequestMapping(value = "/topic",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Integer> topicPost(@ApiParam(value = ""  )  @Valid @RequestBody Topic body);

}
