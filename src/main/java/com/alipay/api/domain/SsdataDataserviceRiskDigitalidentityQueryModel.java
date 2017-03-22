package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚁盾设备指纹
 *
 * @author auto create
 * @since 1.0, 2017-02-28 11:04:32
 */
public class SsdataDataserviceRiskDigitalidentityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1757478288571282331L;

	/**
	 * 服务端生成的设备码
	 */
	@ApiField("device_code")
	private String deviceCode;

	public String getDeviceCode() {
		return this.deviceCode;
	}
	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
	}

}
