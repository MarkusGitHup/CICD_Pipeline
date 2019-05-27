package main.java;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Parcel {
	
	private int length;
	private int width;
	private int height;
	private String size;
	
	public Parcel() {
		
	}
	
	public Parcel(int length, int width, int height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	
	public Parcel(int length, int width, int height, String size) {
		this.length = length;
		this.width = width;
		this.height = height;
		this.size = size;
	}

	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
}