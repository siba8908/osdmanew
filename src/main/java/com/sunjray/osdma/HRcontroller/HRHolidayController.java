package com.sunjray.osdma.HRcontroller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sunjray.osdma.HRmodel.HolidayList;
import com.sunjray.osdma.HRservice.HRHolidayService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


@Controller
@RequestMapping("hr")

public class HRHolidayController {
	
	 private static String UPLOADED_FOLDER = "D://uploadFiles//";
	
	 
	 
	 
	@Autowired
	private HRHolidayService hrService;

	@RequestMapping(value = "/holidayList", method = RequestMethod.GET)
	public ModelAndView hr_holiday_list() {
		// System.out.println("....LOGIN....");
		return new ModelAndView("HR/postholidaylist");
	}
	
	@RequestMapping(value = "/postholidaylist", method = RequestMethod.POST)
	public HolidayList holidayList(@RequestBody HashMap<Integer, HolidayList> u )
	{
		//String returnText = "";
		System.out.println(u.size());
		HolidayList list =new HolidayList();
		for(int i=0;i<u.size();i++) {
			list.setHoliday_date(u.get(i).getHoliday_date());
			System.out.println(u.get(i).getHoliday_date());
			list.setHoliday_day(u.get(i).getHoliday_day());
			list.setHoliday_events(u.get(i).getHoliday_events());
			hrService.holidayList(list); 
		}
		
		return  list;
		//return null;
		
		//return returnText;
	}
	
	@RequestMapping(value = "/getemployeeholiday", method = RequestMethod.GET)
	public @ResponseBody Iterable<HolidayList> getholiday(HttpSession session) {
		System.out.println("ajax.....");

		return hrService.getholiday();
	}
	
	@RequestMapping(value = "/getholidayList", method = RequestMethod.GET)
	public @ResponseBody Iterable<HolidayList> getholidayList(HttpSession session) {
		System.out.println("ajax.....");

		return hrService.getholiday();
	}
	
	
	 @RequestMapping(value="/upload" ,method = RequestMethod.POST) // //new annotation since 4.3
	//    public String singleFileUpload(@RequestParam("file") MultipartFile file,
	                                 //  RedirectAttributes redirectAttributes) {
	 public String file() {
		 	System.out.println("singleFileUpload----------");
	      /*  if (file.isEmpty()) {
	            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
	            return "redirect:uploadStatus";
	        }

	        try {

	            // Get the file and save it somewhere
	            byte[] bytes = file.getBytes();
	            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
	            Files.write(path, bytes);

	            redirectAttributes.addFlashAttribute("message",
	                    "You successfully uploaded '" + file.getOriginalFilename() + "'");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
*/
	        return "redirect:/uploadStatus";
	    }
	

	/*
	 * @RequestMapping(value="/postdata",method=RequestMethod.POST)
	 * public @ResponseBody User postTimesheet(@RequestBody HashMap<Integer, User>
	 * u,HttpSession session) { System.out.println(u.size()); user=new User();
	 * for(int i=0;i<u.size();i++) { user.setName(u.get(i).getName());
	 * user.setEmail(u.get(i).getEmail()); hrservice.addUser(user); } u.forEach((k,
	 * v) ->{} System.out.println(k + " : " + (v)));
	 * 
	 * System.out.println("....DATA...."); System.out.println(u.get(0).getName());
	 * return user; //empTimesheetService.postTimesheet(timesheetlist,((Long)
	 * session.getAttribute("empCode"))); }
	 */
	
	
}
