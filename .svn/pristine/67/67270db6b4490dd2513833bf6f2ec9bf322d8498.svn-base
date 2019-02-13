/*******************************************************************************
 * Project   : portal-common
 * Class Name: com.yyq.cloud.portal.common.constant.FileTypeEnum
 * Created By: Jonathan 
 * Created on: 2014年12月9日 下午11:12:46
 * Copyright © 2013-2014 YYQ All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.constant;

/**
 * <P>TODO</P>
 * @author Jonathan
 */
public enum FileTypeEnum {
	BIZ(1, "商家"), PRODUCT(2, "商品"), SCENIC(3, "景点"), BANNER(4, "BANNER"), APP(5, "app图标"), AVATAR(6, "头像"), TASK(7, "任务"), BIZAREA(8, "商圈"), TRENDS(9, "动态"), RECOMMEND(
			10, "精选推荐图片"), RECOMMENDTYPE(11, "推荐类型图片"), PRODUCT_HOME(12, "样板房图片"), PRODCUT_PROS(13, "产品图片"), PRODUCT_ROOM(14, "样板房房间图片"), PRODUCT_HOUSE(15,
			"楼盘图片"), AUTH(16, "销售顾问实名认证"), CARIDENTIFY(17, "车辆证件"), VIDEO(18, "合同视频"), MODEL(19, "车型图片"), carClearanceOfGoodsFiles(20, "报关文件"), taxRefund(21,
			"退税文件"), jndcontract(22, "加拿大合同文件"), leasebackcontract(23, "融资租赁售后回租合同文件"), paymentRequest(24, "定金自采付款申请杂费文件"), newsalecontract(25, "新销售流程车辆销售合同"), newreportbill(
			26, "新销售报价单"), newdownpayposbill(27, "新销售定金pos单"), supplycar(25, "配车单展销协议文件"), riskapply(17, "风控申请表"), riskidentify(18, "风控身份证"), riskdriver(19,
			"风控驾驶证"), riskworkprove(20, "风控工作证明"), riskcreditreport(21, "风控征信报告"), riskpaycard(22, "风控工资卡"), riskflow(23, "风控流水"), riskhouse(24, "风控房产证"), riskmarriage(
			25, "风控结婚证"), riskensure(26, "风控担保人身份证"), riskapprovaltable(27, "风控消费贷贷审会审批表"), krcarbatchexcel(28, "库融批量导入excel保存目录"), wholesaleCarfile(29,
			"批发销售水单"), invoicerun(30, "开票营业执照"), invoiceflow(31, "开票银行流水/支付宝/微信流水截图"), invoicereplace(32, "开票代付款证明"), invoicereplaceid(33, "开票代付款人身份证正反面"), invoiceidentify(
			34, "开票身份证正反面"), riskcase(35, "立案的各种资料"), web_pic(36, "web网站图片"), web_model_pic(37, "web网站车型图片"), area_path(38, "地区图片"), areaBrand(39, "地区品牌"), carsource(
			38, "商城车源配置图片"), carsourcepic(38, "商城车源车辆图片"), contract_one(40, "申请盖章的合同"), contract_two(41, "甲方盖过章的合同"), contract_three(42, "乙方盖过章的合同");

	private Integer value;
	private String name;

	private FileTypeEnum(Integer value, String name) {
		this.value = value;
		this.name = name;
	}

	public static FileTypeEnum getFileType(Integer value) {
		for (FileTypeEnum e : FileTypeEnum.values()) {
			if (e.value.equals(value)) {
				return e;
			}
		}
		return null;
	}

	public Integer getValue() {
		return value;
	}

	public String getName() {
		return name;
	}
}
