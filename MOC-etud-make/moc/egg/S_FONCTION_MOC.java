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
public class S_FONCTION_MOC {
LEX_MOC scanner;
  S_FONCTION_MOC() {
    }
  S_FONCTION_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  LEX_MOC att_scanner;
  tds glob_4_t;
  private void regle4() throws Exception {

    //declaration
    S_TYPE_MOC x_3 = new S_TYPE_MOC(scanner,att_eval) ;
    T_MOC x_4 = new T_MOC(scanner ) ;
    T_MOC x_5 = new T_MOC(scanner ) ;
    S_PARFS_MOC x_6 = new S_PARFS_MOC(scanner,att_eval) ;
    T_MOC x_7 = new T_MOC(scanner ) ;
    S_BLOC_MOC x_8 = new S_BLOC_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_4(x_3, x_4, x_6, x_8);
if  (att_eval)      action_tds_4(x_3, x_4, x_6, x_8);
    x_3.analyser() ;
    x_4.analyser(LEX_MOC.token_ident);
    x_5.analyser(LEX_MOC.token_paro);
    x_6.analyser() ;
    x_7.analyser(LEX_MOC.token_parf);
    x_8.analyser() ;
if  (att_eval)      action_gen_4(x_3, x_4, x_6, x_8);
  }
private void action_auto_inh_4(S_TYPE_MOC x_3, T_MOC x_4, S_PARFS_MOC x_6, S_BLOC_MOC x_8) throws Exception {
try {
// instructions
x_6.att_machine=this.att_machine;
x_8.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","FONCTION -> #tds TYPE ident paro PARFS parf BLOC #gen ;"});
}
  }
private void action_gen_4(S_TYPE_MOC x_3, T_MOC x_4, S_PARFS_MOC x_6, S_BLOC_MOC x_8) throws Exception {
try {
// instructions
this.att_code=x_8.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","FONCTION -> #tds TYPE ident paro PARFS parf BLOC #gen ;"});
}
  }
private void action_tds_4(S_TYPE_MOC x_3, T_MOC x_4, S_PARFS_MOC x_6, S_BLOC_MOC x_8) throws Exception {
try {
// instructions
glob_4_t= new TDS(null);
x_3.att_tds=glob_4_t;
x_6.att_tds=glob_4_t;
x_8.att_tds=glob_4_t;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds","FONCTION -> #tds TYPE ident paro PARFS parf BLOC #gen ;"});
}
  }
  public void analyser () throws Exception {
    regle4 () ;
  }
  }
