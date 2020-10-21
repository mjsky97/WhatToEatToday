package main;

import java.util.Map;

public class Restaurant {
	public String Res_name;
	public String Res_loca_URL;
	public Review[] review;
	public Keyword keyword;
	
	public void set_Res_name(String name) {}
	public void set_Res_loca_URL(String url) {}
	public void set_keyword(Map map) {}
	public Review get_review() {
		Review re = new Review();
		return re;
	}
}
