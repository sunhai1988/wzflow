package com.auto.modules.sys.bean;

import org.nutz.dao.entity.annotation.*;

/**
* @author 
* @time   2014-03-26 14:25:53
*/
@Table("sys_dict")
@TableIndexes({@Index(name = "INDEX_DKEY", fields = {"dkey"}, unique = false)})
public class Sys_dict 
{
	@Column
    @Name
	private String id;
	@Column
    @ColDefine(type = ColType.VARCHAR, width = 100)
    private String dkey;
	@Column
    @ColDefine(type = ColType.VARCHAR, width = 100)
    private String dval;
	@Column
    @ColDefine(type = ColType.VARCHAR, width = 100)
    private String txt;
	@Column
    @ColDefine(type = ColType.INT, width = 1)
    private int status;
	@Column
	private int location;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDkey()
	{
		return dkey;
	}
	public void setDkey(String dkey)
	{
		this.dkey=dkey;
	}
	public String getDval()
	{
		return dval;
	}
	public void setDval(String dval)
	{
		this.dval=dval;
	}
	public String getTxt()
	{
		return txt;
	}
	public void setTxt(String txt)
	{
		this.txt=txt;
	}
	public int getStatus()
	{
		return status;
	}
	public void setStatus(int status)
	{
		this.status=status;
	}
	public int getLocation()
	{
		return location;
	}
	public void setLocation(int location)
	{
		this.location=location;
	}

}