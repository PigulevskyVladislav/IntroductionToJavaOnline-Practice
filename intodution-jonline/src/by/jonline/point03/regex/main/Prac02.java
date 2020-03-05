package by.jonline.point03.regex.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prac02 {

	public static void main(String args[]) {
		
		String text = "<notes>\n\t<note id = \"1\">\n\t\t<to>Вася</to>"
				+ "\n\t\t<from>Света</from>\n\t\t<heading>Напоминание"
				+ "</heading>\n\t\t<body>Позвони мне завтра!</body>"
				+ "\n\t</note>\n\t<note id = \"2\">\n\t\t<to>Петя</to>"
				+ "\n\t\t<from>Маша</from>\n\t\t<heading>Важное напоми"
				+ "нание</heading>\n\t\t<body/>\n\t</note>\n</notes>";
		
		System.out.println("Original XML: \n" + text + "\n");
		try {
			
			Run(text, 0);
		} catch(Exception e) {
			
			System.out.println("XML text isn't correct.");
		}
		
		
	}
	
	private static void Run(String text, int depth) {
		
		text = text.substring(text.indexOf('<'), text.length());
		
		Pattern p = Pattern.compile("<.+?>");
		Matcher m = p.matcher(text);
		String opened_tag = "";
		String cur_node = "";
		int end = 0;
		
		while(m.find()) {
			
			opened_tag = m.group(0);
			cur_node = GetCurrentNodeName(opened_tag);
			end = m.end();
			break;
		}
		//Check if tag was found
		if(!opened_tag.equals("")) 
		{
			
			String closed_tag = "";
			String content = "";
			boolean dtb_have; //Does tag have the body?
			int bgn_ct = opened_tag.length();
			int end_ct = 0;
			
			dtb_have = DoesTheBodyHave(opened_tag);
			if(dtb_have) {
				
				p = Pattern.compile("</(" + cur_node + ")>");
				m = p.matcher(text);
				while(m.find()) {
					
					closed_tag = m.group(0);
					end_ct = m.start();
					end = m.end();
					break;
				}
				content = text.substring(bgn_ct, end_ct);
			} 
			System.out.println("Глубина: " + depth);
			System.out.println("Текущей тег: " + opened_tag + closed_tag);
			//Output of the content
			if(!content.equals("") && dtb_have) {
				
				System.out.println("Содержимое: \n" + content + "\n");
			} else {
				
				System.out.println("Данный тег не содержит тела.");
			}
			//Create recursion
			text = text.substring(end, text.length());
			if(!content.equals("") && !(content.indexOf('<') == -1) ) {
				
				Run(content, depth + 1);
			}
			if(!text.equals("") && !(text.indexOf('<') == -1) ) {
				
				Run(text, depth);
			}
		}
	}
		
	private static String GetCurrentNodeName(String tag) {
		
		Pattern p = Pattern.compile("\\w+");
		Matcher m = p.matcher(tag);
		
		while(m.find()) {
			
			return m.group(0);
		}
		
		return "";
	}
	
	private static boolean DoesTheBodyHave(String tag) {
		
		Pattern p = Pattern.compile("<(.+)/>");
		Matcher m = p.matcher(tag);
		boolean result = true;
		
		while(m.find()) {
			
			result = false;
		}
		
		return result;
	}
}
