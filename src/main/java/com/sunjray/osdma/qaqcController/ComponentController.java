
package com.sunjray.osdma.qaqcController;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sunjray.osdma.qaqcModel.Component;
import com.sunjray.osdma.qaqcservice.ComponentService;


@Controller
@RequestMapping("qaqc")
public class ComponentController {
	
	@Autowired
	private ComponentService hrService;

	@RequestMapping(value = "/getComponent", method = RequestMethod.GET)
	public @ResponseBody Iterable<Component> getComponent(@RequestParam(name = "images") String images)
	{
		System.out.println("ajax.....");
		System.out.println("rtydrhfruyh::"+images);

		return hrService.getComponent(images);
	}
}
