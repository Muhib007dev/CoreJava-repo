package findBerthLocationFromSeatNo;

public class TestLocate {

	public static void main(String[] args) {
		new Locate() {
			
			@Override
			public void locate() {
				int l=1;
				int m=2;
				int u=3;
				int l2=4;
				int m2=5;
				int u2=6;
				int sl=7;
				int su=8;
				int c0=1;
				int c1=8;
				
				
				int num = scan.nextInt();
				
				
				for(int i=0;i<=9;i++)
				{
					if(num==l)
					{
						System.out.println("Lower Berth");
						break;
					}
					else 
						l=l+8;
				}
				
				for(int i=0;i<=9;i++)
				{
					if(num==m)
					{
						System.out.println("Middle Berth");
						break;
					}
					else 
						m=m+8;
				}
				
				for(int i=0;i<=9;i++)
				{
					if(num==u)
					{
						System.out.println("Upper Berth");
						break;
					}
					else 
						u=u+8;
				}
				
				for(int i=0;i<=9;i++)
				{
					if(num==l2)
					{
						System.out.println("Lower Berth");
						break;
					}
					else 
						l2=l2+8;
				}
				
				for(int i=0;i<=9;i++)
				{
					if(num==m2)
					{
						System.out.println("Middle Berth");
						break;
					}
					else 
						m2=m2+8;
				}
				
				for(int i=0;i<=9;i++)
				{
					if(num==u2)
					{
						System.out.println("Upper Berth");
						break;
					}
					else 
						u2=u2+8;
				}
				
				for(int i=0;i<=9;i++)
				{
					if(num==sl)
					{
						System.out.println("Side Lower Berth");
						break;
					}
					else 
						sl=sl+8;
				}
				
				for(int i=0;i<=9;i++)
				{
					if(num==su)
					{
						System.out.println("Side Upper Berth");
						break;
					}
					else 
						su=su+8;
				}
						scan.close();
						
					if(num>=c0 && num<=c1)
					{
						System.out.println("1st compartment. First gate is closer to the seat.");
						c0=0;
						c1=0;
					}
					
					else{ 
						c0=c0+8;
						c1=c1+8;
					}
					
					if(num>=c0 && num<=c1)
					{
						System.out.println("2nd compartment. First gate is closer to the seat.");
						c0=0;
						c1=0;
						
					}
					
					else{ 
						c0=c0+8;
						c1=c1+8;
					}
					
					if(num>=c0 && num<=c1)
					{
						System.out.println("3rd compartment. First gate is closer to the seat.");
						c0=0;
						c1=0;
					}
					
					else{ 
						c0=c0+8;
						c1=c1+8;
						
					}
					
					if(num>=c0 && num<=c1)
					{
						System.out.println("4th compartment. First gate is closer to the seat.");
						c0=0;
						c1=0;
					}
					
					else{ 
						c0=c0+8;
						c1=c1+8;
					}
					
					if(num>=c0 && num<=c1)
					{
						System.out.println("5th compartment. Second gate is closer to the seat.");
						c0=0;
						c1=0;
					}
					
					else{ 
						c0=c0+8;
						c1=c1+8;
					}
					
					if(num>=c0 && num<=c1)
					{
						System.out.println("6th compartment. Second gate is closer to the seat.");
						c0=0;
						c1=0;
					}
					
					else{ 
						c0=c0+8;
						c1=c1+8;
					}
					
					if(num>=c0 && num<=c1)
					{
						System.out.println("7th compartment. Second gate is closer to the seat.");
						c0=0;
						c1=0;
					}
					
					else{ 
						c0=c0+8;
						c1=c1+8;
					}
					
					if(num>=c0 && num<=c1)
					{
						System.out.println("8th compartment. Second gate is closer to the seat.");
						c0=0;
						c1=0;
					}
					
					else{ 
						c0=0;
						c1=0;
						}
					
					if(num>72)
					{
						System.out.println("Invalid Seat no.");
					}
					
			}
			
			
		}.locate();

	}

}
