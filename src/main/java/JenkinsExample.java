
public class JenkinsExample {

	public static void main(String[] args) {
		
	}
	
	public boolean isActionable(String t){
		if(t.equals("checkStatus")){
			return true;
		}else if(t.equals("checkUptime")){
			return true;
		}else if(t.equals("serverConnect")){
			return true;
		}else if(t.equals("serverDisconnect")){
			return true;
		}
		return false;
	}

}
