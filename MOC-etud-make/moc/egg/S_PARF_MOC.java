package moc.egg;
import moc.compiler.*;
import moc.tds.*;
import moc.type.*;
import moc.gc.*;
import java.util.*;
import mg.egg.eggc.runtime.libjava.lex.*;
import mg.egg.eggc.runtime.libjava.*;
import mg.egg.eggc.runtime.libjava.messages.*;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
import java.util.Vector;
public class S_PARF_MOC {
LEX_MOC scanner;
  S_PARF_MOC() {
    }
  S_PARF_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  IMachine att_machine;
  LEX_MOC att_scanner;
  private void regle9() throws Exception {

    //declaration
    S_TYPE_MOC x_3 = new S_TYPE_MOC(scanner,att_eval) ;
    T_MOC x_4 = new T_MOC(scanner ) ;
    //appel
if  (att_eval)      action_type_9(x_3, x_4);
    x_3.analyser() ;
    x_4.analyser(LEX_MOC.token_ident);
  }
private void action_type_9(S_TYPE_MOC x_3, T_MOC x_4) throws Exception {
try {
// instructions
x_3.att_tds=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#type","PARF -> #type TYPE ident ;"});
}
  }
  public void analyser () throws Exception {
    regle9 () ;
  }
  }
