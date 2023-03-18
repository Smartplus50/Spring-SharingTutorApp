package com.udacity.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.udacity.mvc.model.ChatForm;
import com.udacity.mvc.service.MessageService;

@Controller
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private MessageService messageService;

//	public ChatController(MessageService messageService) {
//		this.messageService = messageService;
//	}

	@GetMapping
	public String getChatPage(ChatForm chatForm, Model model) {
		model.addAttribute("chats", this.messageService.getMessages());
		return "home";
	}

	@PostMapping
	public String postChatMessage(Authentication authentication, ChatForm chatForm, Model model) {
		chatForm.setUsername(authentication.getName());
		model.addAttribute("chats", this.messageService.getMessages());
		chatForm.setMessageText("");
		return "home";
	}

	

}
