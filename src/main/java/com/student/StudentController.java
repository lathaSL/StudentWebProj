package com.student;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentController {
	
	@Autowired
	StudentDAO stuDao;
	
	@RequestMapping ("insert")
	public ModelAndView insert(@RequestParam("studentNo") int studentNo, 
			@RequestParam("studentName") String studentName, 
			@RequestParam("subject") String subject){
	
		ModelAndView mv = new ModelAndView();
		Student st=new Student();
		st.setStudentNo(studentNo);
		st.setStudentName(studentName);
		st.setSubject(subject);
		Student st1 = stuDao.insert(st);
		if (st1!=null) {
			mv.setViewName("status");
		}
		else {
			mv.setViewName("error");
		}
		return mv;

}
	@RequestMapping ("list")
	public ModelAndView list(HttpServletRequest req, HttpServletResponse res){
	
		ModelAndView mv = new ModelAndView();
		List <Student> sts=stuDao.listAll();
		
			mv.setViewName("view");
			mv.addObject("list", sts);
		
		return mv;

}
	@RequestMapping ("home")
	public ModelAndView home(HttpServletRequest req, HttpServletResponse res){
	
		ModelAndView mv = new ModelAndView();
		
			mv.setViewName("home");
		
		return mv;

}
}