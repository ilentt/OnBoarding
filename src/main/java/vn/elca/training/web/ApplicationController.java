package vn.elca.training.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import vn.elca.training.dom.Project;
import vn.elca.training.service.IProjectService;

@Controller
public class ApplicationController {
	@Autowired
	private IProjectService projectService;
	@Value("${total.number.of.projects}")
	private String message;
	@Value("${application.title}")
	private String title;

	@Value("${project.name}")
	private String name;
	@Value("${project.title}")
	private String protitle;
	
	@RequestMapping("/")
	ModelAndView main() {
		Map<String, Object> model = new HashMap<String, Object>() {
			private static final long serialVersionUID = -6883088231537577238L;

			{
				put("title", title);
				put("message", String.format(message, projectService.findAll().size()));
			}
		};
		return new ModelAndView("search", model);
	}

	@RequestMapping("/query")
	@ResponseBody
	List<Project> query(@RequestParam("name") String name) {
		return projectService.findProjectByName(name);
	}

	@RequestMapping("/detail/{id}")
	ModelAndView view(@PathVariable("id") Long id) {

		Map<String, Object> model = new HashMap<String, Object>() {

			private static final long serialVersionUID = 1541520911873996579L;

			{
				put("protitle",protitle);
				put("name", String.format(name, projectService.findOne(id).getName()));
			}
		};

		return new ModelAndView("detail", model);
	}
	@ResponseBody
	Project detail(@PathVariable("id") Long id) {
		return projectService.findOne(id);
	}
}
