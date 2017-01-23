import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;


public class AutomaticTestDriver {
	public static void main(String[] args){
		File f = new File("TS.txt");
		BufferedReader reader = null;
		Stack s = new Stack();
		try{
			reader = new BufferedReader(new FileReader(f));
			String tempString = null;
			while((tempString = reader.readLine())!=null)
			{
				s.add(tempString);
			}
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		for( int i=0; i<s.size()-1; i++)
		{
			String[] tempS = s.elementAt(i).toString().split(" ");
			runTest(tempS);
			System.out.println("***************************************************");

		}
	}
	
	public static void runTest(String[] s)
	{
		GasPump gp = new GasPump();
		System.out.println(s[0]);
		System.out.println("The state befor input:");
		gp.Show_state();
		for(int i=1;i<s.length;i++)
		{
			switch(s[i].toString())
			{
			case "Activate":
				i++;
				float tempR = Float.parseFloat(s[i].toString());
				i++;
				float tempS = Float.parseFloat(s[i].toString());
				i++;
				float tempD = Float.parseFloat(s[i].toString());
				System.out.println("The return value of method Activate: "+ gp.Activate(tempR, tempS, tempD));
				System.out.print("After input:"+ s[i-3]+ " "+s[i-2]+" "+s[i-1]+" "+s[i]+", the state is: ");
				gp.Show_state();
				break;
			case "PayCredit":
				System.out.println("The return value of method PayCredit: "+ gp.PayCredit());
				System.out.print("After input:"+ s[i]+", the state is: ");
				gp.Show_state();
				break;
			case "Reject":
				System.out.println("The return value of method Reject: "+ gp.Reject());
				System.out.print("After input:"+ s[i]+", the state is: ");
				gp.Show_state();
				break;
			case "Cancel":
				System.out.println("The return value of method Cancel: "+ gp.Cancel());
				System.out.print("After input:"+ s[i]+", the state is: ");
				gp.Show_state();
				break;
			case "Approved":
				System.out.println("The return value of method Approved: "+ gp.Approved());
				System.out.print("After input:"+ s[i]+", the state is: ");
				gp.Show_state();
				break;
			case "PayCash":
				i++;
				System.out.println("The return value of method PayCash: "+ gp.PayCash(Float.parseFloat(s[i])));
				System.out.print("After input:"+ s[i-1]+" "+s[i]+", the state is: ");
				gp.Show_state();
				break;
			case "Regular":
				System.out.println("The return value of method Regular: "+ gp.Regular());
				System.out.print("After input:"+ s[i]+", the state is: ");
				gp.Show_state();
				break;
			case "Super":
				System.out.println("The return value of method Super: "+ gp.Super());
				System.out.print("After input:"+ s[i]+", the state is: ");
				gp.Show_state();
				break;
			case "Diesel":
				System.out.println("The return value of method Diesel: "+ gp.Diesel());
				System.out.print("After input:"+ s[i]+", the state is: ");
				gp.Show_state();
				break;
			case "StartPump":
				System.out.println("The return value of method StartPump: "+ gp.StartPump());
				System.out.print("After input:"+ s[i]+", the state is: ");
				gp.Show_state();
				break;
			case "PumpLiter":
				System.out.println("The return value of method PumpLiter: "+ gp.PumpLiter());
				System.out.print("After input:"+ s[i]+", the state is: ");
				gp.Show_state();
				break;
			case "StopPump":
				System.out.println("The return value of method StopPump: "+ gp.StopPump());
				System.out.print("After input:"+ s[i]+", the state is: ");
				gp.Show_state();
				break;
			case "NoReceipt":
				System.out.println("The return value of method NoReceipt: "+ gp.NoReceipt());
				System.out.print("After input:"+ s[i]+", the state is: ");
				gp.Show_state();
				break;
			case "Receipt":
				System.out.println("The return value of method Receipt: "+ gp.Receipt());
				System.out.print("After input:"+ s[i]+", the state is: ");
				gp.Show_state();
				break;
			case "TurnOff":
				System.out.println("The return value of method TurnOff: "+ gp.TurnOff());
				System.out.print("After input:"+ s[i]+", the state is: ");
				gp.Show_state();
				break;
				default:
					System.out.println("Invalid input...");
					break;
				
			}
		}
	}
}
