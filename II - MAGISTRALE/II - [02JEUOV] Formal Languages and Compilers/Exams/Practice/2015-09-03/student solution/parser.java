
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140226
//----------------------------------------------------

import java_cup.runtime.*;
import java.util.*;
import java.io.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b beta 20140226 generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\031\000\002\002\004\000\002\002\007\000\002\003" +
    "\011\000\002\003\011\000\002\004\005\000\002\004\002" +
    "\000\002\005\005\000\002\005\004\000\002\006\006\000" +
    "\002\013\010\000\002\013\006\000\002\007\004\000\002" +
    "\010\004\000\002\010\002\000\002\011\012\000\002\014" +
    "\005\000\002\014\003\000\002\022\004\000\002\022\003" +
    "\000\002\021\006\000\002\020\005\000\002\020\003\000" +
    "\002\017\006\000\002\016\007\000\002\016\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\105\000\010\006\ufffc\007\ufffc\010\ufffc\001\002\000" +
    "\010\006\074\007\073\010\072\001\002\000\004\002\071" +
    "\001\002\000\004\012\007\001\002\000\004\004\012\001" +
    "\002\000\004\004\012\001\002\000\006\004\012\012\025" +
    "\001\002\000\004\013\013\001\002\000\004\004\015\001" +
    "\002\000\004\014\023\001\002\000\004\015\016\001\002" +
    "\000\004\005\017\001\002\000\004\017\020\001\002\000" +
    "\006\014\ufff7\016\021\001\002\000\004\004\015\001\002" +
    "\000\004\014\ufff8\001\002\000\006\004\ufff9\012\ufff9\001" +
    "\002\000\004\004\012\001\002\000\006\004\ufff4\023\ufff4" +
    "\001\002\000\006\004\034\023\032\001\002\000\004\002" +
    "\000\001\002\000\006\004\ufff5\023\ufff5\001\002\000\006" +
    "\002\ufff6\004\034\001\002\000\004\022\054\001\002\000" +
    "\006\002\uffef\004\uffef\001\002\000\004\020\035\001\002" +
    "\000\004\025\037\001\002\000\006\011\uffec\024\uffec\001" +
    "\002\000\004\005\044\001\002\000\006\011\041\024\042" +
    "\001\002\000\006\002\uffee\004\uffee\001\002\000\004\025" +
    "\037\001\002\000\006\011\uffed\024\uffed\001\002\000\004" +
    "\026\045\001\002\000\004\004\047\001\002\000\006\011" +
    "\uffeb\024\uffeb\001\002\000\004\005\050\001\002\000\004" +
    "\027\051\001\002\000\010\011\uffe9\016\052\024\uffe9\001" +
    "\002\000\004\004\047\001\002\000\006\011\uffea\024\uffea" +
    "\001\002\000\004\004\055\001\002\000\004\021\056\001" +
    "\002\000\004\022\057\001\002\000\004\004\061\001\002" +
    "\000\006\016\062\021\063\001\002\000\006\016\ufff1\021" +
    "\ufff1\001\002\000\004\004\065\001\002\000\004\011\064" +
    "\001\002\000\006\004\ufff3\023\ufff3\001\002\000\006\016" +
    "\ufff2\021\ufff2\001\002\000\006\002\ufff0\004\ufff0\001\002" +
    "\000\006\004\ufffb\012\ufffb\001\002\000\006\004\ufffa\012" +
    "\ufffa\001\002\000\004\002\001\001\002\000\004\011\103" +
    "\001\002\000\004\011\076\001\002\000\004\011\075\001" +
    "\002\000\012\006\ufffd\007\ufffd\010\ufffd\012\ufffd\001\002" +
    "\000\006\006\ufffc\010\ufffc\001\002\000\006\006\074\010" +
    "\100\001\002\000\004\011\101\001\002\000\006\006\ufffc" +
    "\012\ufffc\001\002\000\006\006\074\012\uffff\001\002\000" +
    "\006\006\ufffc\007\ufffc\001\002\000\006\006\074\007\105" +
    "\001\002\000\004\011\106\001\002\000\006\006\ufffc\012" +
    "\ufffc\001\002\000\006\006\074\012\ufffe\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\105\000\010\002\004\003\005\004\003\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\005\010\006\007\001\001\000\004\006\067\001\001\000" +
    "\004\006\023\001\001\000\002\001\001\000\004\013\013" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\013\021" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\006" +
    "\066\001\001\000\006\007\026\010\025\001\001\000\010" +
    "\011\027\021\032\022\030\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\021\065\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\017\035\020" +
    "\037\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\017\042\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\016\045\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\016\052\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\014\057\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\004\076" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\004" +
    "\101\001\001\000\002\001\001\000\004\004\103\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\004\106\001" +
    "\001\000\002\001\001" });

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


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {

    table = new HashMap<String, HashMap<String, Integer>>();

    }


    public HashMap<String, HashMap<String, Integer>> table;

    public void report_error(String message, Object info){
        StringBuffer m = new StringBuffer(message);
        if (info instanceof Symbol){
            if(((Symbol)info).left != 1 && ((Symbol)info).right != 1){
                if(((Symbol)info).left != -1 && ((Symbol)info).right != -1){
                    int line = (((Symbol)info).left) + 1;
                    int column = (((Symbol)info).right) + 1;
                    m.append("(line" + line + "column " + column + ")");
                }
            }
            System.err.println(m);
        }
    }

     // Return semantic value of symbol in position (position)
    public Object stack(int position) {
        return (((Symbol)stack.elementAt(tos+position)).value);
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
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
          case 0: // $START ::= prog EOF 
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

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // prog ::= header DIVIDER car_section DIVIDER race_section 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("prog",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // header ::= nt1 TOK2 S nt1 TOK3 S nt1 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // header ::= nt1 TOK3 S nt1 TOK2 S nt1 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // nt1 ::= nt1 TOK1 S 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("nt1",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // nt1 ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("nt1",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // car_section ::= car_section car car 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("car_section",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // car_section ::= car car 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("car_section",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // car ::= QSTRING BO speeds BC 
            {
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int tableft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int tabright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		HashMap<String,Integer> tab = (HashMap<String,Integer>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		parser.table.put(x,tab);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("car",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // speeds ::= QSTRING EQ UINT MEASURE CM speeds 
            {
              HashMap<String,Integer> RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Integer y = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int tableft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tabright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		HashMap<String,Integer> tab = (HashMap<String,Integer>)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
        tab.put(x,y);
        RESULT = tab;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("speeds",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // speeds ::= QSTRING EQ UINT MEASURE 
            {
              HashMap<String,Integer> RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Integer y = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
        HashMap<String,Integer> tab = new HashMap<String,Integer>();
        tab.put(x,y);
        RESULT = tab;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("speeds",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // race_section ::= print_min_max performances 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("race_section",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // print_min_max ::= print_min_max print_func 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("print_min_max",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // print_min_max ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("print_min_max",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // print_func ::= PRINT_WD RO QSTRING RC RO section_names RC S 
            {
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer[] y = (Integer[])((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		
    System.out.println(" " + x + " min > " + y[0] + "; max > " + y[1]);
    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("print_func",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // section_names ::= section_names CM QSTRING 
            {
              Integer[] RESULT =null;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer[] y = (Integer[])((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    Object carname = parser.stack(-5);
    HashMap<String,Integer> current = parser.table.get(carname);
    Integer current_speed = current.get(x);
    if(current_speed < y[0]){
        y[0] = current_speed;
    }
    if(current_speed > y[1]){
        y[1] = current_speed;
    }
    RESULT = y;
    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("section_names",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // section_names ::= QSTRING 
            {
              Integer[] RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
            Integer[] min_max = new Integer[2];
            min_max[0] = 10000;
            min_max[1] = 0;
            Object carname = parser.stack(-3);
            HashMap<String,Integer> current = parser.table.get(carname);
            Integer current_speed = current.get(x);
            if(current_speed < min_max[0]){
                min_max[0] = current_speed;
            }
            if(current_speed > min_max[1]){
                min_max[1] = current_speed;
            }
            RESULT = min_max;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("section_names",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // performances ::= performances performance 
            {
              Object[] RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("performances",16, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // performances ::= performance 
            {
              Object[] RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object[] x = (Object[])((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("performances",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // performance ::= QSTRING ARROW parts S 
            {
              Object[] RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Integer y = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
    System.out.println(" " + x + " TOTAL : " + y);
    Object[] resultval = new Object[2];
    resultval[0] = x;
    resultval[1] = y;
    RESULT = resultval;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("performance",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // parts ::= parts PIPE part 
            {
              Integer RESULT =null;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer y = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer x = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = y + x;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("parts",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // parts ::= part 
            {
              Integer RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer x = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = x;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("parts",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // part ::= PART_WD UINT COL drive_stats 
            {
              Integer RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer x = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		System.out.println("PART" + n + ": " + x + " s");RESULT = x;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("part",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // drive_stats ::= QSTRING UINT M_CHAR CM drive_stats 
            {
              Integer RESULT =null;
		int pnleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int pnright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		String pn = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Integer d = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		
    Object carname = parser.stack(-11);
    if(carname != null){
        HashMap<String,Integer> speed_map = parser.table.get(carname);
        Integer speed = speed_map.get(pn);
        System.out.println(" " + d + " / " + speed);
        RESULT = d / speed;
    }

              CUP$parser$result = parser.getSymbolFactory().newSymbol("drive_stats",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // drive_stats ::= QSTRING UINT M_CHAR 
            {
              Integer RESULT =null;
		int pnleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int pnright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String pn = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Integer d = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
    Object carname = parser.stack(-7); 
    if(carname != null){
        HashMap<String,Integer> speed_map = parser.table.get(carname);
        Integer speed = speed_map.get(pn);
        System.out.println(" " + d + " / " + speed);
        RESULT = d / speed;
    }

              CUP$parser$result = parser.getSymbolFactory().newSymbol("drive_stats",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}