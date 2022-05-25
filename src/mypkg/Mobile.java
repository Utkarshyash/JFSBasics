package mypkg;

public class Mobile {
	int batteryInMah;
	String modelName;
	String mobileType;
	String chargerType;
	int sim;
	int cameraPixels;
	int camera;
	Mobile(String modelName)//initialize object by only modelName
	{
	this.modelName=modelName;
	}
	
	Mobile(String modelNmae,String mobileType,int sim){
		
		this.mobileType=mobileType;
		this.modelName=modelName;
		this.sim=sim;
	}
    Mobile(String modelNmae,String mobileType,int sim,int batteryInMah,String ChargerType,int camera,int cameraPixel){
		
		this.modelName=modelName;
		this.mobileType=mobileType;
		this.batteryInMah=batteryInMah;
		this.chargerType=chargerType;
		this.camera=camera;
		this.cameraPixels=cameraPixels;
	}
    public void texting() {
    	System.out.println(this.modelName + " Texting Someone");
    }
	
	public static void calling()//
	{
		System.out.println("Calling Someone");
	}

	public static void main(String[] args) {
		Mobile m1=new Mobile("miui4302");//object creation
		Mobile m2 = new Mobile("x2eys","iphone",1);
			System.out.println(m1.modelName +" "+m2.sim);
			m1.texting();
			
     Mobile.calling();
	}
}
