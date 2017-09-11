package mllh.record;
import java.util.Random;

public class User {
	public int userId;
	public char gender;
	public int age;
	public int marriage;
	public int families;
	public int education;
	public int occupation;
	public int residence;  
	public int cardsNum;
	public int seniority;
	public int income;
	public int house;
	public int cars;
	public int amount;
	private static Random random = new Random();
	public User(int userId){
		this.userId = userId;
		// 随机生成0或1，分别对应女性和男性
		if(random.nextInt(2) == 0) this.gender = '0';
		else this.gender = '1';
		// age: 上限为65岁
		this.age = random.nextInt(66);
		// marriage： 0为单身，1为已婚
		this.marriage = random.nextInt(2);
		// families：家属的人数
		this.families = random.nextInt(10);
		// education: 0：初中及以下；1：高中；2：大学；3：研究生
		this.education = random.nextInt(4);
		// occupation: 0：无职业；1：it；2：金融；3：医疗；4：教育；5：法律；6：文化/广告/传媒；7：生产制造；8：公务员；
		this.occupation = random.nextInt(9);
		// residence: 0-9：9个地区
		this.residence = random.nextInt(10);
		// cardsNum : n张信用卡
		this.cardsNum = random.nextInt(10);
		// seniority：工作时间（年）
		this.seniority = random.nextInt(35);
		// income：0：2k以下；1：2k-5k；2：5k-10k；3：10k-20k；4：20k-50k；5：50k-100k；6：100k以上
		this.income = random.nextInt(7);
		// house: 房产
		this.house = random.nextInt(5);
		// cars: 车产
		this.cars = random.nextInt(5);
		// amount: 投资金额   0：1w；1：2w；3：5w；4：10w；5：20w；6：50w；7：100w
		this.amount = random.nextInt(8);
	}
}
