
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Jan 29 10:34:25 CST 2013
//----------------------------------------------------

package pruebaxml;

import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Jan 29 10:34:25 CST 2013
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\030\000\002\002\004\000\002\002\005\000\002\014" +
    "\006\000\002\014\005\000\002\004\004\000\002\005\004" +
    "\000\002\006\005\000\002\006\004\000\002\006\004\000" +
    "\002\006\003\000\002\007\004\000\002\015\002\000\002" +
    "\010\006\000\002\016\002\000\002\010\005\000\002\011" +
    "\006\000\002\011\005\000\002\012\006\000\002\012\005" +
    "\000\002\003\004\000\002\003\005\000\002\003\003\000" +
    "\002\013\005\000\002\013\002" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\060\000\004\010\004\001\002\000\004\004\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\001\001\002" +
    "\000\004\006\061\001\002\000\006\004\011\011\014\001" +
    "\002\000\004\006\047\001\002\000\006\002\000\011\014" +
    "\001\002\000\004\012\017\001\002\000\004\004\007\001" +
    "\002\000\006\004\011\012\ufffd\001\002\000\004\015\035" +
    "\001\002\000\004\013\021\001\002\000\006\013\021\015" +
    "\ufffc\001\002\000\004\004\007\001\002\000\014\002\ufff8" +
    "\011\ufff8\013\ufff8\014\023\015\ufff8\001\002\000\004\004" +
    "\ufff4\001\002\000\014\002\ufff9\011\ufff9\013\ufff9\014\025" +
    "\015\ufff9\001\002\000\004\004\ufff6\001\002\000\004\004" +
    "\007\001\002\000\016\002\ufff5\004\011\011\ufff5\013\ufff5" +
    "\014\ufff5\015\ufff5\001\002\000\004\004\007\001\002\000" +
    "\016\002\ufff3\004\011\011\ufff3\013\ufff3\014\ufff3\015\ufff3" +
    "\001\002\000\016\002\ufff7\004\011\011\ufff7\013\ufff7\014" +
    "\ufff7\015\ufff7\001\002\000\014\002\ufffa\011\ufffa\013\ufffa" +
    "\014\023\015\ufffa\001\002\000\014\002\ufffb\011\ufffb\013" +
    "\ufffb\014\025\015\ufffb\001\002\000\004\004\007\001\002" +
    "\000\010\002\ufffe\011\ufffe\015\037\001\002\000\004\004" +
    "\007\001\002\000\006\004\011\013\021\001\002\000\012" +
    "\002\ufff2\011\ufff2\013\021\015\ufff2\001\002\000\006\004" +
    "\011\013\021\001\002\000\012\002\ufff1\011\ufff1\013\021" +
    "\015\ufff1\001\002\000\004\012\017\001\002\000\004\015" +
    "\035\001\002\000\010\002\uffff\011\uffff\015\037\001\002" +
    "\000\006\004\051\005\050\001\002\000\022\002\uffec\004" +
    "\uffec\007\057\011\uffec\012\uffec\013\uffec\014\uffec\015\uffec" +
    "\001\002\000\022\002\uffea\004\uffea\006\054\011\uffea\012" +
    "\uffea\013\uffea\014\uffea\015\uffea\001\002\000\020\002\ufff0" +
    "\004\ufff0\011\ufff0\012\ufff0\013\ufff0\014\ufff0\015\ufff0\001" +
    "\002\000\020\002\uffee\004\uffee\011\uffee\012\uffee\013\uffee" +
    "\014\uffee\015\uffee\001\002\000\004\004\055\001\002\000" +
    "\022\002\uffea\004\uffea\006\054\011\uffea\012\uffea\013\uffea" +
    "\014\uffea\015\uffea\001\002\000\020\002\uffeb\004\uffeb\011" +
    "\uffeb\012\uffeb\013\uffeb\014\uffeb\015\uffeb\001\002\000\004" +
    "\005\060\001\002\000\020\002\uffed\004\uffed\011\uffed\012" +
    "\uffed\013\uffed\014\uffed\015\uffed\001\002\000\006\004\051" +
    "\005\050\001\002\000\020\002\uffef\004\uffef\011\uffef\012" +
    "\uffef\013\uffef\014\uffef\015\uffef\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\060\000\004\002\004\001\001\000\004\012\007\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\004\012\014\011\001\001\000\002\001\001\000" +
    "\004\004\043\001\001\000\004\005\015\001\001\000\004" +
    "\012\014\001\001\000\002\001\001\000\004\011\035\001" +
    "\001\000\006\006\017\007\021\001\001\000\004\007\032" +
    "\001\001\000\004\012\031\001\001\000\004\010\023\001" +
    "\001\000\004\016\027\001\001\000\002\001\001\000\004" +
    "\015\025\001\001\000\004\012\026\001\001\000\002\001" +
    "\001\000\004\012\030\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\010\033\001\001\000\002\001\001\000" +
    "\004\012\041\001\001\000\002\001\001\000\004\012\037" +
    "\001\001\000\006\006\040\007\021\001\001\000\004\007" +
    "\032\001\001\000\006\006\042\007\021\001\001\000\004" +
    "\007\032\001\001\000\004\005\044\001\001\000\004\011" +
    "\045\001\001\000\002\001\001\000\004\003\051\001\001" +
    "\000\002\001\001\000\004\013\052\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\013\055" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\003\061\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


    
	 
	public void report_error(String message, Object err){  
		String errorchar = ((Yytoken)(((Symbol)err).value)).val;
		String errorlinea = ((Yytoken)(((Symbol)err).value)).linea;
		String errorcol = ((Yytoken)(((Symbol)err).value)).columna;
		int a = Integer.parseInt(errorlinea)+1;          	  
		System.out.println("Error Sintactico: " + errorchar
					+ " en la linea " + errorlinea
					+ " en la columna " + errorcol);
	}

        
        

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {


	String finalXML = "";
        int valueset = 0;
        String strvalueset = "";
        String value = "";
        int note = 0;

  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // extra ::= 
            {
              String RESULT =null;
		 RESULT = ""; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("extra",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // extra ::= IGUAL ID extra 
            {
              String RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Yytoken val1 = (Yytoken)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int val10left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int val10right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String val10 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = "= " + val1.val + val10; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("extra",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // palabra ::= NUM 
            {
              String RESULT =null;
		int val6left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int val6right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Yytoken val6 = (Yytoken)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=val6.val; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("palabra",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // palabra ::= NUM DOSPUNTOS NUM 
            {
              String RESULT =null;
		int val2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int val2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Yytoken val2 = (Yytoken)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int val3left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int val3right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Yytoken val3 = (Yytoken)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = val2.val + ":" + val3.val; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("palabra",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // palabra ::= ID extra 
            {
              String RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Yytoken val1 = (Yytoken)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int val2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int val2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String val2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = val1.val + val2; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("palabra",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // parametros ::= ID IGUAL palabra 
            {
              String RESULT =null;
		int val3left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int val3right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Yytoken val3 = (Yytoken)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int val4left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int val4right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String val4 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		//val4 = val4.replace("'","");
                                    //val4 = val4.replace(String.valueOf(val4.toString().charAt(val4.length()-1)),"");
                                    if(val3.val.equals("Value") && val4.contains("#sep#")){
                                    String a = "";
                                    if(valueset == 0){valueset += 1;a=" >";}
                                    String[] pr = val4.split("#sep#"); 
                                    RESULT = a + "\n\t\t\t\t\t<VALUE Label=\""+pr[1]+"\">"
					+pr[0]+
                                    "</VALUE" ;strvalueset = val4;
                                    }else
                                    if(val3.val.equals("Value") && val4.contains(":")){
                                    String a = "";
                                    if(valueset == 0){valueset += 1;a=" >";}
                                    String[] pr = val4.split(":");
                                  //  if(pr.length() == 2){
                                    RESULT = a + "\n\t\t\t\t\t<VALUE Label=\"Value\">"
					+pr[0]+":"+pr[1]+
                                    "</VALUE>" ;strvalueset = pr[0]+":"+pr[1];
                                   // }
                                    }else
                                    if(val3.val.equals("Value") && val4.trim().equals("")){
                                    String a = "";
                                    if(valueset == 0){valueset += 1;a=" >";}
                                    RESULT = a + "\n\t\t\t\t\t<VALUE Label=\"Value\">"+val4+"</VALUE>" ;strvalueset = val4;
                                    }else
                                    if(valueset == 1 && val4.contains("Special")){
                                    //valueset -= 1;
                                        if(strvalueset.contains("#sep#")){
                                        String[] pr = strvalueset.split("#sep#");
//                                        RESULT = "\n\t\t\t\t\t<VALUE Label=\""+pr[1]+"\" Name=\""+val4+"\">"+pr[0]+"</VALUE>"; viejo
                                        RESULT = " Label=\""+val4 + "\" ";
                                        }else
                                        RESULT = "\n\t\t\t\t\t<VALUE Label=\"Value\" Name=\""+val4+"\">"+strvalueset+"</VALUE>";
                                        }else
                                        if(val3.val.equals("Value") && val4.matches("-?\\d+(\\.\\d+)?")){
                                        String a = "";
                                        if(valueset == 0){valueset += 1;a=" >";}
                                        RESULT = a + "\n\t\t\t\t\t<VALUE Label=\"Value\">"+val4+"</VALUE>" ;strvalueset = val4;
                                    }else{
                                    val4 = val4.replace("&apos;","");
                                     if(val3.val.equals("Value") && val4.trim().equals("")){
                                    String a = "";
                                    if(valueset == 0){valueset += 1;a=" >";}
                                    RESULT = a + "\n\t\t\t\t\t<VALUE Label=\"Value\">"+"&apos;"+val4+"&apos;"+"</VALUE>" ;strvalueset = val4;
                                    }
                                    else
                                    RESULT = val3.val + "=\"" + val4 +"\" "; }
                                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("parametros",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // parametros ::= parametros ID IGUAL palabra 
            {
              String RESULT =null;
		int val3left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int val3right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String val3 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int val1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Yytoken val1 = (Yytoken)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int val2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int val2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String val2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		//val2 = val2.replace("&apos;","");
                                    //val2 = val2.replace(String.valueOf(val2.toString().charAt(val2.length()-1)),"");
                                    if(val1.val.equals("Value") && val2.contains("#sep#")){
                                        if(valueset == 0){valueset += 1;val3 = val3+ " >";}
                                        String[] pr = val2.split("#sep#"); 
                                        RESULT = val3 + "\n\t\t\t\t\t<VALUE Label=\""+pr[1]+"\">"
                                            +pr[0]+
                                        "</VALUE>" ; strvalueset = val2;
                                    }else
                                    if(val1.val.equals("Value") && val2.contains(":")){
                                        if(valueset == 0){valueset += 1;val3 = val3+ " >";}
                                        String[] pr = val2.split(":");
                                       // if(pr.length() == 2){
                                        RESULT = val3 + "\n\t\t\t\t\t<VALUE Label=\"Value\">"
                                            +pr[0]+":"+pr[1]+
                                        "</VALUE>" ;strvalueset = pr[0]+":"+pr[1];
                                       // }
                                    }else
                                    if(val1.val.equals("Value") && val2.trim().equals("")){
                                        String a = "";
                                        if(valueset == 0){valueset += 1;a=" >";}
                                        RESULT = val3 + a + "\n\t\t\t\t\t<VALUE Label=\"Value\">"+val2+"</VALUE>" ;strvalueset = val2;
                                    }else
                                    if(valueset == 1 && val2.contains("Special")){
                                    //valueset -= 1;
                                        if(strvalueset.contains("#sep#")){
                                            String[] pr = strvalueset.split("#sep#");
                                           // RESULT = val3 + "\n\t\t\t\t\t<VALUE Label=\""+pr[1]+"\" Name=\""+val2+"\">"+pr[0]+"</VALUE>";
                                            val3 = val3.replace("\n\t\t\t\t\t<VALUE Label=\""+pr[1]+"\">"+pr[0]+"</VALUE>", "\n\t\t\t\t\t<VALUE Label=\""+pr[1]+"\" Name=\""+val2+"\">"+pr[0]+"</VALUE>");
                                            RESULT = val3;
                                        }else{
                                            //RESULT = val3 + "\n\t\t\t\t\t<VALUE Label=\"Value\" Name=\""+val2+"\">"+strvalueset+"</VALUE>";
                                            val3 = val3.replace("\n\t\t\t\t\t<VALUE Label=\"Value\">"+strvalueset+"</VALUE>", "\n\t\t\t\t\t<VALUE Label=\"Value\" Name=\""+val2+"\">"+strvalueset+"</VALUE>");
                                            RESULT = val3;
                                        }
                                    }else
                                        if(val1.val.equals("Value") && val2.matches("-?\\d+(\\.\\d+)?")){
                                            String a = "";
                                            if(valueset == 0){valueset += 1;a=" >";}
                                            RESULT = val3 + a + "\n\t\t\t\t\t<VALUE Label=\"Value\">"+val2+"</VALUE>" ;strvalueset = val2;
                                    }else
                                    if(valueset == 1 && val1.val.contains("Note")){
                                    //valueset -= 1;
                                        if(strvalueset.contains("#sep#")){
                                            String[] pr = strvalueset.split("#sep#");
                                           // RESULT = val3 + "\n\t\t\t\t\t<VALUE Label=\""+pr[1]+"\" Name=\""+val2+"\">"+pr[0]+"</VALUE>";
                                            val3 = val3.replace("\n\t\t\t\t\t<VALUE Label=\""+pr[1]+"\">"+pr[0]+"</VALUE>", "\n\t\t\t\t\t<VALUE Label=\""+pr[1]+"\" Note=\""+val2+"\">"+pr[0]+"</VALUE>");
                                            RESULT = val3;
                                        }else{
                                            //RESULT = val3 + "\n\t\t\t\t\t<VALUE Label=\"Value\" Name=\""+val2+"\">"+strvalueset+"</VALUE>";
                                            val3 = val3.replace("\n\t\t\t\t\t<VALUE Label=\"Value\">"+strvalueset+"</VALUE>", "\n\t\t\t\t\t<VALUE Label=\"Value\" Note=\""+val2+"\">"+strvalueset+"</VALUE>");
                                            RESULT = val3;
                                        }
                                    }else
                                    if(val1.val.equals("Value") && val2.matches("-?\\d+(\\.\\d+)?")){
                                        String a = "";
                                        if(valueset == 0){valueset += 1;a=" >";}
                                        RESULT = val3 + a + "\n\t\t\t\t\t<VALUE Label=\"Value\">"+val2+"</VALUE>" ;strvalueset = val2;
                                    }else{
                                        val2 = val2.replace("&apos;","");
                                        if(val1.val.equals("Value") && val2.trim().equals("")){
                                            String a = "";
                                            if(valueset == 0){valueset += 1;a=" >";}
                                            RESULT = val3 + a + "\n\t\t\t\t\t<VALUE Label=\"Value\">"+"&apos;"+val2+"&apos;"+"</VALUE>" ;strvalueset = val2;
                                        }
                                        else
                                        RESULT = val3 + val1.val + "=\"" + val2 +"\" "; 
                                    } 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("parametros",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // record ::= RECORD parametros idcontenido 
            {
              String RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String val1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int val2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int val2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String val2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = "\n\t\t<RECORD " + val1 +">\n"+ val2 + "\n\t\t</RECORD>\n";
              CUP$parser$result = parser.getSymbolFactory().newSymbol("record",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // record ::= record RECORD parametros idcontenido 
            {
              String RESULT =null;
		int val10left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int val10right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String val10 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int val1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String val1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int val2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int val2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String val2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = val10 + "\n\t\t<RECORD " + val1 +">\n"+ val2 + "\n\t\t</RECORD>\n";
              CUP$parser$result = parser.getSymbolFactory().newSymbol("record",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // valueset ::= VALUESET NT$1 parametros 
            {
              String RESULT =null;
              // propagate RESULT from NT$1
                RESULT = (String) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int val1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String val1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = "\n\t\t\t\t<VALUESET " + val1 + "\n\t\t\t\t</VALUESET>";
              CUP$parser$result = parser.getSymbolFactory().newSymbol("valueset",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // NT$1 ::= 
            {
              String RESULT =null;
valueset = 0;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$1",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // valueset ::= valueset VALUESET NT$0 parametros 
            {
              String RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (String) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int val10left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int val10right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String val10 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int val1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String val1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = val10 + "\n\t\t\t\t<VALUESET " + val1 + "\n\t\t\t\t</VALUESET>";
              CUP$parser$result = parser.getSymbolFactory().newSymbol("valueset",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // NT$0 ::= 
            {
              String RESULT =null;
		int val10left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int val10right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String val10 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
valueset = 0;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // items ::= ITEMS parametros 
            {
              String RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String val1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = "\n\t\t\t<ITEM " + val1 +">";
              CUP$parser$result = parser.getSymbolFactory().newSymbol("items",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // idcontenido ::= items 
            {
              String RESULT =null;
		int val6left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int val6right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String val6 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = val6 + "\n\t\t\t</ITEM>\n"; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("idcontenido",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // idcontenido ::= items valueset 
            {
              String RESULT =null;
		int val5left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int val5right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String val5 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int val7left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int val7right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String val7 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = val5 + val7+ "\n\t\t\t</ITEM>\n"; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("idcontenido",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // idcontenido ::= idcontenido items 
            {
              String RESULT =null;
		int val8left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int val8right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String val8 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int val9left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int val9right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String val9 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = val8 + val9 + "\n\t\t\t</ITEM>\n"; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("idcontenido",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // idcontenido ::= idcontenido items valueset 
            {
              String RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String val1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int val2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int val2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String val2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int val3left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int val3right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String val3 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = val1 + val2 + val3 + "\n\t\t\t</ITEM>\n"; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("idcontenido",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // iditems ::= IDITEMS idcontenido 
            {
              String RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String val1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = "\n\t\t<IDITEMS>\n" + val1 + "\n\t\t</IDITEMS>\n"; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("iditems",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // level ::= LEVEL parametros 
            {
              String RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String val1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = "\n\n\t<LEVEL " + val1 +">\n" ; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("level",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // sig ::= level iditems record 
            {
              String RESULT =null;
		int val2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int val2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String val2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int val3left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int val3right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String val3 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int val4left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int val4right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String val4 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = val2 + val3 + val4 + "\n\t</LEVEL>\n";
              CUP$parser$result = parser.getSymbolFactory().newSymbol("sig",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // sig ::= sig level iditems record 
            {
              String RESULT =null;
		int val10left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int val10right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String val10 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int val2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int val2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String val2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int val3left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int val3right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String val3 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int val4left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int val4right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String val4 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = val10 + val2 + val3 + val4 + "\n\t</LEVEL>\n";
              CUP$parser$result = parser.getSymbolFactory().newSymbol("sig",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // inicio ::= DICTIONARY parametros sig 
            {
              Object RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String val1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int val10left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int val10right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String val10 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		finalXML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n <DICTIONARY " + val1 +">" + val10 + "\n</DICTIONARY>";
              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicio EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

