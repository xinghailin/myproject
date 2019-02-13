package com.yyq.car.portal.common.model.biz;

public class BizBondsman {
    private Integer id;

    private Integer saleborrowid;

    private String bondsman;

    private String bmaddress;

    private String bmrunaddress;

    private String bmfaxes;

    private String bmphone;

    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSaleborrowid() {
        return saleborrowid;
    }

    public void setSaleborrowid(Integer saleborrowid) {
        this.saleborrowid = saleborrowid;
    }

    public String getBondsman() {
        return bondsman;
    }

    public void setBondsman(String bondsman) {
        this.bondsman = bondsman == null ? null : bondsman.trim();
    }

    public String getBmaddress() {
        return bmaddress;
    }

    public void setBmaddress(String bmaddress) {
        this.bmaddress = bmaddress == null ? null : bmaddress.trim();
    }

    public String getBmrunaddress() {
        return bmrunaddress;
    }

    public void setBmrunaddress(String bmrunaddress) {
        this.bmrunaddress = bmrunaddress == null ? null : bmrunaddress.trim();
    }

    public String getBmfaxes() {
        return bmfaxes;
    }

    public void setBmfaxes(String bmfaxes) {
        this.bmfaxes = bmfaxes == null ? null : bmfaxes.trim();
    }

    public String getBmphone() {
        return bmphone;
    }

    public void setBmphone(String bmphone) {
        this.bmphone = bmphone == null ? null : bmphone.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", saleborrowid=").append(saleborrowid);
        sb.append(", bondsman=").append(bondsman);
        sb.append(", bmaddress=").append(bmaddress);
        sb.append(", bmrunaddress=").append(bmrunaddress);
        sb.append(", bmfaxes=").append(bmfaxes);
        sb.append(", bmphone=").append(bmphone);
        sb.append(", type=").append(type);
        sb.append("]");
        return sb.toString();
    }
}