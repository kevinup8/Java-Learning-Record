/**
 * 
 */
package com.edu;

/**
 * �����ࣺ���ڱ�д���Դ��� 
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ������̵ı�̷�����
		double dA = MathTool.getCircleArea(3.85); // ʹ�������Ƶ�����ľ�̬����
		System.out.println("�뾶Ϊ 3.85 ��Բ���=" + dA);
		double dL = MathTool.getCircleLength(3.85);
		System.out.println("�뾶Ϊ 3.85 ��Բ�ܳ�=" + dL);
		
		//�������ı�̷�����
		Circle c1 = new Circle();
		c1.setRadius(3.85);
		System.out.println("�뾶Ϊ 3.85 ��Բ���=" + c1.getCircleArea());
		System.out.println("�뾶Ϊ 3.85 ��Բ�ܳ�=" + c1.getCircleLength());	
		
		Circle ball = new Ball(); // ʹ�ø�����������������ʵ�ֶ�̬
		ball.setRadius(5.0);
		//System.out.println("�������ǣ�" + ((Ball)ball).gettiji());
		System.out.println("���ֱ��Բ���=" + ball.getCircleArea());
		System.out.println("���ֱ��Բ�ܳ�=��" + ball.getCircleLength());	
		// ��������ڲ�ͬ����������У�������ͬ�ķ��������ֳ���ͬ����Ϊ�����������
		// ��������ͳ�Ϊ��̬��
		
		
		
		
		
		
		
		
		//ʹ�ýӿ���Ϊ�������ͣ��������������ýӿڵĹ��췽������������
		ICircle c2 = new ICircle() {
			
			//�����ڲ���
			@Override
			public double getCircleArea() {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
		
		
		
		
		
		
		//try...catch�Ĵ���ʵ��
		try {
			System.out.println("�������ǣ�" + ((Ball)c1).gettiji());
		} catch (Exception e) {
			System.out.println("�����쳣�ˣ�");
			e.printStackTrace();
		} finally {
			//�����Ƿ����쳣������Ҫ���Ĺ���д������
			
		}
	}

}