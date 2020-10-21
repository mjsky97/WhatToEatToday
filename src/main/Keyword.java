package main;

public class Keyword {
	public Liquor liquor;
	public Situation situation;
	public Fastfood fastfood;
	public Theme theme;
	
	public String Liquor_Category_List [] = {"소주", "맥주", "막걸리", "술&밥"};
	public String Situation_Category_List [] = {"회식", "데이트", "과팅(소개팅)", "간단한 식사", "가성비", "비오는날"};
	public String Fastfood_Category_List [] = {"치킨", "햄버거", "피자"};
	public String Theme_Category_List [] = {"국밥", "한식", "중식", "양식", "밀면", "분식"};
	
	public Keyword(int [] code_list) {
		liquor = new Liquor(code_list[0]);
		situation = new Situation(code_list[1]);
		fastfood = new Fastfood(code_list[2]);
		theme = new Theme(code_list[3]);
	}
	
}
