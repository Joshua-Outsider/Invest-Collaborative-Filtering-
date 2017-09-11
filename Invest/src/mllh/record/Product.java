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
		// timeLimit: TODO:需要再编
		this.timeLimit = random.nextInt();
		// expectedYield： 3%-8%的收益率，类型为float
		this.expectedYield = (float) ((random.nextFloat()*5+3)*0.01);
		// risk：0：无风险；1：低风险；2：较低风险；3：中等风险；4：较高风险；5：高风险
		this.risk = random.nextInt(6);
		// threshold：0：1w；1：2w；3：5w；4：10w；5：50w；6：100w；
		this.threshold = random.nextInt(7);
	}
}
