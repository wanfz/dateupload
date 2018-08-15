package comm.mapper;

import comm.vo.Article;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface ArticleMapper {
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "title",column = "title"),
            @Result(property = "pubdate",column = "pubdate"),
            @Result(property = "txt",column = "txt"),
            @Result(property = "author",column = "author"),
            @Result(property = "industry_id",column = "industry_id"),
            @Result(property = "side",column = "side"),
            @Result(property = "region_id",column = "region_id"),
            @Result(property = "uuid",column = "uuid"),
            @Result(property = "url",column = "url"),
            @Result(property = "website_name",column = "website_name"),
            @Result(property = "site_name",column = "site_name"),
            @Result(property = "view",column = "view"),
            @Result(property = "wordCount",column = "wordCount"),
            @Result(property = "reply",column = "reply"),
            @Result(property = "media_type",column = "media_type"),
            @Result(property = "wids",column = "wids"),
            @Result(property = "coreWords",column = "coreWords"),
            @Result(property = "includeWords",column = "includeWords"),
            @Result(property = "site_url",column = "site_url"),
            @Result(property = "sTime",column = "sTime")
    })

    @Select("select * from article where id = #{id}")
    Article findArticleById(Integer id);

    @Insert("insert into article(title,pubdate,txt,author,industry_id,side,region_id,uuid,url,website_name,site_name,view,wordCount," +
            "reply,media_type,wids,coreWords,includeWords,site_url,sTime) values (#{title},#{pubdate},#{txt},#{author},#{industry_id},#{side}," +
            "#{region_id},#{uuid},#{url},#{website_name},#{site_name},#{view},#{wordCount},#{reply},#{media_type},#{wids},#{coreWords}," +
            "#{includeWords},#{site_url},#{sTime})")
    void addArticle(Article article);
}
