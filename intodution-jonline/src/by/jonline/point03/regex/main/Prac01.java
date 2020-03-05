package by.jonline.point03.regex.main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prac01 {

	public static void main(String args[]) {
		
		String text = "	От правильного питания, построенного на основе данных науки о\n"
				+ "питании, во многом зависят наше здоровье, профилактика заболеваний,\n"
				+ "продолжительность жизни.\r\n" + 
				"\r\n" + 
				"	Здоровое питание – древняя и мудрая наука, законы ее просты: разнообразие,\n"
				+ "сбалансированность, чувство меры. Мы едим больше, чем тратим энергии,\n"
				+ "поэтому всем необходимо повышать свою физическую активность, чтобы\n"
				+ "быть в гармонии с собой и природой!\r\n" + 
				"\r\n" + 
				"	Экспериментально доказано влияние питания на продолжительность жизни и\n"
				+ "долголетие. Условия долголетия сформулированы еще древними: меньше\n"
				+ "есть, больше двигаться, быть всегда в хорошем настроении.\r\n"
				+ "\r\n";
		
		Menu(text);
	}
	
	private static void Menu(String text) {
		
		Scanner s = new Scanner(System.in);
		int choose = -1;
		
		while(choose != 0) {
			
			System.out.println("Choose next option: ");
			System.out.println("  1. Sort paragraphs by number of sentences.");
			System.out.println("  2. Sort words by length in each sentence.");
			System.out.println("  3. Sort words by in a sentence by a character.");
			System.out.println("  4. Print text.");
			System.out.println("  0. Exit.");
			
			try {
				
				choose = s.nextInt();
			} catch(Exception e) {
				
				System.out.println("Invalid input.");
				s = new Scanner(System.in);
			}
			
			switch(choose) {
			
			case 0: {
				
				s.close();
			} break;
			case 1: {
				
				text = SortPara(text);
				System.out.println("Paragraphs were sorted!\n");
			} break;
			case 2: {
				
				text =SortWordsByLng(text);
				System.out.println("Words were sorted by length!\n");
			} break;
			case 3: {
				
				System.out.println("Enter character: ");
				try {
					
					char chr = s.next().charAt(0);
					text = SortWordsByChar(text, chr);
					System.out.println("Words were sorted by '" + chr + "'!\n");
				} catch(Exception e) {
					
					System.out.println("Invalid input.");
					s = new Scanner(System.in);
				}
			} break;
			case 4: {
				
				System.out.println(text);
			} break;
			}
		}
	}
	
	private static String SortPara(String text) {
		
		String[] parahs = text.split("(?=\\t)");
		String result = "";
		String val_p;
		int[] cnt_snt_arr = new int[parahs.length];
		int cnt = 0;
		int val;
		
		for(int i = 0; i < parahs.length; i++) {
			
			Pattern pattern = Pattern.compile("[а-яА-Я][^.!?]+[.!?]");
			Matcher matcher = pattern.matcher(parahs[i]);
			while (matcher.find()) {
				
				cnt++; 
			}
			cnt_snt_arr[i] = cnt;
			cnt = 0;
		}
		for(int j = 0; j < cnt_snt_arr.length; j++) {
			
			for(int i = 0; i < cnt_snt_arr.length - 1; i++) {
			
				if(cnt_snt_arr[i] < cnt_snt_arr[i + 1]) {
					
					val = cnt_snt_arr[i];
					cnt_snt_arr[i] = cnt_snt_arr[i + 1];
					cnt_snt_arr[i + 1] = val;
					
					val_p = parahs[i];
					parahs[i] = parahs[i + 1];
					parahs[i + 1] = val_p;
				}
			}
		}
		for(int i = 0; i < parahs.length; i++) {
			
			result += parahs[i];
		}
		
		return result;
	}
	
	private static String SortWordsByLng(String text) {
		
		String[] parahs = text.split("\\t");
		String result = "";
		
		for(int i_p = 1; i_p < parahs.length; i_p++) {
			
			String[] sentcs;
			
			result += "\t";
			sentcs = parahs[i_p].split("(?<=[.!?])");
			for(String s : sentcs) {
				
				StringBuilder sentc;
				char sentcs_lst_char;
				
				sentc = new StringBuilder(s);
				sentcs_lst_char = sentc.charAt(sentc.length() - 1);
				sentc.deleteCharAt(sentc.length() - 1);
				s = new String(sentc);
				
				String[] words;
				int[] words_lng;
				
				words = s.split("[\\p{Punct}–\\s]+");
				words_lng = new int[words.length];
				for(int i = 0; i < words.length; i++) {
					
					words_lng[i] = words[i].length();
				}
				
				String val_w;
				int val;
				
				for(int j = 0; j < words.length; j++) {
					
					for(int i = 0; i < words.length - 1; i++) {
					
						if(words_lng[i] < words_lng[i + 1]) {
							
							val = words_lng[i];
							words_lng[i] = words_lng[i + 1];
							words_lng[i + 1] = val;
							
							val_w = words[i];
							words[i] = words[i + 1];
							words[i + 1] = val_w;
						}
					}
				}
				for(int i = 0; i < words.length; i++) {
					
					result += words[i];
					if(i == words.length - 2) {
						
						if(words[words.length - 1].equals("")) {
							
							i++;
						} else {
							
							result += " ";
							i++;
							result += words[i];
						}
					} else {
						
						result += " ";
					}
				}
				result += sentcs_lst_char + " ";
			}
			result += "\n";
		}
		
		return result;
	}
	
	private static String SortWordsByChar(String text, char chr) {
		
		String[] parahs = text.split("\\t");
		String result = "";
		
		for(int i_p = 1; i_p < parahs.length; i_p++) {
			
			String[] sentcs;
			
			result += "\t";
			sentcs = parahs[i_p].split("(?<=[.!?])");
			for(String s : sentcs) {
				
				StringBuilder sentc;
				char sentcs_lst_char;
				
				sentc = new StringBuilder(s);
				sentcs_lst_char = sentc.charAt(sentc.length() - 1);
				sentc.deleteCharAt(sentc.length() - 1);
				s = new String(sentc);
				
				String[] words;
				
				words = s.split("[\\p{Punct}–\\s]+");
				
				String val_w;
				
				for(int j = 0; j < words.length; j++) {
					
					for(int i = 0; i < words.length - 1; i++) {
					
						if(DoNeedToSwap(words[i + 1], words[i], chr)) {
							
							val_w = words[i];
							words[i] = words[i + 1];
							words[i + 1] = val_w;
						}
					}
				}
				for(int i = 0; i < words.length; i++) {
					
					result += words[i];
					if(i == words.length - 2) {
						
						if(words[words.length - 1].equals("")) {
							
							i++;
						} else {
							
							result += " ";
							i++;
							result += words[i];
						}
					} else if(words[i].length() != 0) {
						
						result += " ";
					}
				}
				result += sentcs_lst_char + " ";
			}
			result += "\n";
		}
		
		return result;
	}
	
	private static boolean DoNeedToSwap(String s1, String s2, char chr) {
		
		if(s1.length() == 0 || s2.length() == 0) 
			return false;
		
		char[] s1_ch_arr = s1.toCharArray();
		char[] s2_ch_arr = s2.toCharArray();
		int cnt = 0;
		
		for(int i = 0; i < s1.length(); i++) {
			
			cnt += s1_ch_arr[i] == chr ? 1 : 0;
		}
		for(int i = 0; i < s2.length(); i++) {
			
			cnt -= s2_ch_arr[i] == chr ? 1 : 0;
		}
		if(cnt == 0) {
			
			cnt += Character.toLowerCase(s1_ch_arr[0]) < 
			Character.toLowerCase(s2_ch_arr[0]) ? 1 : 0;
		}
		
		return cnt > 0;
	}
}
