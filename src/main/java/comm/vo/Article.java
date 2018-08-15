package comm.vo;

import com.fasterxml.jackson.databind.util.JSONPObject;



import java.io.Serializable;
import java.sql.Timestamp;

public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;

    private String title;

    private Timestamp pubdate;

    private String txt;

    private String author;

    private int industry_id;

    private String side;

    private int region_id;

    private String uuid;

    private String url;

    private String website_name;

    private String site_name;

    private int view;

    private int wordCount;

    private int reply;

    private String media_type;

    private String wids;

    private String coreWords;

    private String includeWords;

    private String site_url;

    private int sTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Timestamp getPubdate() {
        return pubdate;
    }

    public void setPubdate(Timestamp pubdate) {
        this.pubdate = pubdate;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIndustry_id() {
        return industry_id;
    }

    public void setIndustry_id(int industry_id) {
        this.industry_id = industry_id;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public int getRegion_id() {
        return region_id;
    }

    public void setRegion_id(int region_id) {
        this.region_id = region_id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWebsite_name() {
        return website_name;
    }

    public void setWebsite_name(String website_name) {
        this.website_name = website_name;
    }

    public String getSite_name() {
        return site_name;
    }

    public void setSite_name(String site_name) {
        this.site_name = site_name;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public int getReply() {
        return reply;
    }

    public void setReply(int reply) {
        this.reply = reply;
    }

    public String getMedia_type() {
        return media_type;
    }

    public void setMedia_type(String media_type) {
        this.media_type = media_type;
    }

    public String getWids() {
        return wids;
    }

    public void setWids(String wids) {
        this.wids = wids;
    }

    public String getCoreWords() {
        return coreWords;
    }

    public void setCoreWords(String coreWords) {
        this.coreWords = coreWords;
    }

    public String getIncludeWords() {
        return includeWords;
    }

    public void setIncludeWords(String includeWords) {
        this.includeWords = includeWords;
    }

    public String getSite_url() {
        return site_url;
    }

    public void setSite_url(String site_url) {
        this.site_url = site_url;
    }

    public int getsTime() {
        return sTime;
    }

    public void setsTime(int sTime) {
        this.sTime = sTime;
    }
}
