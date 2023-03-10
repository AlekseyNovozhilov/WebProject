package org.example.controller;

import org.example.Model.User;
import org.example.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/users")
public class UsersController {

    private final Dao dao;

    @Autowired
    public UsersController(Dao dao) {
        this.dao = dao;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("allUsers", dao.getAllUsers());
        return "users/index";
    }

    @GetMapping("/{id}")
    public String showUserBiId(@PathVariable("id") int id, Model model) {
        model.addAttribute("oneUser", dao.getUserBiId(id));
        return "users/user";
    }

    @GetMapping("/new")
    public String newUser(Model model) {
        model.addAttribute("newUser", new User());

        return "users/new";
    }

    @PostMapping
    public String create(@ModelAttribute("newUser") User user) {
        dao.saveUser(user);
        return "redirect:/index";
    }

/*	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException {
		return new ModelAndView("home");
	}*/
}
