package com.demo.model;
/**
 * 新闻类别列表		sql_news_type
 * @author LENOVO
 *
 */
public class News_type {
	   private String newsTypeId;//  number primary key,
	   private String newsTypeName;//  varchar2(50) ,-- '名称',
	   private String newsTypeLink;//  varchar2(100) ,-- '链接',
	   private String note;//  varchar2(200) ,-- '备注',
	   private String newsTypeSort;//  number,-- '排序',
	   private String pagetype;//  varchar2(20) ,-- '页面类型',
	   private String suptype;//  number ,-- '上级类别',
	   private String info;//  varchar2(500) ,-- '简介',
	   private String cphoto;//  varchar2(100) ,-- '封面图片',
	   private String text;//  CLOB ,-- '内容',
	   private String seotitle;//  varchar2(100) ,-- '页面seo标题',
	   private String seokey;//  varchar2(100) ,-- 'seo关键字',
	   private String seodes;//  varchar2(500) ,-- 'seo描述',
	   private String addid;//  number,-- '添加人ID',
	   private String updid;//  number,-- '修改人ID',
	   private String updtime;//  date ,-- '修改时间',
	   private String addtime;//  date--'添加时间',
	   
	   
	public String getNewsTypeId() {
		return newsTypeId;
	}
	public String getNewsTypeName() {
		return newsTypeName;
	}
	public String getNewsTypeLink() {
		return newsTypeLink;
	}
	public String getNote() {
		return note;
	}
	public String getNewsTypeSort() {
		return newsTypeSort;
	}
	public String getPagetype() {
		return pagetype;
	}
	public String getSuptype() {
		return suptype;
	}
	public String getInfo() {
		return info;
	}
	public String getCphoto() {
		return cphoto;
	}
	public String getText() {
		return text;
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
	public void setNewsTypeId(String newsTypeId) {
		this.newsTypeId = newsTypeId;
	}
	public void setNewsTypeName(String newsTypeName) {
		this.newsTypeName = newsTypeName;
	}
	public void setNewsTypeLink(String newsTypeLink) {
		this.newsTypeLink = newsTypeLink;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public void setNewsTypeSort(String newsTypeSort) {
		this.newsTypeSort = newsTypeSort;
	}
	public void setPagetype(String pagetype) {
		this.pagetype = pagetype;
	}
	public void setSuptype(String suptype) {
		this.suptype = suptype;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public void setCphoto(String cphoto) {
		this.cphoto = cphoto;
	}
	public void setText(String text) {
		this.text = text;
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
