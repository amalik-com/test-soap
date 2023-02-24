package com.in28minutes.soap.webservices.soapcoursemanagement.soap;

//import javax.xml.bind.JAXBElement;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.in28minutes.courses.CourseDetails;
import com.in28minutes.courses.GetCourseDetailsRequest;
import com.in28minutes.courses.GetCourseDetailsResponse;

@Endpoint
public class CourseDetailsEndpoint {

	@PayloadRoot(namespace = "http://in28minutes.com/courses", localPart = "GetCourseDetailsRequest")
	@ResponsePayload
	public GetCourseDetailsResponse processCourseDetailsRequest(@RequestPayload GetCourseDetailsRequest request) {
		GetCourseDetailsResponse response = new GetCourseDetailsResponse();
		CourseDetails courseDetails = new CourseDetails();
		courseDetails.setId(123); // getId
		courseDetails.setName("Microservices Course");
		courseDetails.setDescription("Learn about microservices.");
		response.setCourseDetails(courseDetails);

		return response;
	}

//	@PayloadRoot(namespace = "http://in28minutes.com/courses", localPart = "GetCourseDetailsRequest")
//	@ResponsePayload
//	public JAXBElement<GetCourseDetailsResponse> processCourseDetailsRequest(
//			@RequestPayload GetCourseDetailsRequest request) {
//		GetCourseDetailsResponse response = new GetCourseDetailsResponse();
//		CourseDetails courseDetails = new CourseDetails();
//		courseDetails.setId(123); // getId
//		courseDetails.setName("Microservices Course");
//		courseDetails.setDescription("Learn about microservices.");
//		response.setCourseDetails(courseDetails);
//
//		JAXBElement<GetCourseDetailsResponse> jaxbElement = new JAXBElement<GetCourseDetailsResponse>(
//				new QName(GetCourseDetailsResponse.class.getSimpleName()), GetCourseDetailsResponse.class, response);
//
//		return jaxbElement;
//	}
}
