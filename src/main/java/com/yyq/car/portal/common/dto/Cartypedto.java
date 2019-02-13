/*******************************************************************************
 * Project   : car-common
 * Class Name: com.yyq.car.portal.common.dto.Cartypedto
 * Created By: wangzh 
 * Created on: 2017年11月23日 上午10:10:05
 * Copyright © 2013-2014 YYQ All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.dto;

import java.util.Date;


/**
 * <P>TODO</P>
 * @author wangzh
 */
public class Cartypedto {

	private Integer id;

	private String putaway;

	private Date putawaytime;

	private String brand;

	private String model;

	private String version;

	private String principal;// 指导价

	private String firstMonthPay;// 车辆价格

	private String everyMonthPay;// 每月月供

	private String rate;

	private String periodNum;

	private String downPay;// 0首期产品本金

	private String firstpay;// 首付

	private String coverPic;

	private String structure;

	private String lwh;

	private String engine;

	private String gearbox;

	private String driveT;

	private String fuelT;

	private String oilWear;

	private String color;

	private String wheelBase;

	private String frontSpan;

	private String rearSpan;

	private String minClearance;

	private String weight;

	private String doorNum;

	private String seatNum;

	private String fuelTankVol;

	private String trunkVol;

	private String engineT;

	private String displacement;

	private String inairType;

	private String airCylinderArr;

	private String airCyNum;

	private String airDoorsPerCy;

	private String cySpan;

	private String cyDistance;

	private String maxPower;

	private String maxWork;

	private String maxWorkRotate;

	private String maxTorque;

	private String maxTorqueRotate;

	private String engineSpecialTech;

	private String fuelFlag;

	private String supplyFuelT;

	private String cyCoverMaterial;

	private String cyTrunkMaterial;

	private String envirProtect;

	private String gearsNum;

	private String gearboxT;

	private String fourdrivet;

	private String centerdiffstru;

	private String frontframet;

	private String rearframet;

	private String assistpowert;

	private String trunkstruc;

	private String frontbraket;

	private String rearbraket;

	private String parkingbraket;

	private String frontwheelspe;

	private String rearwheelspe;

	private String readywheelspe;

	private String mainsafeair;

	private String sidesafeair;

	private String frontsideair;

	private String rearsizeair;

	private String frontheadair;

	private String rearheadair;

	private String kneeair;

	private String tireprescheck;

	private String zerotirepresdrive;

	private String safebeltnotice;

	private String isofix;

	private String enginestopsteal;

	private String insidecenterlock;

	private String controkey;

	private String startnokey;

	private String enternokey;

	private String antiblocking;

	private String brakeallot;

	private String brakeassist;

	private String pullcontrol;

	private String trunkholdcontrol;

	private String uphillassist;

	private String autoparking;

	private String steephillslow;

	private String changeframe;

	private String airframe;

	private String elecskywin;

	private String widewin;

	private String sportextend;

	private String lvhejintire;

	private String elecdoor;

	private String sideslidedoor;

	private String elecbackvan;

	private String feelbackvan;

	private String roofrack;

	private String realfursteering;

	private String steeringadjust;

	private String steeringeleca;

	private String multifunsteering;

	private String steeringshift;

	private String steeringhot;

	private String speednavigation;

	private String frontparkingradar;

	private String rearparkingradar;

	private String backvideo;

	private String drivedisplay;

	private String liquiddisplay;

	private String seatmatieral;

	private String seatadjust;

	private String waistadjust;

	private String shoulderadjust;

	private String mainseateleca;

	private String assistsearteleca;

	private String rearseateleca;

	private String frontseathot;

	private String rearsearthot;

	private String frontseartwind;

	private String rearseatwind;

	private String gpsnavisys;

	private String centercolorfulscreen;

	private String bluephone;

	private String soundinterface;

	private String multimediasys;

	private String loudspeakernum;

	private String headlight;

	private String farlight;

	private String daylight;

	private String autolight;

	private String autoheadlight;

	private String turnassistlight;

	private String turnlight;

	private String frontfoglight;

	private String biglighta;

	private String biglightclean;

	private String frontelecwin;

	private String rearelecwin;

	private String winprevhand;

	private String rearvieweleca;

	private String rearviewhot;

	private String inrearviewpreveye;

	private String outrearviewpreveye;

	private String rearviewelecfold;

	private String sunmakeupmirror;

	private String rearrainbrush;

	private String feelrarnbrush;

	private String airconditioncontrolt;

	private String rearindependentac;

	private String rearoutwindport;

	private String tempercontrol;

	private String airadjust;

	private String icebox;

	private String autoparkingposi;

