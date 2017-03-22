package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 奖品剩余数量查询
 *
 * @author auto create
 * @since 1.0, 2017-03-03 16:45:25
 */
public class AlipayMarketingCampaignPrizeAmountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2415588591345441285L;

	/**
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 奖品id
	 */
	@ApiField("prize_id")
	private String prizeId;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

}
