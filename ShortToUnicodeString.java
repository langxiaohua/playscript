public class ShortToUnicodeString extends ArrayInitBaseListener{
	@Override
	public void enterInit(ArrayInitParser.InitContext ctx){
		System.out.print('"');
	}
	
	@Override
	public void exitInit(ArrayInitParser.InitContext ctx){
		System.out.print('"');
	}
}