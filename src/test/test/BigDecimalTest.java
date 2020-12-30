package test;

import java.math.BigDecimal;

public class BigDecimalTest {
	public static void main(String[] args) {
		BigDecimal b1=new BigDecimal(1.1);
		BigDecimal b2=new BigDecimal(2.2);
		System.out.println("b1:"+b1);
		System.out.println("b1+b2:"+b1.add(b2));
		BigDecimal b3=new BigDecimal("3.3");
		BigDecimal b4=new BigDecimal("4.4");
		
		System.out.println("b3:"+b3);
		System.out.println("b2+b3:"+b2.add(b3));
		System.out.println("b3+b4:"+b3.add(b4));
		b1.setScale(5,BigDecimal.ROUND_HALF_UP);
		System.out.println("after setscale, b1:"+b1);
		//System.out.println("b1/b2:"+b1.subtract(b2, BigDecimal.ROUND_HALF_UP));
		b2=BigDecimal.valueOf(3.0);
		b1=BigDecimal.ONE;
		b3=b1.divide(b2);
	}
}
