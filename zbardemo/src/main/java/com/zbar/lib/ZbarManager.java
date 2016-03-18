package com.zbar.lib;

/**
 * Zar的调用类。
 * 此类必须放在com.zbar.lib包下。
 * created by yangjw
 */
public class ZbarManager {

	static {
		System.loadLibrary("zbar");
	}

	public native String decode(byte[] data, int width, int height, boolean isCrop, int x, int y, int cwidth, int cheight);
}
