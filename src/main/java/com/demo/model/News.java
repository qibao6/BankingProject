package com.demo.model;
/**
 * 新闻列表		sql_news
 * @author LENOVO
 *
 */
public class News {
	
	   private String newsId;//  number primary key,
	   private String newsTypeId;//  number,-- '所属类别',
	   private String title;//  varchar2(200) ,-- '标题',
	   private String subTitle;//  varchar2(200) ,-- '副标题',
	   private String newsSort;//  number ,-- '排序',
	   private String info;//  varchar2(200) ,-- '简介',
	   private String cphoto;//  varchar2(100) ,-- '封面图片',
	   private String newsLink;//  varchar2(100) ,-- '链接地址',
	   private String author;//  varchar2(50) ,-- '作者',
	   private String newsSource;//  varchar2(200) ,-- '来源',
	   private String newsLabel;//  varchar2(200) ,-- '标签',
	   private String clicknumber;//  number ,-- '点击数量',
	   private String text;//  CLOB,-- '内容',
	   private String filelink;//  varchar2(200) ,-- '附件地址',
	   private String seotitle;//  varchar2(100) ,-- '页面seo标题',
	   private String seokey;//  varchar2(100) ,-- 'seo关键字',
	   private String seodes;//  varchar2(200) ,-- 'seo描述',
	   private String plactop;//  number,-- '是否置顶 0：为是  1为否',
	   private String recommend;//  number,-- '是否推荐',
	   private String newsAudit;//  number,-- '是否审核',
	   private String addid;//  number,-- '添加人ID',
	   private String updid;//  number,-- '修改人ID',
	   private String updtime;//  date,-- '修改时间',
	   private String addtime;//  date-- '添加时间',
	   
	public String getNewsId() {
		return newsId;
	}
	public String getNewsTypeId() {
		return newsTypeId;
	}
	public String getTitle() {
		return title;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public String getNewsSort() {
		return newsSort;
	}
	public String getInfo() {
		return info;
	}
	public String getCphoto() {
		return cphoto;
	}
	public String getNewsLink() {
		return newsLink;
	}
	public String getAuthor() {
		return author;
	}
	public String getNewsSource() {
		return newsSource;
	}
	public String getNewsLabel() {
		return newsLabel;
	}
	public String getClicknumber() {
		return clicknumber;
	}
	public String getText() {
		return text;
	}
	public String getFilelink() {
		return filelink;
	}
	public String getSeotitle() {
		return seotitle;
	}
	public String getSeokey() {
		return seokey;
	}
	public String getSeodes() {
		return seodes;
	}
	public String getPlactop() {
		return plactop;
	}
	public String getRecommend() {
		return recommend;
	}
	public String getNewsAudit() {
		return newsAudit;
	}
	public String getAddid() {
		return addid;
	}
	public String getUpdid() {
		return updid;
	}
	public String getUpdtime() {
		return updtime;
	}
	public String getAddtime() {
		return addtime;
	}
	public void setNewsId(String newsId) {
		this.newsId = newsId;
	}
	public void setNewsTypeId(String newsTypeId) {
		this.newsTypeId = newsTypeId;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public void setNewsSort(String newsSort) {
		this.newsSort = newsSort;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public void setCphoto(String cphoto) {
		this.cphoto = cphoto;
	}
	public void setNewsLink(String newsLink) {
		this.newsLink = newsLink;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setNewsSource(String newsSource) {
		this.newsSource = newsSource;
	}
	public void setNewsLabel(String newsLabel) {
		this.newsLabel = newsLabel;
	}
	public void setClicknumber(String clicknumber) {
		this.clicknumber = clicknumber;
	}
	public void setText(String text) {
		this.text = text;
	}
	public void setFilelink(String filelink) {
		this.filelink = filelink;
	}
	public void setSeotitle(String seotitle) {
		this.seotitle = seotitle;
	}
	public void setSeokey(String seokey) {
		this.seokey = seokey;
	}
	public void setSeodes(String seodes) {
		this.seodes = seodes;
	}
	public void setPlactop(String plactop) {
		this.plactop = plactop;
	}
	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}
	public void setNewsAudit(String newsAudit) {
		this.newsAudit = newsAudit;
	}
	public void setAddid(String addid) {
		this.addid = addid;
	}
	public void setUpdid(String updid) {
		this.updid = updid;
	}
	public void setUpdtime(String updtime) {
		this.updtime = updtime;
	}
	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}
}
