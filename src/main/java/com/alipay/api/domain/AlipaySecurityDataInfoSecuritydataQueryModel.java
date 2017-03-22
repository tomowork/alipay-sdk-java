package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝风控数据查询接口
 *
 * @author auto create
 * @since 1.0, 2017-02-15 10:17:57
 */
public class AlipaySecurityDataInfoSecuritydataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8336428269226484774L;

	/**
	 * 业务代码,描述数据查询所属的具体业务模块.例如黑名单业务,地理信息数据.
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 扩展参数,用于业务扩展入参,格式为json.注意由于嵌套在入参json中,引号需要转义,详见入参样式.
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * 查询的主体值,例如身份证号: "210100197210019087",支持单个或者多个,多个以逗号分隔.
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 系统维度,系统名 , 例如: MS0001  MS表示民生银行, 0001表示民生银行的内部需求方代码,当民生银行有多个部门需要划分时,可以有MS0002, MS0003
	 */
	@ApiField("system_name")
	private String systemName;

	/**
	 * 查询参数类型,以黑名单业务为例:
bank_card_no,银行卡号、
cert_no,身份证号码、
business_license_no,营业执照号码、
company_name, 公司名称，
phone,预留手机号
	 */
	@ApiField("type")
	private String type;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getExt() {
		return this.ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSystemName() {
		return this.systemName;
	}
	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
