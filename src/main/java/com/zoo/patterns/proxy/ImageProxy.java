package com.zoo.patterns.proxy;
/**
 * 
 * @author <a href="mailto:yankai913@gmail.com">yankai</a>
 * @date 2013-10-11
 */
public class ImageProxy implements Image {

	private Image image;
	
	public ImageProxy(Image image) {
		this.image = image;
	}
	
	@Override
	public void show() {
		if (this.image == null) {
			this.image = new BigImage();
		}
		this.image.show();
	}
}
