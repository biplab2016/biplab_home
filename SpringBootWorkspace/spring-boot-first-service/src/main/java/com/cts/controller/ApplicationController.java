package com.cts.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cts.model.ResponseObject;


@Controller
@RequestMapping("/application")
public class ApplicationController {
	@RequestMapping(value="/hello", method=RequestMethod.GET,headers={"Content-Type=application/json"},produces={"application/xml","application/json"})
	public @ResponseBody ResponseEntity<ResponseObject> returnResponse(){
		ResponseObject response = new ResponseObject();
		response.setMessage("request received");
		response.setStatus(200);
		return new ResponseEntity<ResponseObject>(response,HttpStatus.OK);
	}

}
