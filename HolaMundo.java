public class HolaMundo {
	public static void main(String[]args){
		for (int i=0;i<10 ;i++ ) {
		new HolaMundo().mensaje("Line: "+i);			
		}
	}
	public void mensaje(String mensaje){
		System.out.println(mensaje);		
	}
}
