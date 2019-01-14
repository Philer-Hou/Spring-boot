package com.hourz.fastdfs;

/**
 * <p>文件对象</p>
 * @author hourz
 * @since 2019-01-14
 */
public class FastDFSFile {
	// 文件名称
	private String name;
	// 文件
	private byte[] content;
	// 额外信息
	private String ext;
	// MD5值
	private String md5;
	// 作者
	private String author;
	// 构造器
	public FastDFSFile(String name, byte[] content, String ext, String height,
					   String width, String author) {
		super();
		this.name = name;
		this.content = content;
		this.ext = ext;
		this.author = author;
	}
	// 构造器
	public FastDFSFile(String name, byte[] content, String ext) {
		super();
		this.name = name;
		this.content = content;
		this.ext = ext;

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte[] getContent() {
		return content;
	}
	public void setContent(byte[] content) {
		this.content = content;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}
	public String getMd5() {
		return md5;
	}
	public void setMd5(String md5) {
		this.md5 = md5;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}