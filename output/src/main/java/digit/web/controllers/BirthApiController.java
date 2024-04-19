package digit.web.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import digit.web.models.BirthApplicationSearchCriteria;
import digit.web.models.BirthRegistrationApplication;
import digit.web.models.BirthRegistrationRequest;
import digit.web.models.BirthRegistrationResponse;
import io.micrometer.core.instrument.util.IOUtils;
import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.egov.common.contract.response.ResponseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.core.io.ResourceLoader;

import org.springframework.core.io.ResourceLoader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

@jakarta.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2024-03-12T13:40:42.981935029+05:30[Asia/Kolkata]")
@Controller
@RequestMapping("")
public class BirthApiController {

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private ResourceLoader resourceLoader;

    @Autowired
    public BirthApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    @RequestMapping(value = "/birth/registration/v1/_create", method = RequestMethod.POST)
    public ResponseEntity<String> birthRegistrationV1CreatePost(@Parameter(in = ParameterIn.DEFAULT, description = "Details for the new Birth Registration Application(s) + RequestInfo meta data.", required = true, schema = @Schema()) @Valid @RequestBody BirthRegistrationRequest body) {
        InputStream mockDataFile = null;
        try {
            Resource resource1 = resourceLoader.getResource("classpath:mockData.json");
            InputStream inputStream = null;
            mockDataFile = resource1.getInputStream();
            String res = IOUtils.toString(mockDataFile);
            return new ResponseEntity<>(res, HttpStatus.OK);
        } catch (IOException e) {
            return new ResponseEntity<>("ajauhaj", HttpStatus.OK);
        }


    }

    @RequestMapping(value = "/birth/registration/v1/_search", method = RequestMethod.POST)
    public ResponseEntity<String> v1RegistrationSearchPost(@ApiParam(value = "Details for the new Birth Registration Application(s) + RequestInfo meta data." ,required=true )  @Valid @RequestBody BirthRegistrationRequest body) {
        InputStream mockDataFile = null;
        try {
            Resource resource1 = resourceLoader.getResource("classpath:mockData.json");
            InputStream inputStream = null;
            mockDataFile = resource1.getInputStream();
            String res = IOUtils.toString(mockDataFile);
            return new ResponseEntity<>(res, HttpStatus.OK);
        } catch (IOException e) {
            return new ResponseEntity<>("ajauhaj", HttpStatus.OK);
        }
    }

    @RequestMapping(value = "/birth/registration/v1/_update", method = RequestMethod.POST)
    public ResponseEntity<BirthRegistrationResponse> birthRegistrationV1UpdatePost(@Parameter(in = ParameterIn.DEFAULT, description = "Details for the new (s) + RequestInfo meta data.", required = true, schema = @Schema()) @Valid @RequestBody BirthRegistrationRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<BirthRegistrationResponse>(objectMapper.readValue("{  \"ResponseInfo\" : {    \"ver\" : \"ver\",    \"resMsgId\" : \"resMsgId\",    \"msgId\" : \"msgId\",    \"apiId\" : \"apiId\",    \"ts\" : 0,    \"status\" : \"SUCCESSFUL\"  },  \"BirthRegistrationApplications\" : [ {    \"placeOfBirth\" : \"placeOfBirth\",    \"address\" : {      \"applicationNumber\" : \"applicationNumber\",      \"applicantAddress\" : {        \"pincode\" : \"pincode\",        \"city\" : \"city\",        \"latitude\" : 3.616076749251911,        \"tenantId\" : \"tenantId\",        \"addressNumber\" : \"addressNumber\",        \"addressLine1\" : \"addressLine1\",        \"addressLine2\" : \"addressLine2\",        \"detail\" : \"detail\",        \"landmark\" : \"landmark\",        \"longitude\" : 2.027123023002322,        \"addressId\" : \"addressId\"      },      \"tenantId\" : \"tenantId\",      \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"    },    \"workflow\" : {      \"documents\" : [ {        \"documentType\" : \"documentType\",        \"documentUid\" : \"documentUid\",        \"fileStore\" : \"fileStore\",        \"id\" : \"id\",        \"additionalDetails\" : { }      }, {        \"documentType\" : \"documentType\",        \"documentUid\" : \"documentUid\",        \"fileStore\" : \"fileStore\",        \"id\" : \"id\",        \"additionalDetails\" : { }      } ],      \"action\" : \"action\",      \"assignees\" : [ \"assignees\", \"assignees\" ],      \"comment\" : \"comment\",      \"status\" : \"status\"    },    \"applicationNumber\" : \"applicationNumber\",    \"hospitalName\" : \"hospitalName\",    \"babyLastName\" : \"babyLastName\",    \"doctorName\" : \"doctorName\",    \"timeOfBirth\" : 9,    \"auditDetails\" : {      \"lastModifiedTime\" : 7,      \"createdBy\" : \"createdBy\",      \"lastModifiedBy\" : \"lastModifiedBy\",      \"createdTime\" : 4    },    \"tenantId\" : \"tenantId\",    \"id\" : \"id\",    \"babyFirstName\" : \"babyFirstName\"  }, {    \"placeOfBirth\" : \"placeOfBirth\",    \"address\" : {      \"applicationNumber\" : \"applicationNumber\",      \"applicantAddress\" : {        \"pincode\" : \"pincode\",        \"city\" : \"city\",        \"latitude\" : 3.616076749251911,        \"tenantId\" : \"tenantId\",        \"addressNumber\" : \"addressNumber\",        \"addressLine1\" : \"addressLine1\",        \"addressLine2\" : \"addressLine2\",        \"detail\" : \"detail\",        \"landmark\" : \"landmark\",        \"longitude\" : 2.027123023002322,        \"addressId\" : \"addressId\"      },      \"tenantId\" : \"tenantId\",      \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"    },    \"workflow\" : {      \"documents\" : [ {        \"documentType\" : \"documentType\",        \"documentUid\" : \"documentUid\",        \"fileStore\" : \"fileStore\",        \"id\" : \"id\",        \"additionalDetails\" : { }      }, {        \"documentType\" : \"documentType\",        \"documentUid\" : \"documentUid\",        \"fileStore\" : \"fileStore\",        \"id\" : \"id\",        \"additionalDetails\" : { }      } ],      \"action\" : \"action\",      \"assignees\" : [ \"assignees\", \"assignees\" ],      \"comment\" : \"comment\",      \"status\" : \"status\"    },    \"applicationNumber\" : \"applicationNumber\",    \"hospitalName\" : \"hospitalName\",    \"babyLastName\" : \"babyLastName\",    \"doctorName\" : \"doctorName\",    \"timeOfBirth\" : 9,    \"auditDetails\" : {      \"lastModifiedTime\" : 7,      \"createdBy\" : \"createdBy\",      \"lastModifiedBy\" : \"lastModifiedBy\",      \"createdTime\" : 4    },    \"tenantId\" : \"tenantId\",    \"id\" : \"id\",    \"babyFirstName\" : \"babyFirstName\"  } ]}", BirthRegistrationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                return new ResponseEntity<BirthRegistrationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<BirthRegistrationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}