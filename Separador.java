public class Main {
  public static void main(String[] args) {
    String s = "1234";
    if(s.length()%2 == 0){
    	String[] lista = new String[s.length()/2];
        lista = Lis(lista, s);
        for(int i = 0; i < lista.length; i++){
        	System.out.println(lista[i]);
        }
    }
    else if(s.length()%2 != 0){
    	s = s + "_";
   		String[] lista = new String[(s.length()/2)];
        lista = Lis(lista, s);
        for(int i = 0; i < lista.length; i++){
        	System.out.println(lista[i]);
        }
        
         
    }
    
  }
  public static String[] Lis(String[] lista, String s){
   		int Posicion = 0;
        for(int i = 0; i < s.length() ; i = i + 2){
         char letras = s.charAt(i);
         String letra = Character.toString(letras);
         letras = s.charAt(i +1);
         String letra2 = Character.toString(letras);
         letra = letra + letra2;
         lista[Posicion] = letra; 
         Posicion++;
        }
        return lista;
  		
  }
  
}
