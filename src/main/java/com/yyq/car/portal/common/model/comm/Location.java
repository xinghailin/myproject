package com.yyq.car.portal.common.model.comm;

public class Location {
    private Integer id;

    private String type;

    private String name;

    private Integer parent;

    private Integer status;
    
    private Integer isDirectly;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    
    

    public Integer getIsDirectly() {
		return isDirectly;
	}

	public void setIsDirectly(Integer isDirectly) {
		this.isDirectly = isDirectly;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", name=").append(name);
        sb.append(", parent=").append(parent);
        sb.append(", status=").append(status);
        sb.append(", isDirectly=").append(isDirectly);
        sb.append("]");
        return sb.toString();
    }
}