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
public class S_BLOC_MOC {
LEX_MOC scanner;
  S_BLOC_MOC() {
    }
  S_BLOC_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  TDS att_tds;
  LEX_MOC att_scanner;
  TDS glob_16_t;
  private void regle16() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    S_INSTS_MOC x_4 = new S_INSTS_MOC(scanner,att_eval) ;
    T_MOC x_5 = new T_MOC(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_16(x_4);
    x_2.analyser(LEX_MOC.token_aco);
if  (att_eval)      action_tds_16(x_4);
    x_4.analyser() ;
    x_5.analyser(LEX_MOC.token_acf);
if  (att_eval)      action_gen_16(x_4);
  }
private void action_auto_inh_16(S_INSTS_MOC x_4) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","BLOC -> aco #tds INSTS acf #gen ;"});
}
  }
private void action_gen_16(S_INSTS_MOC x_4) throws Exception {
try {
// instructions
System.out.print(""+"; tds:\n"+glob_16_t);
this.att_code=x_4.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","BLOC -> aco #tds INSTS acf #gen ;"});
}
  }
private void action_tds_16(S_INSTS_MOC x_4) throws Exception {
try {
// instructions
glob_16_t= new TDS(this.att_tds);
x_4.att_tds=glob_16_t;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds","BLOC -> aco #tds INSTS acf #gen ;"});
}
  }
  public void analyser () throws Exception {
    regle16 () ;
  }
  }
