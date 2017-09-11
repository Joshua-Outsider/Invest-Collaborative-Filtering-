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
		// �������0��1���ֱ��ӦŮ�Ժ�����
		if(random.nextInt(2) == 0) this.gender = '0';
		else this.gender = '1';
		// age: ����Ϊ65��
		this.age = random.nextInt(66);
		// marriage�� 0Ϊ����1Ϊ�ѻ�
		this.marriage = random.nextInt(2);
		// families������������
		this.families = random.nextInt(10);
		// education: 0�����м����£�1�����У�2����ѧ��3���о���
		this.education = random.nextInt(4);
		// occupation: 0����ְҵ��1��it��2�����ڣ�3��ҽ�ƣ�4��������5�����ɣ�6���Ļ�/���/��ý��7���������죻8������Ա��
		this.occupation = random.nextInt(9);
		// residence: 0-9��9������
		this.residence = random.nextInt(10);
		// cardsNum : n�����ÿ�
		this.cardsNum = random.nextInt(10);
		// seniority������ʱ�䣨�꣩
		this.seniority = random.nextInt(35);
		// income��0��2k���£�1��2k-5k��2��5k-10k��3��10k-20k��4��20k-50k��5��50k-100k��6��100k����
		this.income = random.nextInt(7);
		// house: ����
		this.house = random.nextInt(5);
		// cars: ����
		this.cars = random.nextInt(5);
		// amount: Ͷ�ʽ��   0��1w��1��2w��3��5w��4��10w��5��20w��6��50w��7��100w
		this.amount = random.nextInt(8);
	}
}
