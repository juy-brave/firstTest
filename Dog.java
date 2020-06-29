package cn.pet;
/**
 * 狗狗类
 * @author Administrator
 *
 */
public class Dog {
	//字段
	private String name="无名";
	private int health=0;
	private int love=0;
	private String strain="中华田园犬";
	
	
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
     * 设置健康值的取值范围为0--100
     * @param health
     */
	public void setHealth(int health) {
		if(health>100||health<0){
			this.health=40;  //超出指定范围后，给默认值为40
			System.out.println("健康值超出指定范围后，给默认值为40");
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


	//按住alt+s
	/**
	 * 输出狗狗信息的方法
	 */
	public void print(){
		System.out.println("宠物的自白：我的名字是："+this.name+"我的健康值是："+this.health
				+"和主人的亲密度是:"+this.love+"我是一只"+this.strain);
		//syso   alt+/
	}
	
	
	/**
	 * 添加无参构造方法
	 */
	public Dog(){
		this("二哈");  //通过this调用构造方法时、必须是第一条代码
		System.out.println("执行Dog类无参构造方法");
		
		
	}
	
	/**
	 * 带参的构造方法
	 */
	public Dog(String name){
		/*this();   //调用无参的构造方法
*/		System.out.println("执行Dog类带有name参数的构造方法");
	}

}
