/**
 * 
 */
package com.edu;

/**
 * @author Administrator
 *
 */
/**
 * ������߶���ĳ����Ļ������ܵ����룬�Դ���ķ�ʽȷ������
 * �ù�Լ��ʵ����ı��룬���淶�������
 * ���൱��ʹ��Implements�ؼ�����Լ��������ʵ��û��Ĭ��ʵ�ֵķ�����������д��Ĭ�Ϸ�������
 *
 */
public interface ICircle {
	public abstract double getCircleArea();
	//������һ������(�ɰ汾�Ľӿ�),�����������ķ���
	
	public default double getCircleLength() {
		return 0.00;
	}
	// 1.8�汾�Ժ�Ķ���ӿڵķ�ʽ
}