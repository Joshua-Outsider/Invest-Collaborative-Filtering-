package mllh.record;

import java.util.Random;

public class Product {
	public int productId;
	public int timeLimit;
	public float expectedYield;
	public int risk;
	public int threshold;
	private static Random random = new Random();
	public Product(int productId){
		this.productId = productId;
		// timeLimit: TODO:��Ҫ�ٱ�
		this.timeLimit = random.nextInt();
		// expectedYield�� 3%-8%�������ʣ�����Ϊfloat
		this.expectedYield = (float) ((random.nextFloat()*5+3)*0.01);
		// risk��0���޷��գ�1���ͷ��գ�2���ϵͷ��գ�3���еȷ��գ�4���ϸ߷��գ�5���߷���
		this.risk = random.nextInt(6);
		// threshold��0��1w��1��2w��3��5w��4��10w��5��50w��6��100w��
		this.threshold = random.nextInt(7);
	}
}
