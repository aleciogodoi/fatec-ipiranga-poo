public class MetodosDeThrowable {
   public static void main( String args[] ) {
      try { 
         primeiroMetodo(); 
      } 

      catch ( Exception exception ) { 
         System.out.printf( "Nome associado � exce��o:  %s\n\n", exception.getMessage());
         exception.printStackTrace(); 
         StackTraceElement[] array = exception.getStackTrace();
         System.out.println( "Rastreamento de pilha por getStackTrace:\n" );
         System.out.println( "Classe\t\t\tArquivo\t\t\t\tLinha\t\tM�todo\n" );
         
         for ( StackTraceElement elemento : array ) {
            System.out.printf( "%s\t", elemento.getClassName());
            System.out.printf( "%s\t\t", elemento.getFileName());
            System.out.printf( "%s\t\t", elemento.getLineNumber());
            System.out.printf( "%s\n", elemento.getMethodName());
         } 
      }
   } 
   public static void primeiroMetodo() throws Exception {
	 segundoMetodo();	
   } 
   public static void segundoMetodo() throws Exception {
      terceiroMetodo();
   } 
   public static void terceiroMetodo() throws Exception {
      throw new Exception( "Exce��o lan�ada no terceiroMetodo" );
   } 
}
