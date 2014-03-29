package com.infixwelcome;

public class StringApi {

	public static void main(String[] args) {
		String a ="Amazing beautiful world";
		
		String b = "bangladesh, is a, beautiful country";
		String c ="amazing";
		//1.char d;
		System.out.println(b.charAt(6));
		//2.Compare To
		System.out.println(a.compareTo(b));
		System.out.println(a.compareToIgnoreCase(c));
		boolean yesOrNo=a. contains("zing");
		//System.out.println(yesOrNo);
		boolean result=a.equals(c);
		//System.out.println(results);
		boolean results=a.equalsIgnoreCase(c);
		StringBuffer x=new StringBuffer("amazing");
		//System.out.println(a.equals(c));
		boolean Results=a.startsWith("ama");		
		//System.out.println(Results);
		byte[]buf=a.getBytes();
		for(int i=0;i<buf.length;i++){
			//System.out.println(buf[i]);
			int ressult=a.length();
			//System.out.println(ressult);
		String b2=b.toLowerCase();
			//System.out.println(b2);
			String c3=b.toUpperCase();
			//System.out.println(c3);
			String x2=a.trim();
			//System.out.println(x2);
			int position=b.indexOf("g");
			//System.out.println(position);
			int positions=b.lastIndexOf("r",20);
			//System.out.println(positions);
			String xy[]=a.split(",");
			for(int A=0;A<xy.length;A++){
				
			}
			//System.out.println(xy['A']);
			String x3=a.replace('i','m' );
			//System.out.println(x3);
			String x4=a.substring(5);
			//System.out.println(x4);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		}
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
