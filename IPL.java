import java.util.Scanner;
class IPL{
	static Scanner scan=new Scanner(System.in);
	IPLTeams []ipl1=new IPLTeams[0];
public static void main(String []arg){
	
	IPL ip=new IPL();
	String more;
	int n;
	
		
		
		
		do{
		System.out.println("To give team details type give, to display type display");
		String inp=scan.nextLine();
		if(inp.equals("give")){
		    System.out.println("Enter Team details");
			ip.give();}
		else if (inp.equals("display")){
			System.out.println("jhgf");
			ip.display();}
		else
			System.out.println("enter valid input");
			
		
		scan.nextLine();
		System.out.println("you want to give more details type more");
		more=scan.nextLine();
		
      }	while(more.equals("more"));
}

	 void give(){
		System.out.println("Enter number of Teams ");
		int n=scan.nextInt();
		IPLTeams []ipl1=new IPLTeams[n];
	for(int i=0;i<ipl1.length;i++){
		if(i>0){
		scan.nextLine();}
		System.out.println("Enter Team Name ");
		String teamName=scan.nextLine();
		System.out.println("Enter number of Team members ");
		byte numTeamMemeber=scan.nextByte();
		System.out.println("Enter the number of batsman in Team ");
		byte numBatsMan=scan.nextByte();
		System.out.println("Enter the numeber of bollers in Team ");
		byte numBollers=scan.nextByte();
		
		
		IPLTeams ipl=new IPLTeams();
		ipl.setTeamName(teamName);
		ipl.setNumTeamMemeber(numTeamMemeber);
		ipl.setNumBatsMan(numBatsMan);
		ipl.setNumBollers(numBollers);
		
		ipl1[i]=ipl;
		
	  }
	  
	}
	void display(){
		for(int i=0;i<ipl1.length;i++){
		IPLTeams ipl = ipl1[i];
		System.out.println(ipl.getTeamName()+"\t"+ipl.getNumTeamMemeber()+"\t"+ipl.getnumBatsMan()+"\t"+ipl.getNumBollers());
	  }
	}
	


}

class IPLTeams{
	
	private String teamName;
	private byte numTeamMemeber;
	private byte numBatsMan;
	private byte numBollers;
	
	void setTeamName(String teamName){
		this.teamName=teamName;
	}
	void setNumTeamMemeber(byte numTeamMemeber){
		this.numTeamMemeber=numTeamMemeber;
	}
	void setNumBatsMan(byte numBatsMan){
		this.numBatsMan=numBatsMan;
	}
	void setNumBollers(byte numBollers){
		this.numBollers=numBollers;
	}
	
	String getTeamName(){
		return teamName;
	}
	byte getNumTeamMemeber(){
		return numTeamMemeber;
	}
	byte getnumBatsMan(){
		return numBatsMan;
	}
	byte getNumBollers(){
		return numBollers;
	}
}

	
	
	
	
	
	
