package cn.pet;
/**
 * ������
 * @author Administrator
 *
 */
public class Dog {
	//�ֶ�
	private String name="����";
	private int health=0;
	private int love=0;
	private String strain="�л���԰Ȯ";
	
	
	 public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHealth() {
		return health;
	}

    /**
     * ���ý���ֵ��ȡֵ��ΧΪ0--100
     * @param health
     */
	public void setHealth(int health) {
		if(health>100||health<0){
			this.health=40;  //����ָ����Χ�󣬸�Ĭ��ֵΪ40
			System.out.println("����ֵ����ָ����Χ�󣬸�Ĭ��ֵΪ40");
		}else{
			this.health = health;
		}
		
	}


	public int getLove() {
		return love;
	}


	public void setLove(int love) {
		this.love = love;
	}


	public String getStrain() {
		return strain;
	}


	public void setStrain(String strain) {
		this.strain = strain;
	}


	//��סalt+s
	/**
	 * ���������Ϣ�ķ���
	 */
	public void print(){
		System.out.println("������԰ף��ҵ������ǣ�"+this.name+"�ҵĽ���ֵ�ǣ�"+this.health
				+"�����˵����ܶ���:"+this.love+"����һֻ"+this.strain);
		//syso   alt+/
	}
	
	
	/**
	 * ����޲ι��췽��
	 */
	public Dog(){
		this("����");  //ͨ��this���ù��췽��ʱ�������ǵ�һ������
		System.out.println("ִ��Dog���޲ι��췽��");
		
		
	}
	
	/**
	 * ���εĹ��췽��
	 */
	public Dog(String name){
		/*this();   //�����޲εĹ��췽��
*/		System.out.println("ִ��Dog�����name�����Ĺ��췽��");
	}

}
