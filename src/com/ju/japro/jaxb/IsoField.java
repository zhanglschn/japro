package com.ju.japro.jaxb;

import java.io.UnsupportedEncodingException;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

import com.ju.japro.jaxb.enums.IsoType;
import com.ju.japro.jaxb.utils.EncodeUtil;

@XmlAccessorType(XmlAccessType.FIELD)
public class IsoField implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	@XmlAttribute(name = "id", required = true)
	private String id;
	
	@XmlAttribute(name = "type", required = true)
	private String type;
	
	// 該屬性為字節長度
	@XmlAttribute(name = "length")
	private int length = 0;
	
	
	// 字符值的value
	private String value;
	
	// 字节数组值的value
	private byte[] byteValue;
	
	// 域类型
	private IsoType isoType;
	
	// 该域是否被使用
	private boolean checked = false;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public byte[] getByteValue() {
		return byteValue;
	}

	public void setByteValue(byte[] byteValue) throws UnsupportedEncodingException {
		this.byteValue = byteValue;
		this.checked = true;
		switch (this.getIsoType()) {
		case BINARY:
			this.value = EncodeUtil.binary(byteValue);
			break;
			
		}
	}

	public IsoType getIsoType() {
		if (this.isoType == null) {
			this.isoType = IsoType.valueOf(this.type);
		}
		return isoType;
	}

	public void setIsoType(IsoType isoType) {
		this.isoType = isoType;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}
}