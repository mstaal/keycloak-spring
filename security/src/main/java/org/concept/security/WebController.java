package org.concept.security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class WebController {

    @GetMapping(path = "/")
    public String index() {
        return "external";
    }

    @PreAuthorize("hasRole('company')")
    @GetMapping(path = "/intranet")
    public String intranet(Principal principal, Model model) {
        model.addAttribute("option", "dummy");
        model.addAttribute("username", principal.getName());
        return "intranet";
    }

    @PreAuthorize("hasRole('caseworker')")
    @GetMapping(path = "/cases")
    public String cases() {
        return "cases";
    }

}