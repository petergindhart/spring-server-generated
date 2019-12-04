package io.swagger.api;

import io.swagger.api.employee.EmployeeService;
import io.swagger.model.Employee;
import io.swagger.model.Pet;
import io.swagger.model.Topic;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
public class EmployeeApiController implements EmployeeApi {

    private static final Logger log = LoggerFactory.getLogger(EmployeeApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final EmployeeService employeeService;

    @org.springframework.beans.factory.annotation.Autowired
    public EmployeeApiController(ObjectMapper objectMapper, HttpServletRequest request, EmployeeService employeeService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.employeeService = employeeService;
    }

    public ResponseEntity<List<Employee>> employeeGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Employee>>(employeeService.getAllEmployees(), HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Employee>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Employee>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> employeeIdChangeManagerPost(@ApiParam(value = "id of employee",required=true) @PathVariable("id") Integer id,@NotNull @ApiParam(value = "id of new manager", required = true) @Valid @RequestParam(value = "managerId", required = true) Integer managerId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> employeeIdDelete(@ApiParam(value = "id of employee",required=true) @PathVariable("id") Integer id,@ApiParam(value = "id of employee to assign dependencies to (subordinates, pets)") @Valid @RequestParam(value = "reassignId", required = false) Integer reassignId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Employee>> employeeIdDirectReportsGet(@ApiParam(value = "id of employee",required=true) @PathVariable("id") Integer id) {
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

    public ResponseEntity<Employee> employeeIdGet(@ApiParam(value = "id of employee",required=true) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Employee>(objectMapper.readValue("{\n  \"hireDate\" : \"2000-01-23\",\n  \"isEskimo\" : true,\n  \"name\" : \"name\",\n  \"approximateAge\" : 5,\n  \"ageAtHire\" : 1,\n  \"id\" : 0,\n  \"managerId\" : 6\n}", Employee.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Employee>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Employee>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> employeeIdInterestsDelete(@ApiParam(value = "id of employee",required=true) @PathVariable("id") Integer id,@NotNull @ApiParam(value = "id of topic", required = true) @Valid @RequestParam(value = "topId", required = true) Integer topId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Topic>> employeeIdInterestsGet(@ApiParam(value = "id of employee",required=true) @PathVariable("id") Integer id) {
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

    public ResponseEntity<Void> employeeIdInterestsPost(@ApiParam(value = "id of employee",required=true) @PathVariable("id") Integer id,@NotNull @ApiParam(value = "id of topic", required = true) @Valid @RequestParam(value = "topId", required = true) Integer topId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Pet>> employeeIdPetsGet(@ApiParam(value = "id of employee",required=true) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Pet>>(objectMapper.readValue("[ {\n  \"owner\" : 6,\n  \"name\" : \"name\",\n  \"id\" : 0\n}, {\n  \"owner\" : 6,\n  \"name\" : \"name\",\n  \"id\" : 0\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Pet>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Pet>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
