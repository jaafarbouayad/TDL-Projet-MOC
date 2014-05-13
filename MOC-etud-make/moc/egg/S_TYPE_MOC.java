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
public class S_TYPE_MOC {
LEX_MOC scanner;
  S_TYPE_MOC() {
    }
  S_TYPE_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  TDS att_tds;
  LEX_MOC att_scanner;
  private void regle10() throws Exception {

    //declaration
    S_STYPE_MOC x_3 = new S_STYPE_MOC(scanner,att_eval) ;
    S_REFS_MOC x_4 = new S_REFS_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_type_10(x_3, x_4);
    x_3.analyser() ;
    x_4.analyser() ;
  }
private void action_type_10(S_STYPE_MOC x_3, S_REFS_MOC x_4) throws Exception {
try {
// instructions
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#type","TYPE -> #type STYPE REFS ;"});
}
  }
  public void analyser () throws Exception {
    regle10 () ;
  }
  }
