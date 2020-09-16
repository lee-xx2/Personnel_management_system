package com.gdut.beans;
public class Existing_worksheet {
    private int no;
    private String depart_name;
    private String work_type;
    private int now_number;
    private String work;
    private int remain_number;
    
    public Existing_worksheet() {
		
	}

	public Existing_worksheet(int no, String depart_name, String work_type, int now_number, String work,
			int remain_number) {
		this.no = no;
		this.depart_name = depart_name;
		this.work_type = work_type;
		this.now_number = now_number;
		this.work = work;
		this.remain_number = remain_number;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getDepart_name() {
		return depart_name;
	}

	public void setDepart_name(String depart_name) {
		this.depart_name = depart_name;
	}

	public String getWork_type() {
		return work_type;
	}

	public void setWork_type(String work_type) {
		this.work_type = work_type;
	}

	public int getNow_number() {
		return now_number;
	}

	public void setNow_number(int now_number) {
		this.now_number = now_number;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public int getRemain_number() {
		return remain_number;
	}

	public void setRemain_number(int remain_number) {
		this.remain_number = remain_number;
	}

	@Override
	public String toString() {
		return "Existing_worksheet [no=" + no + ", depart_name=" + depart_name + ", work_type=" + work_type
				+ ", now_number=" + now_number + ", work=" + work + ", remain_number=" + remain_number + "]";
	} 
	
}
