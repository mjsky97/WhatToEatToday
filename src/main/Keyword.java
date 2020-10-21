package main;

public class Keyword {
	public Liquor liquor;
	public Situation situation;
	public Fastfood fastfood;
	public Theme theme;
	
	public String Liquor_Category_List [] = {"����", "����", "���ɸ�", "��&��"};
	public String Situation_Category_List [] = {"ȸ��", "����Ʈ", "����(�Ұ���)", "������ �Ļ�", "������", "����³�"};
	public String Fastfood_Category_List [] = {"ġŲ", "�ܹ���", "����"};
	public String Theme_Category_List [] = {"����", "�ѽ�", "�߽�", "���", "�и�", "�н�"};
	
	public Keyword(int [] code_list) {
		liquor = new Liquor(code_list[0]);
		situation = new Situation(code_list[1]);
		fastfood = new Fastfood(code_list[2]);
		theme = new Theme(code_list[3]);
	}
	
}
