package com.ita.training.java.string;

public class StringBufferDemo {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("abc");
		
		System.out.println(sb + " and the hashcode " + sb.hashCode());
		
		sb.append("pqr");
		System.out.println(sb + " and the hashcode " + sb.hashCode());
		
//		
//		sb.charAt(index)
//		sb.indexOf(str)
//		sb.lastIndexOf(str)
		sb.insert(0, "USN:");
		System.out.println(sb + " and the hashcode " + sb.hashCode());
		sb.replace(0, 4, "REG_NUM : ");
		System.out.println(sb + " and the hashcode " + sb.hashCode());
		
		sb.delete(0, 4);
		System.out.println(sb + " and the hashcode " + sb.hashCode());
		
		sb.reverse();
		System.out.println(sb);
		
		
	}

}
