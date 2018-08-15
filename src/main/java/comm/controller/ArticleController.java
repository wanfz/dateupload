package comm.controller;


import comm.mapper.ArticleMapper;
import comm.vo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/dt")
public class ArticleController {
    @Autowired
    private ArticleMapper articleMapper;

    @PostMapping(path = "/addarticle")
    public @ResponseBody
    String addArticle(@RequestBody Article article){
        articleMapper.addArticle(article);
        return "添加成功！";
    }
}
