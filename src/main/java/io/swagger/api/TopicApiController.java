package io.swagger.api;

import io.swagger.model.Employee;
import io.swagger.model.Topic;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-12-02T16:44:07.114Z[GMT]")
@Controller
public class TopicApiController implements TopicApi {

    private static final Logger log = LoggerFactory.getLogger(TopicApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TopicApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Topic>> topicGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Topic>>(objectMapper.readValue("[ {\n  \"name\" : \"name\",\n  \"id\" : 0\n}, {\n  \"name\" : \"name\",\n  \"id\" : 0\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Topic>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Topic>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> topicIdDelete(@ApiParam(value = "id of topic",required=true) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Employee>> topicIdEnthusiastsGet(@ApiParam(value = "id of topic",required=true) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Employee>>(objectMapper.readValue("[ {\n  \"hireDate\" : \"2000-01-23\",\n  \"isEskimo\" : true,\n  \"name\" : \"name\",\n  \"approximateAge\" : 5,\n  \"ageAtHire\" : 1,\n  \"id\" : 0,\n  \"managerId\" : 6\n}, {\n  \"hireDate\" : \"2000-01-23\",\n  \"isEskimo\" : true,\n  \"name\" : \"name\",\n  \"approximateAge\" : 5,\n  \"ageAtHire\" : 1,\n  \"id\" : 0,\n  \"managerId\" : 6\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Employee>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Employee>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Topic> topicIdGet(@ApiParam(value = "id of topic",required=true) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Topic>(objectMapper.readValue("{\n  \"name\" : \"name\",\n  \"id\" : 0\n}", Topic.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Topic>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Topic>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> topicIdPut(@ApiParam(value = "id of topic",required=true) @PathVariable("id") Integer id,@ApiParam(value = ""  )  @Valid @RequestBody Topic body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Integer> topicPost(@ApiParam(value = ""  )  @Valid @RequestBody Topic body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Integer>(objectMapper.readValue("0", Integer.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Integer>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Integer>(HttpStatus.NOT_IMPLEMENTED);
    }

}
