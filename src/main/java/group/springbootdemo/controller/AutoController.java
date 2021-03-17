package group.springbootdemo.controller;

import group.springbootdemo.model.Auto;
import group.springbootdemo.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class AutoController {

    private final AutoService autoService;

    @Autowired
    public AutoController(AutoService autoService) {
        this.autoService = autoService;
    }

}
