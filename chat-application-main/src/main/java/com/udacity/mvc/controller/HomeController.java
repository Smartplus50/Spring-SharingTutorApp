package com.udacity.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.udacity.mvc.model.MessageForm;
import com.udacity.mvc.service.MessageListService;
import com.udacity.mvc.service.MessageService;
import com.udacity.mvc.model.ChatForm;
@Controller
public class HomeController {
	@Autowired
	private MessageService messageService;
	@Autowired
	private MessageListService messageListService;

//	public HomeController(MessageListService messageListService) {
//		this.messageListService = messageListService;
//	}

	@GetMapping("/home")
	public String getHomePage(@ModelAttribute("newMessage") MessageForm messageForm, Model model) {
		model.addAttribute("greetings", this.messageListService.getMessages());
		return "home";
	}

	@PostMapping("/home")
	public String addMessage(@ModelAttribute("newMessage") MessageForm messageForm, Model model) {
		messageListService.addMessages(messageForm.getText());
		model.addAttribute("greetings", this.messageListService.getMessages());
		messageForm.setText("");
		return "home";
	}

//	@RequestMapping("/home")
//	public String getHomePage(Model model) {
//		// model.addAttribute(attributeName:"welcomeMessage", attributeValue:"HeyLow
//		// Worald");
//		model.addAttribute("welcomeMessage", Instant.now().toString());
//		model.addAttribute("greetings", new String[] { "He", "She", "It", "They", "GoodBye" });
//		return "home";
//	}


//	public ChatController(MessageService messageService) {
//		this.messageService = messageService;
//	}

	@GetMapping("/test")
	public String getChatPage(ChatForm chatForm, Model model) {
		model.addAttribute("home", this.messageService.getMessages());
		return "home";
	}

	@PostMapping("/test")
	public String postChatMessage(Authentication authentication, ChatForm chatForm, Model model) {
		chatForm.setUsername(authentication.getName());
		model.addAttribute("home", this.messageService.getMessages());
		chatForm.setMessageText("");
		return "home";
	}
}


