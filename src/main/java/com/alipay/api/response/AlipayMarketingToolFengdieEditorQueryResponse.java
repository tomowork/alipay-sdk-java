package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.editor.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-06 17:07:39
 */
public class AlipayMarketingToolFengdieEditorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1834992797797255386L;

	/** 
	 * 凤蝶编辑器访问地址，可通过iframe集成在后台系统，由系统用户编辑H5应用内容
	 */
	@ApiField("url")
	private String url;

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
