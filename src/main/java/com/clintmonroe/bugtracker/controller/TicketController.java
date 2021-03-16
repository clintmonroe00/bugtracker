package com.clintmonroe.bugtracker.controller;

import com.clintmonroe.bugtracker.model.Ticket;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TicketController {

    @GetMapping("/ticket")
    public String ticketForm(Model model) {

        model.addAttribute("ticket", new Ticket());
        return "ticket";
    }

    @PostMapping("/ticket")
    public String ticketSubmit(@ModelAttribute Ticket ticket, Model model) {

        model.addAttribute("ticket", ticket);
        return "result";
    }
}
