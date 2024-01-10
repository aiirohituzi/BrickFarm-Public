package com.brickfarm.vo.admin.kmh;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class AdminOrderMemberVO {
	
	private int member_no;
	private String member_grade_name;
	private String member_id;
	private String member_name;
	private String phone_number;
	private String email;
	private String birth_date;
	private String address;
	private Timestamp member_regist_date;
	private String gender;
	private int accrual_amount;
	private int sum_purchase_money;
	private int sum_order_count;
	private Timestamp order_day;
	
	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}
	public void setMember_grade_name(String member_grade_name) {
		this.member_grade_name = member_grade_name;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public void setMember_name(String member_name) {
		if(member_name.length() == 2) {
			this.member_name = member_name.substring(0, 1) + "*";
		} else {
			String name = member_name.substring(0, 1);	
			for (int i=0; i<member_name.length() -2; i++){
				name += "*";
			}
			name += member_name.substring(member_name.length() -1);
			this.member_name = name;
		}
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number.substring(0, phone_number.indexOf('-')+1) + "****" + phone_number.substring(phone_number.lastIndexOf("-"));
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}
	public void setAddress(String address) {
		String[] addrList = address.split(" ");
		this.address = addrList[0] + " " + addrList[1] + " " + addrList[2];
	}
	public void setMember_regist_date(Timestamp member_regist_date) {
		this.member_regist_date = member_regist_date;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAccrual_amount(int accrual_amount) {
		this.accrual_amount = accrual_amount;
	}
	public void setSum_purchase_money(int sum_purchase_money) {
		this.sum_purchase_money = sum_purchase_money;
	}
	public void setSum_order_count(int sum_order_count) {
		this.sum_order_count = sum_order_count;
	}
	public void setOrder_day(Timestamp order_day) {
		this.order_day = order_day;
	}

}