	private String enginestartshoptech;

	private String asyassist;

	private String roadwrongsys;

	private String selfbrakesys;

	private String selfturnsys;

	private String nightseesys;

	private String liquidbypage;

	private String autonavi;

	private String allcamera;

	private Date createtime;

	private String oneMonthPay;
	private String thirteenthMonthPay;
	private String fourteenthMonthPay;
	private String finalPayment;

	public String getOneMonthPay() {
		return oneMonthPay;
	}

	public void setOneMonthPay(String oneMonthPay) {
		this.oneMonthPay = oneMonthPay == null ? "" : oneMonthPay;
	}

	public String getThirteenthMonthPay() {
		return thirteenthMonthPay;
	}

	public void setThirteenthMonthPay(String thirteenthMonthPay) {
		this.thirteenthMonthPay = thirteenthMonthPay == null ? "" : thirteenthMonthPay;
	}

	public String getFourteenthMonthPay() {
		return fourteenthMonthPay;
	}

	public void setFourteenthMonthPay(String fourteenthMonthPay) {
		this.fourteenthMonthPay = fourteenthMonthPay == null ? "" : fourteenthMonthPay;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPutaway() {
		return putaway;
	}

	public void setPutaway(String putaway) {
		this.putaway = putaway == null ? "" : putaway;
	}

	public Date getPutawaytime() {
		return putawaytime;
	}

	public void setPutawaytime(Date putawaytime) {
		this.putawaytime = putawaytime;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand == null ? "" : brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model == null ? "" : model;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version == null ? "" : version;
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate == null ? "" : rate;
	}

	public String getDownPay() {
		return downPay;
	}

	public void setDownPay(String downPay) {
		this.downPay = downPay == null ? "" : downPay;
	}

	public String getCoverPic() {
		return coverPic;
	}

	public void setCoverPic(String coverPic) {
		this.coverPic = coverPic == null ? "" : coverPic;
	}

	public String getStructure() {
		return structure;
	}

	public void setStructure(String structure) {
		this.structure = structure == null ? "" : structure;
	}

	public String getLwh() {
		return lwh;
	}

	public void setLwh(String lwh) {
		this.lwh = lwh == null ? "" : lwh;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine == null ? "" : engine;
	}

	public String getGearbox() {
		return gearbox;
	}

	public void setGearbox(String gearbox) {
		this.gearbox = gearbox == null ? "" : gearbox;
	}

	public String getDriveT() {
		return driveT;
	}

	public void setDriveT(String driveT) {
		this.driveT = driveT == null ? "" : driveT;
	}

	public String getFuelT() {
		return fuelT;
	}

	public void setFuelT(String fuelT) {
		this.fuelT = fuelT == null ? "" : fuelT;
	}

	public String getOilWear() {
		return oilWear;
	}

	public void setOilWear(String oilWear) {
		this.oilWear = oilWear == null ? "" : oilWear;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color == null ? "" : color;
	}

	public String getWheelBase() {
		return wheelBase;
	}

	public void setWheelBase(String wheelBase) {
		this.wheelBase = wheelBase == null ? "" : wheelBase;
	}

	public String getFrontSpan() {
		return frontSpan;
	}

	public void setFrontSpan(String frontSpan) {
		this.frontSpan = frontSpan == null ? "" : frontSpan;
	}

	public String getRearSpan() {
		return rearSpan;
	}

	public void setRearSpan(String rearSpan) {
		this.rearSpan = rearSpan == null ? "" : rearSpan;
	}

	public String getMinClearance() {
		return minClearance;
	}

	public void setMinClearance(String minClearance) {
		this.minClearance = minClearance == null ? "" : minClearance;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight == null ? "" : weight;
	}

	public String getTrunkVol() {
		return trunkVol;
	}

	public void setTrunkVol(String trunkVol) {
		this.trunkVol = trunkVol == null ? "" : trunkVol;
	}

	public String getEngineT() {
		return engineT;
	}

	public void setEngineT(String engineT) {
		this.engineT = engineT == null ? "" : engineT;
	}

	public String getDisplacement() {
		return displacement;
	}

	public void setDisplacement(String displacement) {
		this.displacement = displacement == null ? "" : displacement;
	}

	public String getInairType() {
		return inairType;
	}

	public void setInairType(String inairType) {
		this.inairType = inairType == null ? "" : inairType;
	}

	public String getAirCylinderArr() {
		return airCylinderArr;
	}

	public void setAirCylinderArr(String airCylinderArr) {
		this.airCylinderArr = airCylinderArr == null ? "" : airCylinderArr;
	}

	public String getAirCyNum() {
		return airCyNum;
	}

	public void setAirCyNum(String airCyNum) {
		this.airCyNum = airCyNum == null ? "" : airCyNum;
	}

	public String getAirDoorsPerCy() {
		return airDoorsPerCy;
	}

	public void setAirDoorsPerCy(String airDoorsPerCy) {
		this.airDoorsPerCy = airDoorsPerCy == null ? "" : airDoorsPerCy;
	}

	public String getCySpan() {
		return cySpan;
	}

	public void setCySpan(String cySpan) {
		this.cySpan = cySpan == null ? "" : cySpan;
	}

	public String getCyDistance() {
		return cyDistance;
	}

	public void setCyDistance(String cyDistance) {
		this.cyDistance = cyDistance == null ? "" : cyDistance;
	}

	public String getMaxPower() {
		return maxPower;
	}

	public void setMaxPower(String maxPower) {
		this.maxPower = maxPower == null ? "" : maxPower;
	}

	public String getMaxWork() {
		return maxWork;
	}

	public void setMaxWork(String maxWork) {
		this.maxWork = maxWork == null ? "" : maxWork;
	}

	public String getMaxWorkRotate() {
		return maxWorkRotate;
	}

	public void setMaxWorkRotate(String maxWorkRotate) {
		this.maxWorkRotate = maxWorkRotate == null ? "" : maxWorkRotate;
	}

	public String getMaxTorque() {
		return maxTorque;
	}

	public void setMaxTorque(String maxTorque) {
		this.maxTorque = maxTorque == null ? "" : maxTorque;
	}

	public String getMaxTorqueRotate() {
		return maxTorqueRotate;
	}

	public void setMaxTorqueRotate(String maxTorqueRotate) {
		this.maxTorqueRotate = maxTorqueRotate == null ? "" : maxTorqueRotate;
	}

	public String getEngineSpecialTech() {
		return engineSpecialTech;
	}

	public void setEngineSpecialTech(String engineSpecialTech) {
		this.engineSpecialTech = engineSpecialTech == null ? "" : engineSpecialTech;
	}

	public String getFuelFlag() {
		return fuelFlag;
	}

	public void setFuelFlag(String fuelFlag) {
		this.fuelFlag = fuelFlag == null ? "" : fuelFlag;
	}

	public String getSupplyFuelT() {
		return supplyFuelT;
	}

	public void setSupplyFuelT(String supplyFuelT) {
		this.supplyFuelT = supplyFuelT == null ? "" : supplyFuelT;
	}

	public String getCyCoverMaterial() {
		return cyCoverMaterial;
	}

	public void setCyCoverMaterial(String cyCoverMaterial) {
		this.cyCoverMaterial = cyCoverMaterial == null ? "" : cyCoverMaterial;
	}

	public String getCyTrunkMaterial() {
		return cyTrunkMaterial;
	}

	public void setCyTrunkMaterial(String cyTrunkMaterial) {
		this.cyTrunkMaterial = cyTrunkMaterial == null ? "" : cyTrunkMaterial;
	}

	public String getEnvirProtect() {
		return envirProtect;
	}

	public void setEnvirProtect(String envirProtect) {
		this.envirProtect = envirProtect == null ? "" : envirProtect;
	}

	public String getGearboxT() {
		return gearboxT;
	}

	public void setGearboxT(String gearboxT) {
		this.gearboxT = gearboxT == null ? "" : gearboxT;
	}

	public String getFourdrivet() {
		return fourdrivet;
	}

	public void setFourdrivet(String fourdrivet) {
		this.fourdrivet = fourdrivet == null ? "" : fourdrivet;
	}

	public String getCenterdiffstru() {
		return centerdiffstru;
	}

	public void setCenterdiffstru(String centerdiffstru) {
		this.centerdiffstru = centerdiffstru == null ? "" : centerdiffstru;
	}

	public String getFrontframet() {
		return frontframet;
	}

	public void setFrontframet(String frontframet) {
		this.frontframet = frontframet == null ? "" : frontframet;
	}

	public String getRearframet() {
		return rearframet;
	}

	public void setRearframet(String rearframet) {
		this.rearframet = rearframet == null ? "" : rearframet;
	}

	public String getAssistpowert() {
		return assistpowert;
	}

	public void setAssistpowert(String assistpowert) {
		this.assistpowert = assistpowert == null ? "" : assistpowert;
	}

	public String getTrunkstruc() {
		return trunkstruc;
	}

	public void setTrunkstruc(String trunkstruc) {
		this.trunkstruc = trunkstruc == null ? "" : trunkstruc;
	}

	public String getFrontbraket() {
		return frontbraket;
	}

	public void setFrontbraket(String frontbraket) {
		this.frontbraket = frontbraket == null ? "" : frontbraket;
	}

	public String getRearbraket() {
		return rearbraket;
	}

	public void setRearbraket(String rearbraket) {
		this.rearbraket = rearbraket == null ? "" : rearbraket;
	}

	public String getParkingbraket() {
		return parkingbraket;
	}

	public void setParkingbraket(String parkingbraket) {
		this.parkingbraket = parkingbraket == null ? "" : parkingbraket;
	}

	public String getFrontwheelspe() {
		return frontwheelspe;
	}

	public void setFrontwheelspe(String frontwheelspe) {
		this.frontwheelspe = frontwheelspe == null ? "" : frontwheelspe;
	}

	public String getRearwheelspe() {
		return rearwheelspe;
	}

	public void setRearwheelspe(String rearwheelspe) {
		this.rearwheelspe = rearwheelspe == null ? "" : rearwheelspe;
	}

	public String getReadywheelspe() {
		return readywheelspe;
	}

	public void setReadywheelspe(String readywheelspe) {
		this.readywheelspe = readywheelspe == null ? "" : readywheelspe;
	}

	public String getMainsafeair() {
		return mainsafeair;
	}

	public void setMainsafeair(String mainsafeair) {
		this.mainsafeair = mainsafeair == null ? "" : mainsafeair;
	}

	public String getSidesafeair() {
		return sidesafeair;
	}

	public void setSidesafeair(String sidesafeair) {
		this.sidesafeair = sidesafeair == null ? "" : sidesafeair;
	}

	public String getFrontsideair() {
		return frontsideair;
	}

	public void setFrontsideair(String frontsideair) {
		this.frontsideair = frontsideair == null ? "" : frontsideair;
	}

	public String getRearsizeair() {
		return rearsizeair;
	}

	public void setRearsizeair(String rearsizeair) {
		this.rearsizeair = rearsizeair == null ? "" : rearsizeair;
	}

	public String getFrontheadair() {
		return frontheadair;
	}

	public void setFrontheadair(String frontheadair) {
		this.frontheadair = frontheadair == null ? "" : frontheadair;
	}

	public String getRearheadair() {
		return rearheadair;
	}

	public void setRearheadair(String rearheadair) {
		this.rearheadair = rearheadair == null ? "" : rearheadair;
	}

	public String getKneeair() {
		return kneeair;
	}

	public void setKneeair(String kneeair) {
		this.kneeair = kneeair == null ? "" : kneeair;
	}

	public String getTireprescheck() {
		return tireprescheck;
	}

	public void setTireprescheck(String tireprescheck) {
		this.tireprescheck = tireprescheck == null ? "" : tireprescheck;
	}

	public String getZerotirepresdrive() {
		return zerotirepresdrive;
	}

	public void setZerotirepresdrive(String zerotirepresdrive) {
		this.zerotirepresdrive = zerotirepresdrive == null ? "" : zerotirepresdrive;
	}

	public String getSafebeltnotice() {
		return safebeltnotice;
	}

	public void setSafebeltnotice(String safebeltnotice) {
		this.safebeltnotice = safebeltnotice == null ? "" : safebeltnotice;
	}

	public String getIsofix() {
		return isofix;
	}

	public void setIsofix(String isofix) {
		this.isofix = isofix == null ? "" : isofix;
	}

	public String getEnginestopsteal() {
		return enginestopsteal;
	}

	public void setEnginestopsteal(String enginestopsteal) {
		this.enginestopsteal = enginestopsteal == null ? "" : enginestopsteal;
	}

	public String getInsidecenterlock() {
		return insidecenterlock;
	}

	public void setInsidecenterlock(String insidecenterlock) {
		this.insidecenterlock = insidecenterlock == null ? "" : insidecenterlock;
	}

	public String getControkey() {
		return controkey;
	}

	public void setControkey(String controkey) {
		this.controkey = controkey == null ? "" : controkey;
	}

	public String getStartnokey() {
		return startnokey;
	}

	public void setStartnokey(String startnokey) {
		this.startnokey = startnokey == null ? "" : startnokey;
	}

	public String getEnternokey() {
		return enternokey;
	}

	public void setEnternokey(String enternokey) {
		this.enternokey = enternokey == null ? "" : enternokey;
	}

	public String getAntiblocking() {
		return antiblocking;
	}

	public void setAntiblocking(String antiblocking) {
		this.antiblocking = antiblocking == null ? "" : antiblocking;
	}

	public String getBrakeallot() {
		return brakeallot;
	}

	public void setBrakeallot(String brakeallot) {
		this.brakeallot = brakeallot == null ? "" : brakeallot;
	}

	public String getBrakeassist() {
		return brakeassist;
	}

	public void setBrakeassist(String brakeassist) {
		this.brakeassist = brakeassist == null ? "" : brakeassist;
	}

	public String getPullcontrol() {
		return pullcontrol;
	}

	public void setPullcontrol(String pullcontrol) {
		this.pullcontrol = pullcontrol == null ? "" : pullcontrol;
	}

	public String getTrunkholdcontrol() {
		return trunkholdcontrol;
	}

	public void setTrunkholdcontrol(String trunkholdcontrol) {
		this.trunkholdcontrol = trunkholdcontrol == null ? "" : trunkholdcontrol;
	}

	public String getUphillassist() {
		return uphillassist;
	}

	public void setUphillassist(String uphillassist) {
		this.uphillassist = uphillassist == null ? "" : uphillassist;
	}

	public String getAutoparking() {
		return autoparking;
	}

	public void setAutoparking(String autoparking) {
		this.autoparking = autoparking == null ? "" : autoparking;
	}

	public String getSteephillslow() {
		return steephillslow;
	}

	public void setSteephillslow(String steephillslow) {
		this.steephillslow = steephillslow == null ? "" : steephillslow;
	}

	public String getChangeframe() {
		return changeframe;
	}

	public void setChangeframe(String changeframe) {
		this.changeframe = changeframe == null ? "" : changeframe;
	}

	public String getAirframe() {
		return airframe;
	}

	public void setAirframe(String airframe) {
		this.airframe = airframe == null ? "" : airframe;
	}

	public String getElecskywin() {
		return elecskywin;
	}

	public void setElecskywin(String elecskywin) {
		this.elecskywin = elecskywin == null ? "" : elecskywin;
	}

	public String getWidewin() {
		return widewin;
	}

	public void setWidewin(String widewin) {
		this.widewin = widewin == null ? "" : widewin;
	}

	public String getSportextend() {
		return sportextend;
	}

	public void setSportextend(String sportextend) {
		this.sportextend = sportextend == null ? "" : sportextend;
	}

	public String getLvhejintire() {
		return lvhejintire;
	}

	public void setLvhejintire(String lvhejintire) {
		this.lvhejintire = lvhejintire == null ? "" : lvhejintire;
	}

	public String getElecdoor() {
		return elecdoor;
	}

	public void setElecdoor(String elecdoor) {
		this.elecdoor = elecdoor == null ? "" : elecdoor;
	}

	public String getSideslidedoor() {
		return sideslidedoor;
	}

	public void setSideslidedoor(String sideslidedoor) {
		this.sideslidedoor = sideslidedoor == null ? "" : sideslidedoor;
	}

	public String getElecbackvan() {
		return elecbackvan;
	}

	public void setElecbackvan(String elecbackvan) {
		this.elecbackvan = elecbackvan == null ? "" : elecbackvan;
	}

	public String getFeelbackvan() {
		return feelbackvan;
	}

	public void setFeelbackvan(String feelbackvan) {
		this.feelbackvan = feelbackvan == null ? "" : feelbackvan;
	}

	public String getRoofrack() {
		return roofrack;
	}

	public void setRoofrack(String roofrack) {
		this.roofrack = roofrack == null ? "" : roofrack;
	}

	public String getRealfursteering() {
		return realfursteering;
	}

	public void setRealfursteering(String realfursteering) {
		this.realfursteering = realfursteering == null ? "" : realfursteering;
	}

	public String getSteeringadjust() {
		return steeringadjust;
	}

	public void setSteeringadjust(String steeringadjust) {
		this.steeringadjust = steeringadjust == null ? "" : steeringadjust;
	}

	public String getSteeringeleca() {
		return steeringeleca;
	}

	public void setSteeringeleca(String steeringeleca) {
		this.steeringeleca = steeringeleca == null ? "" : steeringeleca;
	}

	public String getMultifunsteering() {
		return multifunsteering;
	}

	public void setMultifunsteering(String multifunsteering) {
		this.multifunsteering = multifunsteering == null ? "" : multifunsteering;
	}

	public String getSteeringshift() {
		return steeringshift;
	}

	public void setSteeringshift(String steeringshift) {
		this.steeringshift = steeringshift == null ? "" : steeringshift;
	}

	public String getSteeringhot() {
		return steeringhot;
	}

	public void setSteeringhot(String steeringhot) {
		this.steeringhot = steeringhot == null ? "" : steeringhot;
	}

	public String getSpeednavigation() {
		return speednavigation;
	}

	public void setSpeednavigation(String speednavigation) {
		this.speednavigation = speednavigation == null ? "" : speednavigation;
	}

	public String getFrontparkingradar() {
		return frontparkingradar;
	}

	public void setFrontparkingradar(String frontparkingradar) {
		this.frontparkingradar = frontparkingradar == null ? "" : frontparkingradar;
	}

	public String getRearparkingradar() {
		return rearparkingradar;
	}

	public void setRearparkingradar(String rearparkingradar) {
		this.rearparkingradar = rearparkingradar == null ? "" : rearparkingradar;
	}

	public String getBackvideo() {
		return backvideo;
	}

	public void setBackvideo(String backvideo) {
		this.backvideo = backvideo == null ? "" : backvideo;
	}

	public String getDrivedisplay() {
		return drivedisplay;
	}

	public void setDrivedisplay(String drivedisplay) {
		this.drivedisplay = drivedisplay == null ? "" : drivedisplay;
	}

	public String getLiquiddisplay() {
		return liquiddisplay;
	}

	public void setLiquiddisplay(String liquiddisplay) {
		this.liquiddisplay = liquiddisplay == null ? "" : liquiddisplay;
	}

	public String getSeatmatieral() {
		return seatmatieral;
	}

	public void setSeatmatieral(String seatmatieral) {
		this.seatmatieral = seatmatieral == null ? "" : seatmatieral;
	}

	public String getSeatadjust() {
		return seatadjust;
	}

	public void setSeatadjust(String seatadjust) {
		this.seatadjust = seatadjust == null ? "" : seatadjust;
	}

	public String getWaistadjust() {
		return waistadjust;
	}

	public void setWaistadjust(String waistadjust) {
		this.waistadjust = waistadjust == null ? "" : waistadjust;
	}

	public String getShoulderadjust() {
		return shoulderadjust;
	}

	public void setShoulderadjust(String shoulderadjust) {
		this.shoulderadjust = shoulderadjust == null ? "" : shoulderadjust;
	}

	public String getMainseateleca() {
		return mainseateleca;
	}

	public void setMainseateleca(String mainseateleca) {
		this.mainseateleca = mainseateleca == null ? "" : mainseateleca;
	}

	public String getAssistsearteleca() {
		return assistsearteleca;
	}

	public void setAssistsearteleca(String assistsearteleca) {
		this.assistsearteleca = assistsearteleca == null ? "" : assistsearteleca;
	}

	public String getRearseateleca() {
		return rearseateleca;
	}

	public void setRearseateleca(String rearseateleca) {
		this.rearseateleca = rearseateleca == null ? "" : rearseateleca;
	}

	public String getFrontseathot() {
		return frontseathot;
	}

	public void setFrontseathot(String frontseathot) {
		this.frontseathot = frontseathot == null ? "" : frontseathot;
	}

	public String getRearsearthot() {
		return rearsearthot;
	}

	public void setRearsearthot(String rearsearthot) {
		this.rearsearthot = rearsearthot == null ? "" : rearsearthot;
	}

	public String getFrontseartwind() {
		return frontseartwind;
	}

	public void setFrontseartwind(String frontseartwind) {
		this.frontseartwind = frontseartwind == null ? "" : frontseartwind;
	}

	public String getRearseatwind() {
		return rearseatwind;
	}

	public void setRearseatwind(String rearseatwind) {
		this.rearseatwind = rearseatwind == null ? "" : rearseatwind;
	}

	public String getGpsnavisys() {
		return gpsnavisys;
	}

	public void setGpsnavisys(String gpsnavisys) {
		this.gpsnavisys = gpsnavisys == null ? "" : gpsnavisys;
	}

	public String getCentercolorfulscreen() {
		return centercolorfulscreen;
	}

	public void setCentercolorfulscreen(String centercolorfulscreen) {
		this.centercolorfulscreen = centercolorfulscreen == null ? "" : centercolorfulscreen;
	}

	public String getBluephone() {
		return bluephone;
	}

	public void setBluephone(String bluephone) {
		this.bluephone = bluephone == null ? "" : bluephone;
	}

	public String getSoundinterface() {
		return soundinterface;
	}

	public void setSoundinterface(String soundinterface) {
		this.soundinterface = soundinterface == null ? "" : soundinterface;
	}

	public String getMultimediasys() {
		return multimediasys;
	}

	public void setMultimediasys(String multimediasys) {
		this.multimediasys = multimediasys == null ? "" : multimediasys;
	}

	public String getLoudspeakernum() {
		return loudspeakernum;
	}

	public void setLoudspeakernum(String loudspeakernum) {
		this.loudspeakernum = loudspeakernum == null ? "" : loudspeakernum;
	}

	public String getHeadlight() {
		return headlight;
	}

	public void setHeadlight(String headlight) {
		this.headlight = headlight == null ? "" : headlight;
	}

	public String getFarlight() {
		return farlight;
	}

	public void setFarlight(String farlight) {
		this.farlight = farlight == null ? "" : farlight;
	}

	public String getDaylight() {
		return daylight;
	}

	public void setDaylight(String daylight) {
		this.daylight = daylight == null ? "" : daylight;
	}

	public String getAutolight() {
		return autolight;
	}

	public void setAutolight(String autolight) {
		this.autolight = autolight == null ? "" : autolight;
	}

	public String getAutoheadlight() {
		return autoheadlight;
	}

	public void setAutoheadlight(String autoheadlight) {
		this.autoheadlight = autoheadlight == null ? "" : autoheadlight;
	}

	public String getTurnassistlight() {
		return turnassistlight;
	}

	public void setTurnassistlight(String turnassistlight) {
		this.turnassistlight = turnassistlight == null ? "" : turnassistlight;
	}

	public String getTurnlight() {
		return turnlight;
	}

	public void setTurnlight(String turnlight) {
		this.turnlight = turnlight == null ? "" : turnlight;
	}

	public String getFrontfoglight() {
		return frontfoglight;
	}

	public void setFrontfoglight(String frontfoglight) {
		this.frontfoglight = frontfoglight == null ? "" : frontfoglight;
	}

	public String getBiglighta() {
		return biglighta;
	}

	public void setBiglighta(String biglighta) {
		this.biglighta = biglighta == null ? "" : biglighta;
	}

	public String getBiglightclean() {
		return biglightclean;
	}

	public void setBiglightclean(String biglightclean) {
		this.biglightclean = biglightclean == null ? "" : biglightclean;
	}

	public String getFrontelecwin() {
		return frontelecwin;
	}

	public void setFrontelecwin(String frontelecwin) {
		this.frontelecwin = frontelecwin == null ? "" : frontelecwin;
	}

	public String getRearelecwin() {
		return rearelecwin;
	}

	public void setRearelecwin(String rearelecwin) {
		this.rearelecwin = rearelecwin == null ? "" : rearelecwin;
	}

	public String getWinprevhand() {
		return winprevhand;
	}

	public void setWinprevhand(String winprevhand) {
		this.winprevhand = winprevhand == null ? "" : winprevhand;
	}

	public String getRearvieweleca() {
		return rearvieweleca;
	}

	public void setRearvieweleca(String rearvieweleca) {
		this.rearvieweleca = rearvieweleca == null ? "" : rearvieweleca;
	}

	public String getRearviewhot() {
		return rearviewhot;
	}

	public void setRearviewhot(String rearviewhot) {
		this.rearviewhot = rearviewhot == null ? "" : rearviewhot;
	}

	public String getInrearviewpreveye() {
		return inrearviewpreveye;
	}

	public void setInrearviewpreveye(String inrearviewpreveye) {
		this.inrearviewpreveye = inrearviewpreveye == null ? "" : inrearviewpreveye;
	}

	public String getOutrearviewpreveye() {
		return outrearviewpreveye;
	}

	public void setOutrearviewpreveye(String outrearviewpreveye) {
		this.outrearviewpreveye = outrearviewpreveye == null ? "" : outrearviewpreveye;
	}

	public String getRearviewelecfold() {
		return rearviewelecfold;
	}

	public void setRearviewelecfold(String rearviewelecfold) {
		this.rearviewelecfold = rearviewelecfold == null ? "" : rearviewelecfold;
	}

	public String getSunmakeupmirror() {
		return sunmakeupmirror;
	}

	public void setSunmakeupmirror(String sunmakeupmirror) {
		this.sunmakeupmirror = sunmakeupmirror == null ? "" : sunmakeupmirror;
	}

	public String getRearrainbrush() {
		return rearrainbrush;
	}

	public void setRearrainbrush(String rearrainbrush) {
		this.rearrainbrush = rearrainbrush == null ? "" : rearrainbrush;
	}

	public String getFeelrarnbrush() {
		return feelrarnbrush;
	}

	public void setFeelrarnbrush(String feelrarnbrush) {
		this.feelrarnbrush = feelrarnbrush == null ? "" : feelrarnbrush;
	}

	public String getAirconditioncontrolt() {
		return airconditioncontrolt;
	}

	public void setAirconditioncontrolt(String airconditioncontrolt) {
		this.airconditioncontrolt = airconditioncontrolt == null ? "" : airconditioncontrolt;
	}

	public String getRearindependentac() {
		return rearindependentac;
	}

	public void setRearindependentac(String rearindependentac) {
		this.rearindependentac = rearindependentac == null ? "" : rearindependentac;
	}

	public String getRearoutwindport() {
		return rearoutwindport;
	}

	public void setRearoutwindport(String rearoutwindport) {
		this.rearoutwindport = rearoutwindport == null ? "" : rearoutwindport;
	}

	public String getTempercontrol() {
		return tempercontrol;
	}

	public void setTempercontrol(String tempercontrol) {
		this.tempercontrol = tempercontrol == null ? "" : tempercontrol;
	}

	public String getAiradjust() {
		return airadjust;
	}

	public void setAiradjust(String airadjust) {
		this.airadjust = airadjust == null ? "" : airadjust;
	}

	public String getIcebox() {
		return icebox;
	}

	public void setIcebox(String icebox) {
		this.icebox = icebox == null ? "" : icebox;
	}

	public String getAutoparkingposi() {
		return autoparkingposi;
	}

	public void setAutoparkingposi(String autoparkingposi) {
		this.autoparkingposi = autoparkingposi == null ? "" : autoparkingposi;
	}

	public String getEnginestartshoptech() {
		return enginestartshoptech;
	}

	public void setEnginestartshoptech(String enginestartshoptech) {
		this.enginestartshoptech = enginestartshoptech == null ? "" : enginestartshoptech;
	}

	public String getAsyassist() {
		return asyassist;
	}

	public void setAsyassist(String asyassist) {
		this.asyassist = asyassist == null ? "" : asyassist;
	}

	public String getRoadwrongsys() {
		return roadwrongsys;
	}

	public void setRoadwrongsys(String roadwrongsys) {
		this.roadwrongsys = roadwrongsys == null ? "" : roadwrongsys;
	}

	public String getSelfbrakesys() {
		return selfbrakesys;
	}

	public void setSelfbrakesys(String selfbrakesys) {
		this.selfbrakesys = selfbrakesys == null ? "" : selfbrakesys;
	}

	public String getSelfturnsys() {
		return selfturnsys;
	}

	public void setSelfturnsys(String selfturnsys) {
		this.selfturnsys = selfturnsys == null ? "" : selfturnsys;
	}

	public String getNightseesys() {
		return nightseesys;
	}

	public void setNightseesys(String nightseesys) {
		this.nightseesys = nightseesys == null ? "" : nightseesys;
	}

	public String getLiquidbypage() {
		return liquidbypage;
	}

	public void setLiquidbypage(String liquidbypage) {
		this.liquidbypage = liquidbypage == null ? "" : liquidbypage;
	}

	public String getAutonavi() {
		return autonavi;
	}

	public void setAutonavi(String autonavi) {
		this.autonavi = autonavi == null ? "" : autonavi;
	}

	public String getAllcamera() {
		return allcamera;
	}

	public void setAllcamera(String allcamera) {
		this.allcamera = allcamera == null ? "" : allcamera;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getFirstpay() {
		return firstpay;
	}

	public void setFirstpay(String firstpay) {
		this.firstpay = firstpay == null ? "" : firstpay;
	}

	public String getFirstMonthPay() {
		return firstMonthPay;
	}

	public void setFirstMonthPay(String firstMonthPay) {
		this.firstMonthPay = firstMonthPay == null ? "" : firstMonthPay;
	}

	public String getEveryMonthPay() {
		return everyMonthPay;
	}

	public void setEveryMonthPay(String everyMonthPay) {
		this.everyMonthPay = everyMonthPay == null ? "" : everyMonthPay;
	}

	public String getPeriodNum() {
		return periodNum;
	}

	public void setPeriodNum(String periodNum) {
		this.periodNum = periodNum == null ? "" : periodNum;
	}

	public String getDoorNum() {
		return doorNum;
	}

	public void setDoorNum(String doorNum) {
		this.doorNum = doorNum == null ? "" : doorNum;
	}

	public String getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum == null ? "" : seatNum;
	}

	public String getFuelTankVol() {
		return fuelTankVol;
	}

	public void setFuelTankVol(String fuelTankVol) {
		this.fuelTankVol = fuelTankVol == null ? "" : fuelTankVol;
	}

	public String getGearsNum() {
		return gearsNum;
	}

	public void setGearsNum(String gearsNum) {
		this.gearsNum = gearsNum == null ? "" : gearsNum;
	}

	public String getFinalPayment() {
		return finalPayment;
	}

	public void setFinalPayment(String finalPayment) {
		this.finalPayment = finalPayment == null ? "" : finalPayment;
	}
}
