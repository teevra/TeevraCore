package com.headstrong.fusion.commons.util;

/**
 * Base64
 *
 * Handles basic base64 encoding/decoding - used by simple wrapper methods
 * encodeBase64 & decodeBase64 in Utils.
 */
public class Base64 {

	public static byte[] decode(String base64) {
		int pad = 0;
		for (int i = base64.length() - 1; base64.charAt(i) == '='; i--) pad++;
		int length = base64.length() * 6 / 8 - pad;
		byte[] raw = new byte[length];
		int rawIndex = 0;
		for (int i = 0; i < base64.length(); i += 4) {
			int block = (getValue(base64.charAt(i)) << 18)
						 + (getValue(base64.charAt(i + 1)) << 12)
						 + (getValue(base64.charAt(i + 2)) << 6)
						 + (getValue(base64.charAt(i + 3)));
			for (int j = 0; j < 3 && rawIndex + j < raw.length; j++) {
				raw[rawIndex + j] = (byte)((block >> (8 * (2 - j))) & 0xff);
			}
			rawIndex += 3;
		}
		return raw;
	}

	public static String encode(String text) throws Exception {
		return encode(text.getBytes("Cp1252"));
	}

	public static String encode(byte[] raw) {
		StringBuffer encoded = new StringBuffer();
		for (int i = 0; i < raw.length; i += 3) {
			encoded.append(encodeBlock(raw, i));
		}
		return encoded.toString();
	}

	private static char[] encodeBlock(byte[] raw, int offset) {
		int block = 0;
		int slack = raw.length - offset - 1;
		int end = (slack >= 2) ? 2 : slack;
		for (int i = 0; i <= end; i++) {
			byte b = raw[offset + i];
			int neuter = (b < 0) ? b + 256 : b;
			block += neuter << (8 * (2 - i));
		}
		char[] base64 = new char[4];
		for (int i = 0; i < 4; i++) {
			int sixbit = (block >>> (6 * (3 - i))) & 0x3f;
			base64[i] = getChar(sixbit);
		}
		if (slack < 1) base64[2] = '=';
		if (slack < 2) base64[3] = '=';
		return base64;
	}

	private static char getChar(int sixBit) {
		if (sixBit >= 0 && sixBit <= 25) return (char)('A' + sixBit);
		if (sixBit >= 26 && sixBit <= 51) return (char)('a' + (sixBit - 26));
		if (sixBit >= 52 && sixBit <= 61) return (char)('0' + (sixBit - 52));
		if (sixBit == 62) return '+';
		if (sixBit == 63) return '/';
		return '?';
	}

	private static int getValue(char c) {
		if (c >= 'A' && c <= 'Z') return c - 'A';
		if (c >= 'a' && c <= 'z') return c - 'a' + 26;
		if (c >= '0' && c <= '9') return c - '0' + 52;
		if (c == '+') return 62;
		if (c == '/') return 63;
		if (c == '=') return 0;
		return -1;
	}

	public static byte[] hexToByte(String hexString) {
		int len = hexString.length();
		byte[] ba = new byte[len / 2];
		for (int i = 0; i < len; i += 2) {
			ba[i / 2] = (byte) ((Character.digit(hexString.charAt(i), 16) << 4) + Character
					.digit(hexString.charAt(i + 1), 16));
		}
		return ba;
	}
	static final String HEXES = "0123456789ABCDEF";

	public static String byteToHex(byte[] raw) {
		if (raw == null) {
			return null;
		}
		final StringBuilder hex = new StringBuilder(2 * raw.length);
		for (final byte b : raw) {
			hex.append(HEXES.charAt((b & 0xF0) >> 4)).append(
					HEXES.charAt((b & 0x0F)));
		}
		return hex.toString();
	}
}