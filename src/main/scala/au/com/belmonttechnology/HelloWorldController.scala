package au.com.belmonttechnology

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.PathVariable

@Controller
class HelloWorldController {

	@RequestMapping(Array("/hello.html"))
	def showHello = "helloPage"

	/**
	 * This would be ideal for returning JSON content
	 */
	@RequestMapping(Array("/hi"))
	@ResponseBody
	def sayStuff: String = {
		"this is me saying something"
	}

	/**
	 * This would be ideal for returning JSON content
	 */
	@RequestMapping(Array("/name/{firstName}"))
	@ResponseBody
	def sayStuffWithParams(@PathVariable("firstName") firstName: String): String = {
		"this is me saying something to" + firstName
	}

}