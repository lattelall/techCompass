package com.newssite.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ArticleController {
    @Autowired
    private JdbcTemplate jdbc;

    @RequestMapping("/article")
    private ModelAndView list(ModelAndView mav) {
        List<Map<String, Object>> articles =jdbc.queryForList("SELECT * FROM articles");
        mav.addObject("articles", articles);
        mav.setViewName("article/list");

        return mav;
    }

    @RequestMapping("/article/{article_id}")
    private ModelAndView detail(
    	@PathVariable("article_id") Integer article_id,
    	ModelAndView mav
    ) {
    	String sql = "SELECT title, description FROM articles WHERE article_id = ?";
    	Map<String, Object> article = jdbc.queryForMap(sql, new Object[]{article_id});
    	mav.addObject("article", article);
    	mav.setViewName("article/detail");

    	return mav;
    }


}