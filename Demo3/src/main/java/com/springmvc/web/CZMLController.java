package com.springmvc.web;

import java.io.IOException;
import java.net.URL;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springmvc.utils.CZMLSpider;

@Controller
public class CZMLController {
	
	@ResponseBody
    @RequestMapping(value="/getCzmlDataSource.html",method=RequestMethod.GET)
	public JSONArray getCzmlDataSource(HttpServletRequest request) throws IOException{
		
		String queryString = request.getQueryString();
		URL url = new URL("http://www.orbitalpredictor.com/api/predict_orbit/?" + queryString);
		String czmlData = CZMLSpider.getCZMLData(url);
		
		return JSONArray.fromObject(czmlData);
	}
	
	
}
