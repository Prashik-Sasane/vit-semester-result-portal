package com.vit.result.controller;

import com.vit.result.model.ResultRecord;
import com.vit.result.repository.ResultRepository;
import com.vit.result.service.ResultService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ResultController {

    private final ResultRepository resultRepository;
    private final ResultService resultService;

    public ResultController(ResultRepository resultRepository, ResultService resultService) {
        this.resultRepository = resultRepository;
        this.resultService = resultService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("resultRecord", new ResultRecord());
        List<ResultRecord> results = resultRepository.findAll();
        model.addAttribute("results", results);
        return "index";
    }

    @PostMapping("/save")
    public String saveResult(@Valid @ModelAttribute("resultRecord") ResultRecord record, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("results", resultRepository.findAll());
            return "index";
        }

        resultService.calculate(record);
        resultRepository.save(record);
        return "redirect:/";
    }
}
